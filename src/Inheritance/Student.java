package Inheritance;

public class Student extends Person{
    private String studentId;
    public Student(String firstName,String lastName,String studentId){
        super(firstName,lastName);
        this.studentId=studentId;
    }

    public String getStudentId(){
        return this.studentId;
    }

    public void setStudentId(String newId){
        this.studentId=newId;
    }

    @Override
    public String toString(){
        return super.toString()+" \nStudent Id: "+studentId;
    }
}
