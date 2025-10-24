package vehicle_service;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Booking {
    private static int nextId = 1000;
    private int bookingId;
    private String customerName;
    private String vehicleName;
    private ServiceType serviceType;
    private Date serviceDate;

    public Booking(String customerName, String vehicleName, ServiceType serviceType, Date serviceDate) {
        this.bookingId = nextId++;
        this.customerName = customerName;
        this.vehicleName = vehicleName;
        this.serviceType = serviceType;
        this.serviceDate = serviceDate;
    }
    
    protected Booking(int bookingId, String customerName, String vehicleName, ServiceType serviceType, Date serviceDate) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.vehicleName = vehicleName;
        this.serviceType = serviceType;
        this.serviceDate = serviceDate;
        
        if (bookingId >= nextId) {
            nextId = bookingId + 1;
        }
    }

    public static Booking createFromLoad(int id, String name, String vehicle, ServiceType type, Date date) {
        return new VehicleServiceBooking(id, name, vehicle, type, date);
    }

    // Getters
    public int getBookingId() { return bookingId; }
    public String getCustomerName() { return customerName; }
    public String getVehicleName() { return vehicleName; }
    public ServiceType getServiceType() { return serviceType; }
    public Date getServiceDate() { return serviceDate; }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("ID: %d | Customer: %s | Vehicle: %s | Service: %s | Date: %s",
                bookingId, customerName, vehicleName, serviceType, sdf.format(serviceDate));
    }
}