package oops;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

class Supervisor extends Manager {
    int teamSize;

    Supervisor(String name, int id, String department, int teamSize) {
        super(name, id, department);
        this.teamSize = teamSize;
    }

    void displaySupervisorInfo() {
        displayManagerInfo();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloperInfo() {
        displayEmployeeInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

interface BonusEligibility {
    void calculateBonus();
}

interface WorkFromHome {
    void allowWorkFromHome();
}

class LeadDeveloper extends Employee implements BonusEligibility, WorkFromHome {
    int yearsOfExperience;

    LeadDeveloper(String name, int id, int yearsOfExperience) {
        super(name, id);
        this.yearsOfExperience = yearsOfExperience;
    }

    void displayLeadDeveloperInfo() {
        displayEmployeeInfo();
        System.out.println("Years of Experience: " + yearsOfExperience);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Bonus: Calculating based on performance and experience.");
    }

    @Override
    public void allowWorkFromHome() {
        System.out.println("Work from home is allowed for lead developers.");
    }
}

public class kavitha {
    public static void main(String[] args) {
        // Single Inheritance
        Manager manager = new Manager("John", 101, "Sales");
        manager.displayManagerInfo();

        System.out.println();

        // Multilevel Inheritance
        Supervisor supervisor = new Supervisor("Emma", 102, "HR", 15);
        supervisor.displaySupervisorInfo();

        System.out.println();

        // Hierarchical Inheritance
        Developer developer = new Developer("Jake", 103, "Python");
        developer.displayDeveloperInfo();

        System.out.println();

        // Multiple Inheritance via Interfaces
        LeadDeveloper leadDeveloper = new LeadDeveloper("Sophia", 104, 8);
        leadDeveloper.displayLeadDeveloperInfo();
        leadDeveloper.calculateBonus();
        leadDeveloper.allowWorkFromHome();
    }
}
