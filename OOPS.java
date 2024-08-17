class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
        // System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
// Parameterized constructor
    Student(String name,int age){
        // System.out.println("Constructor called");
        this.name=name;
        this.age=age;
    }
// copy Constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;

    }
}


public class OOPS{
    public static void main(String args[]){
        Student s=new Student("Tausif",22);
        s.name="Tausif";
        s.age=22;
        // s.studentInfo();

        Student s2=new Student(s);
        s2.studentInfo();

    }

}