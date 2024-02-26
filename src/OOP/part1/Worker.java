package OOP.part1;

public class Worker {
    private String name;
    private String dob;
    protected String endDate;        // protected since it is being used by other classes.

    public Worker(String name, String dob) {
        this.name = name;
        this.dob = dob;
//        this.endDate = endDate;
    }

    public int getAge(){
        int currentYear = 2024;
        int birthYear = Integer.parseInt(dob.substring(6)); // 24/11/1994
        return currentYear - birthYear;
    }

    public double collectPay(){
        return 1.0;
    }

    public void terminate(String endDate){
         this.endDate = endDate;
    }
}

class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String dob, long employeeId, String hireDate) {
        super(name, dob);
        this.employeeId =  employeeId;
        this.hireDate = hireDate;
    }
}

class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String dob, long employeeId, String hireDate) {
        super(name, dob, employeeId, hireDate);
    }

    public void retire(){

    }
}

class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String dob, long employeeId, String hireDate) {
        super(name, dob, employeeId, hireDate);
    }

    public void getDoublePay(){

    }
}
