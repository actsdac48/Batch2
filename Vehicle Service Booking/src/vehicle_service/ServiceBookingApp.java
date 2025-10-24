package vehicle_service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import exceptions.BookingNotFoundException;
import exceptions.InvalidBookingException;

import java.util.Date;

public class ServiceBookingApp {

    private static GarageManager manager;
    private static Scanner scanner;
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) {
        manager = new GarageManager();
        scanner = new Scanner(System.in);


        boolean running = true;
        while (running) {
            displayMenu();
            try {
                System.out.print("Enter your choice: ");
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) continue;
                
                int choice = Integer.parseInt(input);
                System.out.println("----------------------------------------");

                switch (choice) {
                    case 1:
                        addNewBooking();
                        break;
                    case 2:
                        removeBooking();
                        break;
                    case 3:
                        listAllBookings();
                        break;
                    case 4:
                        manager.displayBookingSummary(manager.listBookings());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number for your choice.");
            }

        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Add New Booking");
        System.out.println("2. Remove Booking by ID");
        System.out.println("3. List All Bookings (Sorted by Date)");
        System.out.println("4. Display Booking Summary");
        System.out.println("5. Exit ");
    }

    private static void addNewBooking() {
        try {
            System.out.println("--- Add New Booking ---");
            
            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine().trim();

            System.out.print("Vehicle Name: ");
            String vehicleName = scanner.nextLine().trim();

            System.out.println("Available Service Types: REGULAR, REPAIR, CLEANING");
            System.out.print("Service Type: ");
            ServiceType serviceType = ServiceType.valueOf(scanner.nextLine().trim().toUpperCase());

            System.out.print("Service Date (DD-MM-YYYY): ");
            String dateString = scanner.nextLine().trim();
            Date serviceDate = DATE_FORMAT.parse(dateString);

            Booking newBooking = new VehicleServiceBooking(customerName, vehicleName, serviceType, serviceDate);
            manager.addBooking(newBooking);

        } catch (IllegalArgumentException e) {
            System.err.println("Input Error: Invalid service type entered. Please use REGULAR, REPAIR, or CLEANING.");
        } catch (ParseException e) {
            System.err.println("Input Error: Invalid date format. Please use DD-MM-YYYY .");
        } catch (InvalidBookingException e) {
            System.err.println("Booking Validation Failed: " + e.getMessage());
        }
    }

    private static void removeBooking() {
        try {
            System.out.println("--- Remove Booking ---");
            System.out.print("Enter Booking ID to remove: ");
            int id = Integer.parseInt(scanner.nextLine().trim());
            manager.removeBooking(id);
        } catch (NumberFormatException e) {
            System.err.println("Input Error: Please enter a valid number for the Booking ID.");
        } catch (BookingNotFoundException e) {
            System.err.println("Removal Error: " + e.getMessage());
        }
    }

    private static void listAllBookings() {
        List<Booking> bookings = manager.listBookings();

        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        System.out.println("--- All Bookings (Sorted by Service Date) ---");
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }
}