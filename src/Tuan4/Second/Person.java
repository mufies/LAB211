package Tuan4.Second;

        import Test.InputData;

        import java.time.Year;
        import java.util.Scanner;
        import java.util.regex.Pattern;

public class Person {
            InputData inputData = new InputData();
            private int id;
            private String FullName;
            private String phoneNumber;
            private int birthYear;
            private String Major;

            public Person() {
                this.id = 0;
                FullName = "";
                this.phoneNumber = "";
                this.birthYear = 0;
                Major = "";
            }

            public void inputAll(int id, String FullName, String phoneNumber, int birthYear, String Major) {

                this.id = id;

                this.FullName = FullName;

                this.phoneNumber = phoneNumber;

                this.birthYear = birthYear;

                this.Major = Major;

            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFullName() {
                return FullName;
            }

            public void setFullName(String fullName) {
                FullName = fullName;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public int getBirthDate() {
                return birthYear;
            }

            public void setBirthDate(int birthYear) {
                this.birthYear = birthYear;
            }

            public String getMajor() {
                return Major;
            }

            public void setMajor(String major) {
                Major = major;
            }

            @Override
            public String toString() {
                return
                         id +
                        " - " + FullName +
                        " - " + phoneNumber +
                        " - " + birthYear +
                        " - " + Major;
            }
        }