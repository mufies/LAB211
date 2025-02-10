package Tuan4.Second;

        import Test.InputData;

        import java.time.Year;
        import java.util.Scanner;

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

            public void inputAll() {
                Scanner sc = new Scanner(System.in);
                int currentYear = Year.now().getValue();
                System.out.println("Enter ID: ");
                int id = inputData.getInt();
                if (String.valueOf(id).length() != 6) {
                    id = inputData.getInt();
                }
                this.id = id;
                System.out.println("Enter Full Name: ");
                String FullName = sc.nextLine();
                while (!FullName.matches("[a-zA-Z ]+")) {
                    System.out.println("Wrong format");
                    FullName = sc.nextLine();
                }
                this.FullName = FullName;
                System.out.println("Enter Phone Number: ");
                String phoneNumber = sc.nextLine();
                if (!phoneNumber.matches("\\d{12}")) {
                    System.out.println("Wrong format");
                    phoneNumber = sc.nextLine();
                }
                this.phoneNumber = phoneNumber;
                System.out.println("Enter Birth Year: ");
                int birthYear = inputData.getInt();
                if (birthYear < 1900 || birthYear >= currentYear) {
                    System.out.println("Wrong format");
                    birthYear = inputData.getInt();
                }

                this.birthYear = birthYear;
                System.out.println("Enter Major: ");
                String Major = sc.nextLine();
                if (Major.length() > 30) {
                    System.out.println("Wrong format");
                    Major = sc.nextLine();
                }

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
                        "id=" + id +
                        ", FullName='" + FullName + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", birthYear=" + birthYear +
                        ", Major='" + Major + '\'' +
                        '}';
            }
        }