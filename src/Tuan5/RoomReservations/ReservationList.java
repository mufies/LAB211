package Tuan5.RoomReservations;

import Test.InputData;
import Tuan5.CourseManagement.Course;
import Tuan5.CourseManagement.OfflineCourse;
import Tuan5.CourseManagement.OnlineCourse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReservationList {
    List<FlightInformation> rl = new ArrayList<>();
    public boolean addReservation(FlightInformation r)
    {
        for (Reservation reservation : rl) {
            if (reservation.getBookingID().equals(r.getBookingID())) {
                return false;
            }
        }
        return rl.add(r);
    }
    public Reservation findByID(String id)
    {
        for (Reservation reservation : rl) {
            if (reservation.getBookingID().equalsIgnoreCase(id)) {
                return reservation;
            }
        }
        return null;
    }
    public void updateReservation()
    {
        InputData sc = new InputData();
        while(true)
        {
            System.out.println("Enter ID you want to update: ");
            String id = sc.getString();
            if(findByID(id) == null)
            {
                System.out.println("No data found, do you want to find again? (Y/N):");
                String c = sc.getString();
                if(c.equalsIgnoreCase("Y"))
                {
                    continue;
                }
                else if (c.equalsIgnoreCase("N"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            else
            {
                Reservation c = findByID(id);
                System.out.println(c.toString());
                System.out.println("Note: Enter empty if you don't want to change it.");

                System.out.println("Name: ");
                String newName = sc.getStringButContainBlank();
                if(!newName.isEmpty())
                {
                    c.setCustomerName(newName);
                }
                System.out.println("Phone: ");
                String phoneNum = sc.getStringButContainBlank();
                if(!phoneNum.isEmpty())
                {
                    c.setPhoneNumber(phoneNum);
                }
                System.out.println("Booking Date");
                String newDate = sc.getStringButContainBlank();
                if(!newDate.isEmpty())
                {
                    LocalDate bookingDate;
                    while (true) {
                        bookingDate = LocalDate.parse(newDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        if (bookingDate.isAfter(LocalDate.now())) {
                            break;
                        } else {
                            System.out.println("Date must be after the present date. Enter Booking Date again:");
                            newDate = sc.getDate();
                        }

                    }
                }


                break;
            }

        }


    }
    public void deleteReservation()
    {
        InputData sc = new InputData();
        while(true)
        {
            System.out.println("Enter ID you want to delete: ");
            String id = sc.getString();
            if(findByID(id) == null)
            {
                System.out.println("No data found, do you want to find again? (Y/N):");
                String c = sc.getString();
                if(c.equalsIgnoreCase("Y"))
                {
                    continue;
                }
                else if (c.equalsIgnoreCase("N"))
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            else
            {
                Reservation c = findByID(id);
                System.out.println(c.toString());
                System.out.println("Are you sure you want to delete this reservation? (Y/N): ");
                String c1 = sc.getString();
                if(c1.equalsIgnoreCase("Y"))
                {
                    rl.remove(c);
                    System.out.println("Reservation deleted");

                }
                else if (c1.equalsIgnoreCase("N"))
                {


                    System.out.println("Reservation not deleted");
                }
                else
                {
                    System.out.println("Invalid input");
                }

                break;
            }
        }
    }
    public List<FlightInformation> getRl() {
        return rl;
    }
}
