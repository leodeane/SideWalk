//leoleoleo (')>

package com.chalk.sidewalk;

import java.util.Scanner;
import java.util.Vector;

public class Student
{

    String stuName;
    double stuGpa;
    String stuBeh;// should prolly make beh its own data type
    int stuSeat;
    String stuAtt;// should prolly make att its own data type

    String input;// scanner bug workaround

    public Student()
    {
        stuName = "no name";
        stuGpa = 0.0;
        stuBeh = "no behavior logged";
        stuSeat = 0;
        stuAtt = "no attendance logged";
    }

    public Student(String n, double g, String b, int s, String a)// default student
    {
        stuName = n;
        stuGpa = g;
        stuBeh = b;
        stuSeat = s;
        stuAtt = a;
    }

            /*public Vector addToRost(String stuName)
            { //Class Roster
                Vector<String> classRost = new Vector();
                classRost.add(stuName);

                return classRost;
            }*/


    public void createStu ()//creates a custom student. can prolly be done better
    {
        Scanner keyboard = new Scanner(System.in);// brings in kb
        System.out.println("What is the Student's Name?");
        stuName = keyboard.nextLine();
        System.out.println("What is the Student's GPA?");
        stuGpa = keyboard.nextDouble();
        input = keyboard.nextLine();// scanner bug workaround
        System.out.println("What is the Student's Behavior?");
        stuBeh = keyboard.nextLine();
        System.out.println("What is the Student's Seat?");
        stuSeat = keyboard.nextInt();
        input = keyboard.nextLine();// scanner bug workaround
        System.out.println("What is the Student's Attendance?");
        stuAtt = keyboard.nextLine();
    }

    public void printStu()// prints out specific student
    {
        System.out.print("Student:" + stuName +
                " GPA:" + stuGpa +
                " Today's Behavior: " + stuBeh +
                " Seat: " + stuSeat +
                " Attendance: " + stuAtt +
                "\n");
    }

    //GETTERS
    public String getName() //get name
    {
        return stuName;
    }

    public double getGpa() // get gpa
    {
        return stuGpa;
    }

    public String getBeh() // get behavior / again we should make its own data type
    {
        return stuBeh;
    }

    public int getSeat() // get seat
    {
        return stuSeat;
    }

    public String getAtt() // get attendance / again we should make its own data type
    {
        return stuAtt;
    }

    //SETTERS
    public void setName(String n) // sets student name
    {
        stuName = n;
    }

    public void setGpa(double g) // sets student gpa
    {
        stuGpa = g;
    }

    public void setBeh(String b) // sets student behavior
    {
        stuBeh = b;
    }

    public void setSeat(int s) // sets student behavior
    {
        stuSeat = s;
    }

    public void setAtt(String a) // sets student attendance
    {
        stuAtt = a;
    }




}
