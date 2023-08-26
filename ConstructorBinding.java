class ConstructorBinding{
    public static void main(String[] args) {
        Student student = new Student(25, "Yashu"); 
        // student.name = "Kanishtha";
        // student.rno = 23;
        System.out.println("My name is " + student.name + " and my roll no is " + student.rno);
    }
}

class Student{
    int rno;
    String name;
    //if no parameters are passed to the contrctor then it is called a non parameterised contructor

    //a default contructor is same as a non parameterised constructor, where we dont need to define our constructor
    //it will invoke automatically
    // for eg -> Scanner class constructor
    //        -> ArrayList class constructor

    Student(){
        this.name = "parth";
        this.rno = 24 ;
    }

    //this is a parameterized constructor
    Student(int rno, String name){
        this.name = name;
        this.rno = rno;
    }
}
