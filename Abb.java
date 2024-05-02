import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    public enum Status {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }

    private Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + super.toString();
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString();
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

public class Abb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Person
        System.out.println("Enter Person details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email Address: ");
        String emailAddress = scanner.nextLine();

        Person person = new Person(name, address, phoneNumber, emailAddress);

        // Get input for Student
        System.out.println("\nEnter Student details:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Phone Number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Email Address: ");
        emailAddress = scanner.nextLine();
        System.out.print("Status (FRESHMAN, SOPHOMORE, JUNIOR, SENIOR): ");
        Student.Status status = Student.Status.valueOf(scanner.nextLine().toUpperCase());

        Student student = new Student(name, address, phoneNumber, emailAddress, status);

        // Get input for Employee
        System.out.println("\nEnter Employee details:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Phone Number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Email Address: ");
        emailAddress = scanner.nextLine();
        System.out.print("Office: ");
        String office = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter Date Hired (Year Month Day): ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        MyDate dateHired = new MyDate(year, month, day);

        Employee employee = new Employee(name, address, phoneNumber, emailAddress, office, salary, dateHired);

        // Get input for Faculty
        System.out.println("\nEnter Faculty details:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Phone Number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Email Address: ");
        emailAddress = scanner.nextLine();
        System.out.print("Office: ");
        office = scanner.nextLine();
        System.out.print("Salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter Date Hired (Year Month Day): ");
        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        dateHired = new MyDate(year, month, day);
        System.out.print("Office Hours: ");
        String officeHours = scanner.nextLine();
        System.out.print("Rank: ");
        String rank = scanner.nextLine();

        Faculty faculty = new Faculty(name, address, phoneNumber, emailAddress, office, salary, dateHired, officeHours, rank);

        // Get input for Staff
        System.out.println("\nEnter Staff details:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Phone Number: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Email Address: ");
        emailAddress = scanner.nextLine();
        System.out.print("Office: ");
        office = scanner.nextLine();
        System.out.print("Salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter Date Hired (Year Month Day): ");
        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        dateHired = new MyDate(year, month, day);
        System.out.print("Title: ");
        String title = scanner.nextLine();

        Staff staff = new Staff(name, address, phoneNumber, emailAddress, office, salary, dateHired, title);

        // Output details
        System.out.println("\nDetails:");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

        scanner.close();
    }
}
