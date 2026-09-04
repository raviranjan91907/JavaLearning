package ObjectOrientedProgramming;

/* Static Keyword means that a variable, method or a block belong to class itself rather
    than to individual object*/
class Student{
    String StudentName;
    int rollNo;
    static String college="abc college";
    static String collegeLocation="India";

    public Student(String StudentName,int rollNo){
        this.StudentName=StudentName;
        this.rollNo=rollNo;
    }

    //->we can't use instance variable in side the static method or static block
    public static String staticMethod(){
        return college+" is Located in "+collegeLocation;
    }

    //->if we have to use the instance variable then we have to pass the object in side the static method
    public static String studentDetail(Student object){
        return object.StudentName + " is Having rollNo "+ object.rollNo +" studying in "+college+" "+collegeLocation;
    }
}
public class StaticKeyword {
    public static void main(String args[]) {
        Student st1 = new Student("Raj", 1);
        Student st2 = new Student("Neha", 2);
        System.out.println(st1.college);

        //->we can use the static variable by using class name without creating any object
        System.out.println(Student.college);

        System.out.println(Student.staticMethod());
        System.out.println(Student.studentDetail(st1));

    }
}

