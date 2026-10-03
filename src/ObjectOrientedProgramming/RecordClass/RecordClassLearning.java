package ObjectOrientedProgramming.RecordClass;

/*
    A record in Java is a special type of class used to create data-carrying objects with less code.
    In a normal Java class, if you want to store data, you usually write:
    fields
    constructor
    getters
    toString()
    equals()
    hashCode()
    A record automatically provides these things for you.

    All the variable in the record class is final
 */

import java.util.Objects;

//Normal class.
//class Student{
//    private int rollNo;
//    private String name;
//
//    public Student(int rollNo,String name){
//        this.rollNo=rollNo;
//        this.name=name;
//    }
//
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollNo == student.rollNo && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(rollNo, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "rollNo=" + rollNo +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

//The above code can be reduced by record class
//Record is also a class but, it can't extend any other class but, you can implement interface
record Student(int rollNo,String name) implements Cloneable{
    //we can also declare static variable but, for normal variable we have to declare inside the () of the record class (eg. student (int rollNo,String name,int num))
    static public int num;

    //we can also define some check or operation in constructor
    public Student{
        if(rollNo==0){
            throw new IllegalArgumentException("The Roll No can't be Zero");
        }
    }
    // you can also define you own method
    public void show(){
        System.out.println("Hello "+name);
    }
}


public class RecordClassLearning {
    public static void main(String args[]){
        Student s1=new Student(1,"John");
        Student s2=new Student(2,"Thor");

        System.out.println(s1);
        System.out.println(s2);
    }
}
