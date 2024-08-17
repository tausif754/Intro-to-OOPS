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

    public void studentInfo(String name){
        System.out.println(name);
    }
    public void studentInfo(int age){
        System.out.println(age);
    }

    // public void studentInfo(String name,int age){
    //     System.out.println(name+ " "+ age);
    // }
    

}


public class OOPS{
    public static void main(String args[]){
        Student s=new Student();
        s.name="Tausif";
        s.age=22;
        
        s.studentInfo(s.name);
        s.studentInfo(s.age);
        
    }

}