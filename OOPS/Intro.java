// import java.util.Arrays;cls

public class Intro {
    public static void main(String[] args) {
        

        //class is named group of properties and functions, class is tempelate for object and object are instance of class

        // Student[] students = new Student[5];
        
        //constructer defined what happens when obhejt bieng created.

       Student kunal = new Student(17, "kamal khanna", 56.4f);
     

        // kunal.rno = 12;
        // kunal.name = "kunal kushwaha";
        // kunal.marks = 69.8f;

       
        // kunal.changeName("kamal khanna");
        // kunal.greeting();


       System.out.println(kunal.rno);
       System.out.println(kunal.marks);
       System.out.println(kunal.name);


       Student rahul = new Student(kunal);

       System.out.println(rahul.rno);
       System.out.println(rahul.marks);
       System.out.println(rahul.name);
    }

    
}


//create class
class Student {
    int rno;
    String name;
    float marks = 98f;

    // we need a way to add the value of the above 
    // properties object by object
    //we need  one word to acesses


    void greeting() {
        System.out.println("Hello my name is " + name);
    }

    void changeName(String newName) {
        this.name = newName;
    }
    Student () {
        this.rno = 12;
        this.name = "kunal kushwaha";
        this.marks = 69.8f; 
    }

    //Student arpit = new Student(17, "arpit", 80.34f)
    //here this will be replaced with arpit
    Student (int roll, String nam, float mark) {
        rno = roll;
        name = nam;
        marks = mark; 
    }

    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}

 