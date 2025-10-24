package vehicle_service;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import exceptions.BookingNotFoundException;
import exceptions.InvalidBookingException;

public interface GarageService {
    void addBooking(Booking b) throws InvalidBookingException;
    void removeBooking(int id) throws BookingNotFoundException;
    List<Booking> listBookings();

    
    default void displayBookingSummary(List<Booking> bookings) {
        System.out.println("\n--- Booking Summary ---");
        System.out.println("Total Bookings: " + bookings.size());

        Map<ServiceType, Long> counts = bookings.stream()
                .collect(Collectors.groupingBy(Booking::getServiceType, Collectors.counting()));

        System.out.println("Bookings by Service Type:");
        for (ServiceType type : ServiceType.values()) {
            System.out.println("- " + type + ": " + counts.getOrDefault(type, 0L));
        }
        System.out.println("-----------------------\n");
    }
}