//Leo (')>
package com.chalk.sidewalk;
import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);// brings in our keyboard
        System.out.println("Hello, User"); // hello, user
        // creating students
        Student tj = new Student("TJ LastName", 3.9, "Green Light", 5, "Present");
        //tj.printStu();
        Student leo = new Student("Leo LastName", 3.7, "Red Light", 2, "Absent");
        //leo.printStu();
        Student becca = new Student("Becca", 2.9, "Green Light", 1, "Present");
        Student tim = new Student("Tim", 3.2, "Red Light", 3, "Absent");
        Student victoria = new Student("Victoria", 3.8, "Yellow Light", 4, "Present");
        Student ethan = new Student("Ethan", 3.0, "Green Light", 6, "Present");



        //creating a roster
        Roster newRos = new Roster("CSC331", 6);
        newRos.addStu(tj);
        /*newRos.addStuTo(leo, leo.getSeat());
        newRos.addStuTo(becca, becca.getSeat());
        newRos.addStuTo(tim, tim.getSeat());
        newRos.addStuTo(victoria, victoria.getSeat());
        newRos.addStuTo(ethan, ethan.getSeat());*/

        Student temp = newRos.getStu(0);
        temp.printStu();
        /*for (int i = 0; i < newRos.size(); i++)
        {
            Student temp = newRos.getStu(i);
            temp.printStu();
        }*/


        // changing student stuff and printing
        /*leo.setName("Leonardo LastName");
        leo.setGpa(3.2);
        leo.setBeh("Yellow Light");
        leo.setSeat(6);
        leo.setAtt("Present");
        leo.printStu();*/

        // making a custom student using kb. can prolly be done better
        /*Student custom = new Student();
        custom.createStu();
        custom.printStu();*/

       /* while(selectionMenu)
        {

            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------------------------------------");
            System.out.println("Please Enter the number of the option you would like!");
            System.out.println("-----------------------------------------------------");
            System.out.println("1: Under Construction");
            System.out.println("2: Under Construction");
            System.out.println("3: Under Construction");
            System.out.println("4: Add another Student");
            System.out.println("5: Exit Program");
            System.out.println("-----------------------------------------------------");

            teacherChoice = keyboard.nextInt() - 1;
            switch(teacherChoice)
            {

                case 0:
                    System.out.println("Please Enter a Different Option");
                    break;

                case 1:
                    System.out.println("Please Enter a Different Option");
                    break;

                case 2:
                    System.out.println("Please Enter a Different Option");
                    break;


                case 3: //Creates a new student

                    Student custom = new Student();
                    custom.createStu();
                    custom.printStu();

                    break;
                case 4: //Closes the Application

                    selectionMenu = false;

                    break;

                default:

                    System.out.println("Please Enter a Different Option");
                    break;


            }
        }*/





    }







    }
