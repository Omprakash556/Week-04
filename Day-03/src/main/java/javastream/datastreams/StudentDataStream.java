package javastream.datastreams;

import java.io.*;


    class Student {
        int rollNumber;
        String name;
        double gpa;

        public Student(int rollNumber, String name, double gpa) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.gpa = gpa;
        }
    }
public class StudentDataStream {

        static String  fileName = "source.txt";
        public static void writeStudentData(Student[] students) {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
                for (Student s : students) {
                    dos.writeInt(s.rollNumber);
                    dos.writeUTF(s.name);
                    dos.writeDouble(s.gpa);
                }
                System.out.println("Student data written successfully.");
            } catch (IOException e) {
                System.out.println("Error writing student data: " + e.getMessage());
            }
        }

        public static void readStudentData() {
            try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
                System.out.println("\nRetrieved Student Data:");
                while (dis.available() > 0) {
                    int rollNumber = dis.readInt();
                    String name = dis.readUTF();
                    double gpa = dis.readDouble();
                    System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
                }
            } catch (IOException e) {
                System.out.println("Error reading student data: " + e.getMessage());
            }
        }
    }


     class DataStreamMain {
        public static void main(String[] args) {
            Student[] students = {
                    new Student(97, "Om Prakash", 8.51),
                    new Student(45, "Deepansh", 8.9),
                    new Student(33, "Anubhav", 7.8)
            };

            StudentDataStream.writeStudentData(students);

            StudentDataStream.readStudentData();
}

    }
