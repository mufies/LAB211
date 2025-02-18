package Tuan5.CourseManagement;
import Test.InputData;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
     List<Course> cl = new ArrayList<>();

    public void addCourse(Course c)
    {
        cl.add(c);
    }
    public boolean findByID(String id)
    {
        for (Course course : cl) {
            if (course.getCourseID().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    public Course findByIDC(String id)
    {
        for (Course course : cl) {
            if (course.getCourseID().equalsIgnoreCase(id)) {
                return course;
            }
        }
        return null;
    }
    public boolean findByName(String Name)
    {
        for (Course course : cl) {
            if (course.getCourseName().equalsIgnoreCase(Name)) {
                return true;
            }
        }
        return false;
    }
    public List<Course> getCl() {
        return cl;
    }
    public void updateCourse()
    {
        InputData sc = new InputData();
        while(true)
        {
            System.out.println("Enter course ID you want to update: ");
            String id = sc.getString();
            if(findByIDC(id) == null)
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
                Course c = findByIDC(id);
                System.out.println("Note: Enter empty if you don't want to change it.");
                System.out.println("Enter new course ID: ");
                String newID = sc.getStringButContainBlank();
                if(!newID.isEmpty())
                {
                    c.setCourseID(newID);
                }
                System.out.println("Enter new course name: ");
                String newName = sc.getStringButContainBlank();
                if(!newName.isEmpty())
                {
                    c.setCourseName(newName);
                }
                System.out.println("Enter new credit: ");
                String newCredit = sc.getStringButContainBlank();
                if(!newCredit.isEmpty())
                {
                    c.setCredit(Integer.parseInt(newCredit));
                }
                if(c instanceof OfflineCourse oc)
                {
                    System.out.println("Enter new begin date: ");
                    String newBegin = sc.getStringButContainBlank();
                    if(!newBegin.isEmpty())
                    {
                        oc.setBegin(newBegin);
                    }
                    System.out.println("Enter new end date: ");
                    String newEnd = sc.getStringButContainBlank();
                    if(!newEnd.isEmpty())
                    {
                        oc.setEnd(newEnd);
                    }
                    System.out.println("Enter new campus: ");
                    String newCampus = sc.getStringButContainBlank();
                    if(!newCampus.isEmpty())
                    {
                        oc.setCampus(newCampus);
                    }
                }
                else if(c instanceof OnlineCourse oc)
                {
                    System.out.println("Enter new platform");
                    String newPlatform = sc.getStringButContainBlank();
                    if(!newPlatform.isEmpty())
                    {
                        oc.setPlatform(newPlatform);
                    }
                    System.out.println("Enter new instructor");
                    String newInstructor = sc.getStringButContainBlank();
                    if(!newInstructor.isEmpty())
                    {
                        oc.setInstructor(newInstructor);
                    }
                    System.out.println("Enter new note");
                    String newNote = sc.getStringButContainBlank();
                    if(!newNote.isEmpty())
                    {
                        oc.setNote(newNote);
                    }
                }

                break;
            }
        }

    }

    public void deleteCourse()
    {
        InputData sc = new InputData();
        while(true)
        {
            System.out.println("Enter course ID you want to delete: ");
            String id = sc.getString();
            if(findByIDC(id) == null)
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
                Course c = findByIDC(id);
                cl.remove(c);
                break;
            }
        }
    }
    public void displayAll(String choice)
    {
        switch (choice) {
            case "A", "a" -> {
                for (Course course : cl) {
                    System.out.println(course);
                }
            }
            case "O", "o" -> {
                for (Course course : cl) {
                    if (course instanceof OnlineCourse) {
                        System.out.println(course);
                    }
                }
            }
            case "F", "f" -> {
                for (Course course : cl) {
                    if (course instanceof OfflineCourse) {
                        System.out.println(course);
                    }
                }
            }
        }
    }

    public Course findByNameC(String Name)
    {
        for (Course course : cl) {
            if (course.getCourseName().equalsIgnoreCase(Name)) {
                return course;
            }
        }
        return null;
    }

    public void searchByName()
    {
        InputData sc = new InputData();
        while(true)
        {
            System.out.println("Enter course name you want to search: ");
            String name = sc.getString();
            if(!findByName(name))
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
                System.out.println(findByNameC(name));
                break;
            }
        }
    }


}
