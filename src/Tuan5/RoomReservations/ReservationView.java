package Tuan5.RoomReservations;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import Test.InputData;

import java.time.Year;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReservationView {
    public Reservation addReservation() {
        InputData inputData = new InputData();
        System.out.println("Enter ID: ");
        String id = inputData.getString();
        while (String.valueOf(id).length() != 6) {
            System.out.println("Wrong format");
            id = inputData.getString();
        }

        System.out.println("Enter Full Name: ");
        String FullName = inputData.getString();
        while (!FullName.matches("[a-zA-Z ]+")) {
            System.out.println("Wrong format");
            FullName = inputData.getString();
        }
        System.out.println("Enter Phone Number: ");
        String phoneNumber = inputData.getString();
        Pattern pattern = Pattern.compile("^[0-9]{12}$");

        while (!pattern.matcher(phoneNumber).matches()) {
            System.out.println("Wrong format");
            phoneNumber = inputData.getString();
        }
        System.out.println("Enter Room Number: ");
        int roomNumber = inputData.getInt();

        System.out.println("Enter Booking Date");


        String dateStr = inputData.getDate();
        LocalDate bookingDate = null;
        while (true) {

            bookingDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (bookingDate.isAfter(LocalDate.now())) {
                break;
            } else {
                System.out.println("Date must be after the present date. Enter Booking Date again:");
                dateStr = inputData.getDate();
            }

        }

        return new Reservation(id, FullName, phoneNumber, roomNumber, dateStr);


    }

    public FlightInformation getFlightInfo() {
        InputData inputData = new InputData();
        System.out.println("Enter ID: ");
        String id = inputData.getString();
        while (String.valueOf(id).length() != 6) {
            System.out.println("Wrong format");
            id = inputData.getString();
        }

        System.out.println("Enter Full Name: ");
        String FullName = inputData.getString();
        while (!FullName.matches("[a-zA-Z ]+")) {
            System.out.println("Wrong format");
            FullName = inputData.getString();
        }
        System.out.println("Enter Phone Number: ");
        String phoneNumber = inputData.getString();
        Pattern pattern = Pattern.compile("^[0-9]{12}$");

        while (!pattern.matcher(phoneNumber).matches()) {
            System.out.println("Wrong format");
            phoneNumber = inputData.getString();
        }
        System.out.println("Enter Room Number: ");
        int roomNumber = inputData.getInt();

        System.out.println("Enter Booking Date");


        String dateStr = inputData.getDate();
        LocalDate bookingDate = null;
        while (true) {

            bookingDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (bookingDate.isAfter(LocalDate.now())) {
                break;
            } else {
                System.out.println("Date must be after the present date. Enter Booking Date again:");
                dateStr = inputData.getDate();
            }

        }
        System.out.println("Need airport pick up? (Y/N)");
        String airportPickUp = inputData.getString();
        while (!airportPickUp.equalsIgnoreCase("Y") && !airportPickUp.equalsIgnoreCase("N")) {
            System.out.println("Invalid input.");
            airportPickUp = inputData.getString();
        }


        System.out.println("Enter flight number: ");
        String flightNumber = inputData.getString();
        System.out.println("Enter seat number: ");
        String seatNumber = inputData.getDate();


        System.out.println("Enter Time Pick Up");

        String timePickUpStr = inputData.getDate();
        LocalDate timePickUp = null;

        while (true) {
            timePickUp = LocalDate.parse(timePickUpStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (timePickUp.isAfter(LocalDate.now()) && timePickUp.isBefore(bookingDate)) {
                break;
            } else {
                System.out.println("Time Pick Up must be after the present date and before Booking Date. Enter Time Pick Up again:");
                timePickUpStr = inputData.getDate();
            }



        }
        return new FlightInformation(id, FullName, phoneNumber, roomNumber, dateStr, flightNumber, seatNumber, timePickUpStr);
    }
    public void displayFlightInfo(List<FlightInformation> reservations) {
        if (reservations.isEmpty())
        {
            System.out.println("No data found");
            return;
        }
        System.out.println("ID - Name - Phone - Flight - Seat - TimePickUp");
        for (FlightInformation reservation : reservations) {
            System.out.println(reservation.getBookingID()+ " - " + reservation.getCustomerName() + " - " + reservation.getPhoneNumber() + " - " + reservation.getFlightNumber() + " - " + reservation.getSeatNumber() + " - " + reservation.getTimePickUp());
        }

    }
    public void displayAll(List<FlightInformation> reservations) {
        if(reservations.isEmpty())
        {
            System.out.println("No data found");
            return;
        }
        System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
        for (FlightInformation reservation : reservations) {
            System.out.println(reservation.getBookingID() + " - " + reservation.getCustomerName() + " - " + reservation.getPhoneNumber() + " - " + reservation.getRoomNumber() + " - " + reservation.getDate() + " - " + reservation.getFlightNumber() + " - " + reservation.getSeatNumber() + " - " + reservation.getTimePickUp());
        }

    }
}
