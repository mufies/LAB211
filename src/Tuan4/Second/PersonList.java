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
        for (Person person : personList) {
            if (person instanceof Students) {
                System.out.println(person.toString());
            }
        }
    }
    public void printTeacherList() {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                System.out.println(person.toString());
            }
        }
    }
    public void printAll() {
        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }


}
