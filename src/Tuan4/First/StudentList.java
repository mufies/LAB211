package Tuan4.First;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    private List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public List<Student> findStudentByName(String name)
    {
        List<Student> s = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudentName().contains(name)) {
                s.add(student);
            }
        }
        return s;
    }

    public List<Student> sortStudentByName(List <Student> student)
    {
        Collections.sort(student);
        return student;
    }
    public Student findByID(String id)
    {
        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(Student student)
    {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(student.getId())) {
                students.set(i, student);
                return;
            }
        }
    }
    public void deleteStudent(Student s)
    {
        students.remove(s);
    }
    public void getCourseNumberReport() {
        List<Student> s = students;
        Collections.sort(s);
        int countJava = 0;
        int countC = 0;
        int countDotNet = 0;

        for (int i = 0; i < s.size() -1; i++) {
            if (s.get(i).getStudentCourse().equalsIgnoreCase("Java")) {
                countJava++;
            }
            if (s.get(i).getStudentCourse().equalsIgnoreCase("C/C++")) {
                countC++;
            }
            if (s.get(i).getStudentCourse().equalsIgnoreCase(".Net")) {
                countDotNet++;
            }
            if (!s.get(i).getStudentName().equalsIgnoreCase(s.get(i + 1).getStudentName())) {
                if(countJava!= 0 ) System.out.println(s.get(i).getStudentName()+" | Java | " + countJava);
                if(countC!= 0 ) System.out.println(s.get(i).getStudentName()+" | C/C++ | " + countC);
                if(countDotNet!= 0 ) System.out.println(s.get(i).getStudentName()+" | .Net | " + countDotNet);
                countJava = 0;
                countC = 0;
                countDotNet = 0;
            }
        }
        if (s.getLast().getStudentCourse().equalsIgnoreCase("Java")) {
            countJava++;
        }
        if (s.getLast().getStudentCourse().equalsIgnoreCase("C/C++")) {
            countC++;
        }
        if (s.getLast().getStudentCourse().equalsIgnoreCase(".Net")) {
            countDotNet++;
        }
        if(countJava!= 0 ) System.out.println(s.getLast().getStudentName()+" | Java | " + countJava);
        if(countC != 0) System.out.println(s.getLast().getStudentName()+" | C/C++ | " + countC);
        if(countDotNet!= 0) System.out.println(s.getLast().getStudentName()+" | .Net |" + countDotNet);
    }
    public void showStudent(List<Student> students)
    {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public List<Student> getStudents() {
        return students;
    }


}
