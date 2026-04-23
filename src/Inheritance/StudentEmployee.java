package Inheritance;

public class StudentEmployee extends Student{
    private double rateOfPayPerHour;
    private String employeeId;

    public StudentEmployee(String firstName,String lastName,String studentId,String employeeId,double rateOfPayPerHour){
        super(firstName,lastName,studentId);
        this.rateOfPayPerHour=rateOfPayPerHour;
        this.employeeId=employeeId;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }
    public double getRateOfPayPerHour(){
        return rateOfPayPerHour;
    }

    public void setEmployeeId(String newId){
        this.employeeId=newId;
    }
    public void setRateOfPayPerHour(double newRateOfPayPerHour){
        this.rateOfPayPerHour=newRateOfPayPerHour;
    }

    @Override
    public String toString(){
        return super.toString()+" \nrate of pay per Hour: "+rateOfPayPerHour+" \nEmployeeId: "+employeeId;
    }
}
