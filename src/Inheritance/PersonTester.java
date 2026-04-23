package Inheritance;

public class PersonTester {
    public static void main(String []arg){
        Person sally=new Person("Sally","Phillips");
        System.out.println(sally);

        System.out.println("--------------------------------------------------------------------------------");

        Student mike=new Student("Mike","Thompson","12345");
        System.out.println(mike);

        System.out.println("--------------------------------------------------------------------------------");

        StudentEmployee jeff=new StudentEmployee("Jeff","Sam","4567","#12345",20.5);
        System.out.println(jeff);
    }
}
