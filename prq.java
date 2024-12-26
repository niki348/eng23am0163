package unit3;

public class prq
{
    class Test { 
        Test() { 
        System.out.println("No-arg constructor"); 
        } 
        Test(int x) { 
        this(); 
        System.out.println("Parameterized constructor"); 
        } 
        } 
        public class Main { 
        public static void main(String[] args) { 
        Test obj = new Test(5); 
        } 
        }
    
}
