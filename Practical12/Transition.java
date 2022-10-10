package Practical12;

class Bank {

    private String name;

    Bank(String name) {

        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

class Branch{
    private String name;

    Branch(String name){
        this.name = name;
    }

    public String getBranceName() {
        return this.name;
    }
}

public class Transition {
    public static void main(String[] args) {
        Bank bank = new Bank("BOB");
        Employee emp = new Employee("Aary Shah");
        Branch brc = new Branch("Zalod");
        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName() + " in " + brc.getBranceName() + " branch");
        System.out.println("21CE124-Aary Shah");
    }
}
