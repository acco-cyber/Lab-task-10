import java.util.*;
class Student {
    private String name;
    private int grade;
    private List<String> courses;
    public Student(String name, int grade) { this.name = name; this.grade = grade; this.courses = new ArrayList<>();}
    public void addCourse(String course) {courses.add(course);}
    public void removeCourse(String course) { courses.remove(course);}
    public String getName() { return name;}
    public int getGrade() { return grade; }
    public List<String> getCourses() { return courses; }
    public String toString() {return "Name: " + name + "\nGrade: " + grade;}}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Marko", 11);
        Student s2 = new Student("Naruto", 10);
        Student s3 = new Student("Gabriel", 10);
        System.out.println("Student Details:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Adding courses for Marko");
        s1.addCourse("Math");
        s1.addCourse("CSE");
        s1.addCourse("English");
        System.out.println("Marko's courses: " + s1.getCourses());
        System.out.println("\nAdding courses for Naruto");
        s2.addCourse("Physics");
        s2.addCourse("CSE");
        s2.addCourse("English");
        System.out.println("Naruto's courses: " + s2.getCourses());
        System.out.println("\nRemoving 'English' course for Marko");
        s1.removeCourse("English");
        System.out.println("Marko's courses: " + s1.getCourses()); }}