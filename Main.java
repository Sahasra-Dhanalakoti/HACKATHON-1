import java.util.Scanner;
class Student {
String studentName;
int rollNumber;
double marks;
String courseName;
int courseCredits;
public Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
this.studentName = studentName;
this.rollNumber = rollNumber;
this.marks = marks;
this.courseName = courseName;
this.courseCredits = courseCredits;
}
public double calculateFee() {
return courseCredits * 1500.0;
}
public boolean checkEligibility() {
return marks >= 50;
}
public double calculateScholarship() {
double totalFee = calculateFee();
if (marks >= 85) {
return totalFee * 0.20;
} else if (marks >= 70 && marks <= 84) {
return totalFee * 0.10;
} else {
return 0.0;
}
}
public double calculateFinalFee() {
return calculateFee() - calculateScholarship();
}
public void displayDetails() {
System.out.println("\n--- Student Details ---");
System.out.println("Student Name: " + studentName);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Marks: " + marks);
System.out.println("Course Name: " + courseName);
System.out.println("Course Credits: " + courseCredits);
System.out.println("Eligibility: Eligible");
System.out.println("Total Fee: Rs. " + calculateFee());
System.out.println("Scholarship Amount: Rs. " + calculateScholarship());
System.out.println("Final Fee to Pay: Rs. " + calculateFinalFee());
}
}

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Student Name: ");
String studentName = sc.nextLine();
System.out.print("Enter Roll Number: ");
int rollNumber = sc.nextInt();
System.out.print("Enter Marks: ");
double marks = sc.nextDouble();
sc.nextLine(); // consume newline
System.out.print("Enter Course Name: ");
String courseName = sc.nextLine();
System.out.print("Enter Course Credits: ");
int courseCredits = sc.nextInt();
Student student = new Student(studentName, rollNumber, marks, courseName, courseCredits);
if (student.checkEligibility()) {
student.displayDetails();
} else {
System.out.println("\nStudent is Not Eligible for Course Registration (Marks must be 50 or above).");
}
}
}