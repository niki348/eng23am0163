//simple program to illustrate the concept of classes and objests without constructors and methods
package unit3;

//define the student class
class Student 
{
    //attribute of the student class
    String name;
    int age;
    char grade;
}

//main class to test the student class
public class cando 
{
    public static void main(String args[])
    {
        //creating an object of the student class 
        Student student1 = new Student();
        Student student2 = new Student();
        

        //setting the values of attribute directly
        student1.name="lonan";
        student1.age=69;
        student1.grade='A';

    
        student2.name="ankit";
        student2.age=8;
        student2.grade='B';


        System.out.println("student name: "+student1.name+"\nage:"+student1.age+"\ngrade:"+student1.grade);
        System.out.println("student name: "+student2.name+"\nage:"+student2.age+"\ngrade:"+student2.grade);


    
    }

    
}
