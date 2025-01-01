// public class OOPS{

    // constructor
//     public static void main(String[] args) {
//         // Creating an object of the class
//         Student s1 = new Student();
       
//         s1.marks[0] = 90;
//         s1.marks[1] = 80;
//         s1.marks[2] = 70;
      

//         Student s2 = new Student(s1);

//         for(int i=0; i<3; i++){
//             System.out.println(s2.marks[i]);
//         }


  
      
       

        
//     }

// }

// class Pen{
//     private String color;
//     private int tip;
  
    
//     int getTip(){
//         return this.tip;
//     }
//     void set_color(String newColor){
//         color = newColor;
//     }
//     void setTip(int tip){
//         this.tip = tip;
//     }
   

// }

// class Student{
//     String name;
//     int roll_no;
//     int marks[];


//     // Shallow Copy Constructor works in reference
//     Student(Student s1){ // Copy Constructor
//         // marks = new int[3];
//         this.name = s1.name;
//         this.roll_no = s1.roll_no;
//         this.marks = new int[3];

//     }

//     // Deep Copy Constructor works in value
//     // Student(Student s1){ // Copy Constructor
//     //     this.marks = new int[3];
//     //     this.name = s1.name;
//     //     this.roll_no = s1.roll_no;
//     //     for(int i=0;i<marks.length;i++){
//     //         this.marks[i] = s1.marks[i];
//     //     }
//     //     }

//     Student(){
//         name = "John";
//         roll_no = 1;
//         marks = new int[3];
        
//     }

//// Inheritance

// public static void main(String[] args){
//     Newstudent s1 = new Newstudent();
//     s1.buildings = "VU2";
//     System.out.println(s1.buildings);
//     s1.facultyMember();

// }}

// class University{
//     String branch;
//     String buildings;
//     String department;

//     void facultyMember(){
//         System.out.println("Faculty members are 5 computer ");
//     }

//     void feesDepartment(){
//         System.out.println("Fees department is located in building 1");
//     }
//     void setbuildings(String buildings){
//         this.buildings = buildings;
//     }
// }

// class Newstudent extends University{
//     String name;
//     String admission;

//     void building(){
//         System.out.println("Building is located in 1");
//     }
// }

/// Polymorphism " Method Overloading"


// class Calculator{
//    int add(int a, int b){
//     return a+b;
//    }
//    float add(float a, float b){
//     return a+b;
//    }

//    int add(int a, int b, int c){
//     return a+b+c;
//    }
// }
// /// Methode Overriding

// class Satyajit{
//     void isha(){
//         System.out.println("Its mine isha");


//     }
// }
// class Ishaa{
//     void isha(){
//         System.out.println("Its mine satyajit");
//     }
// }

// public class OOPS{
//     public static void main(String[]args){
//         Calculator c1 = new Calculator();
//         System.out.println(c1.add(2, 2));
//         System.out.println(c1.add((float)2.2, (float)2.2));
//         System.out.println(c1.add(2, 2, 2));

//         Ishaa mine = new Ishaa();
//         mine.isha();

//     }
// }



/// Abstraction Abstract class

// public class OOPS{
//     public static void main(String[] args){

//         Chicken c1 = new Chicken();
//         c1.walk();
       

//         Horse h1 = new Horse();
//         h1.walk();
    

//     }
// }

// abstract class Animal{
//     String color;
    
//     void eats(){
//         System.out.println("Eats a grass");
//     }
//     abstract void walk();

//    Animal(){
//     color = "Brown";

//    }




// }

// class Chicken extends Animal{
//     void walk(){
//         System.out.println("Walking 2 legs");
//     }

// }

// class Horse extends Animal{
//     void walk(){
//         System.out.println("walking on 2 Legs");
//     }

//     void changeColor(String color){
//         color = "Black";
//     }
// }
///Interface
// interface Animal{
//     void walk();
// }

// class Chicken implements Animal{
//     public void walk() {
//         System.out.println("Walking 2 legs");
//         }
//         }

// class Horse implements Animal{
//     public void walk() {
//         System.out.println("Walking on 4 legs");
//         }
//         }

// class Dog implements Animal{
//     public void walk() {
//         System.out.println("Walking on 4 legs");
//         }
//         }

// Static Keywoerd

class OOPS{

public static void main(String[] args){

    Student s1 = new Student();
 
    s1.schoolName = "VP";
    Student s2 = new Student();

    System.out.println(s2.schoolName);

}
}
class Student{
    String name;
    int age;

    static String schoolName;

}