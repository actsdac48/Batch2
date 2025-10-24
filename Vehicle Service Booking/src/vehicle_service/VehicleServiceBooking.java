package vehicle_service;
import java.util.Date;
import java.util.Date;

public class VehicleServiceBooking extends Booking {

	public VehicleServiceBooking(String customerName, String vehicleName, ServiceType serviceType, Date serviceDate) {
        super(customerName, vehicleName, serviceType, serviceDate);
    }

	public VehicleServiceBooking(int id, String name, String vehicle, ServiceType type, Date date) {
		super(id, name, vehicle, type, date);
    }

	
}
