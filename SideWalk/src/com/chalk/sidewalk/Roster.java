package com.chalk.sidewalk;
import java.util.Vector;
public class Roster
{
    Vector<Student> ros = new Vector<Student>();
    String rosName;
    int rosSize;
    //Student stu;

    public Roster()// default roster of 30 slots
    {
        ros.setSize(30);
        rosName = "new roster";
        rosSize = 30;
    }

    public Roster(String n, int s)//makes a roster w n name and s size
    {
        ros.setSize(s);
        rosName = n;
        rosSize = s;
    }

    public void addStu(Student s)// adds a student to the next open spot
    {
        ros.add(s);
    }

    public void addStuTo(Student s, int p)// adds student to p spot
    {
        ros.add(p,s);
    }

    public int size()
    {
        return ros.size();
    }

    public Student getStu(int i)
    {
        return ros.get(i);
    }


}
