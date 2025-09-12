// TODO: Create an class called Employee
class Employee{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }
    public void getDetails(){
         System.out.println(name+" "+ salary);
    }
}

// TODO: Create a class Manager that:
class Manager extends Employee{
    private String department;
    public Manager(String name, Double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
    public void getDetails(){
        System.out.println(getName()+" "+ getSalary() + " "+ department);
    }
}


public class OOP {
    public static void main(String[] args) {
        Employee obj1 = new Employee("John", 10030.4);
        Employee obj2 = new Manager("Steve", 13030.4, "Manager");
        obj1.getDetails();
        obj2.getDetails();
    }
}
