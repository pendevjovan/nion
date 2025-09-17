import java.util.*;

interface Payable {
    double pay();
}

abstract class Employee implements Payable {
    protected final String id, name;

    protected Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Employee e && id.equals(e.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + id + ", " + name + ")";
    }
}

class Salaried extends Employee {
    private final double monthlySalary;

    public Salaried(String id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double pay() {
        return monthlySalary;
    }
}

class Hourly extends Employee {
    private final double rate;
    private final double hours;

    public Hourly(String id, String name, double rate, double hours) {
        super(id, name);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return rate * Math.min(160, hours) + Math.max(0, hours - 160) * rate * 1.5;
    }
}

class PayrollDemo {
    public static void main(String[] args) {
        List<Employee> staff = List.of(
                new Salaried("E1", "Ana", 1200),
                new Hourly("E2", "Boris", 10, 172)
        );
        for (Payable p : staff) System.out.println(p + " -> " + p.pay());
    }
}