// Classe base Employee (Funcionário)
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
    }
}

// Subclasse Manager (Gerente) que herda de Employee
public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Método específico para gerente
    public void manageTeam() {
        System.out.println(getName() + " is managing the " + department + " team.");
    }
}

// Subclasse Developer (Desenvolvedor) que herda de Employee
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Método específico para desenvolvedor
    public void code() {
        System.out.println(getName() + " is coding in " + programmingLanguage + ".");
    }
}
