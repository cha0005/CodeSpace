// Employee class within the package office
class Employee {
    private float basicSalary;
    private float monthlyTransportAllowance;
    private float monthlyIncentive;
    private float monthlyIncome;

    // Constructor to set data for the attributes
    public Employee(float basicSalary, float monthlyTransportAllowance, float monthlyIncentive) {
        this.basicSalary = basicSalary;
        this.monthlyTransportAllowance = monthlyTransportAllowance;
        this.monthlyIncentive = monthlyIncentive;
    }

    // Method to calculate the employee's monthly income
    public void calculateIncome() {
        monthlyIncome = basicSalary + monthlyTransportAllowance + monthlyIncentive;
    }

    // Method to return the calculated monthly income
    public float getIncome() {
        return monthlyIncome;
    }
}

// MainClass to perform the tasks
public class MainClass {
    public static void main(String[] args) {
        // Creating an instance of Employee with example data
        Employee employee = new Employee(5000, 300, 200);

        // Calculating the employee's monthly income
        employee.calculateIncome();

        // Getting and printing the employee's monthly income
        System.out.println("Employee's Monthly Income: " + employee.getIncome());
    }
}
