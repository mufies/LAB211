package Tuan5.RoomReservations;

public class FlightInformation extends Reservation{
    public String flightNumber;
    public String seatNumber;
    public String timePickUp;

    public FlightInformation(String bookingID, String customerName, String phoneNumber, int roomNumber,String Date, String flightNumber, String seatNumber, String timePickUp) {
        super(bookingID, customerName, phoneNumber, roomNumber ,Date);
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickUp = timePickUp;
    }
    public FlightInformation()
    {
        super();
        this.flightNumber = "";
        this.seatNumber = "";
        this.timePickUp = "";
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTimePickUp() {
        return timePickUp;
    }

    public void setTimePickUp(String timePickUp) {
        this.timePickUp = timePickUp;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", flightNumber='" + flightNumber + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", timePickUp='" + timePickUp + '\'';
    }
}
