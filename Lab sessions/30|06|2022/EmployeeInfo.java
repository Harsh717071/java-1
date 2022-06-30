//java program to demonstrate employee details
package corejava;
import java.io.*;
class Employee 
{ 
    private long employeeId,employeephone; 
    private String employeeName,employeeAddress; 
    private double basicSalary,specialAllowance,Hra;
//Create a method  Employee with the following instance variables
    Employee() 
    {
        employeeId = 0; 
        employeephone = 0; 
        employeeName = ""; 
        employeeAddress=""; 
        basicSalary=0.0; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    } 
    //Create an overloaded constructor in the employee method
    
    Employee(long id,String n,String a,long p,double s) 
    {
        employeeId = id; 
        employeephone = p; 
        employeeName = n; 
        employeeAddress=a; 
        basicSalary=s; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    }
// Create a method calculateSalary
    public double getBasicSalary()
    {
        return basicSalary;
    }

    public double calculateSalary()
    {
        double salary = basicSalary+(basicSalary*specialAllowance*0.01)+(basicSalary* Hra/100);
        return salary;
    }

    public double calculateTransportAllowance()
    {
        return 0.01*basicSalary;
    }
}
//Create the sub classes Manager and Trainee with base class Employee

class Manager extends Employee
{
    Manager(long id,String n,String a,long p,double s) 
    { 
        super(id,n,a,p,s);
    }
    
    public double calculateTransportAllowance(Manager m,int a)
    {
        return 0.15*getBasicSalary();
    } 
}
//Create a class "EmployeeInfo.java" with a main method.

public class EmployeeInfo
{
    public static void main(String[] args) {
        //Sample Input 
        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);
        double salary = m.calculateSalary(); 
        System.out.println("Manager's Salary : "+salary);
        System.out.println("Manager's Transport Allowance (15%) : "+m.calculateTransportAllowance(m, 15));   
    }
}