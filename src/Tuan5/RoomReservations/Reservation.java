package Tuan5.RoomReservations;

public class Reservation {
    public String bookingID;
    public String customerName;
    public String phoneNumber;
    public int RoomNumber;
    public String Date;

    public Reservation(String bookingID, String customerName, String phoneNumber, int roomNumber,String Date) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.RoomNumber = roomNumber;
        this.Date = Date;
    }
    public Reservation()
    {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.RoomNumber = 0;
        this.Date = "";
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }
    @Override
    public String toString() {
        return "Reservation{" +
                "bookingID='" + bookingID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", RoomNumber=" + RoomNumber +
                ", BookingDate='" + Date + '\'';
    }
}
