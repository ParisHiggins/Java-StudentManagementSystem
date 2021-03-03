package student.management.system;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Students First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Students Last Name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter Students Year Group: \n1 - First Year\n2 - Second Year\n3 - Third Year");
        this.gradeYear = in.nextInt();

        setStudentID();
    }


    // Generate an ID - grade level + ID (increment every new id by 1)
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        //loop, user hits 0 when done enrolling
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses += "\n- " + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

    }

    // View Balance

    public void viewBalance() {
        System.out.println("Your current balance is: £" + tuitionBalance);
    }

    // Pay Tuition

    public void payTuition() {
        viewBalance();
        System.out.print("Please Enter Payment Amount: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of: £" + payment);
        viewBalance();
    }

    // Show Status

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID: " + studentID +
                "\nYear group: " + gradeYear +
                "\nCourses Enrolled: " + courses +
                "\nBalance: £" + tuitionBalance;
    }
}


/**
 * static is something that is true for object
 **/