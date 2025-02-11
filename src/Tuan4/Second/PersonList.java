package Tuan4.Second;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    List<Person> personList = new ArrayList<>();

    public boolean addPerson(Person person) {
        return personList.add(person);
    }

    public void findPersonByName(String name) {
        List<Person> p = new ArrayList<>();
        for (Person person : personList) {
            if (person.getFullName().contains(name)) {
                System.out.println(person.toString());
            }
        }
    }

    public void printStudentList() {
        System.out.println("# - ID - Fullname - Phone number - Year of birth - Major - Year of admission - Entrance English score");
        int d=0;
        for (Person person : personList) {
            if (person instanceof Students) {
                d++;
                System.out.println(d+" - "+person.toString());
            }
        }
    }
    public void printTeacherList() {
        System.out.println("# - ID - Fullname - Phone number - Year of birth - Major - Year in the profession - Contract type - Salary coefficient");
        int d=0;
        for (Person person : personList) {
            if (person instanceof Teacher) {
                d++;
                System.out.println(d+" - "+person.toString());
            }
        }
    }
    public void printAll() {
        int d=0;
        System.out.println("# - ID - Fullname - Phone number - Year of birth - Major");

        for (Person person : personList) {
            d++;
            System.out.println(d+" - "+person.getId() + " - " + person.getFullName() + " - " + person.getPhoneNumber() + " - " + person.getBirthDate() + " - " + person.getMajor());
        }
    }


}
