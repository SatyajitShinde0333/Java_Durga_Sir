class Constructor{
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.Student("John", 25, 101);
        
        stu1.displayInfo();

    }
}

class Student{
    String name;
    int age;
    int roll;

    public void Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    void displayInfo(){
        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
      
    }
}

// 

class rollNo extends Student{
    
    rollNo(){
        super();
        System.out.println("Roll number is: " + roll);
    }
}