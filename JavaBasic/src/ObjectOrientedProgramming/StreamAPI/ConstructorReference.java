package ObjectOrientedProgramming.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    A constructor reference is a special type of method reference used to refer to a class's constructor.
    Syntax
    ClassName::new

 */

class Student{
    private String name;
    private String age;

    public Student(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
public class ConstructorReference {
    public static void main(String args[]){
        List<String> names= Arrays.asList("IronMan","Peter","Thor");

        List<Student> st=new ArrayList<>();
        st=names.stream()
                .map(name->new Student(name))
                .toList();

        System.out.println(st);

        //The above Statement can also be written as
        List<Student> st2=names.stream()
                .map(Student::new)
                .toList();

        System.out.println(st2);
    }
}
