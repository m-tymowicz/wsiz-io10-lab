package pl.wsiz.podyplomowe.io.part2;

public class Manager extends Employee {

    Manager(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    private Manager() {
        super();
    }

    static Manager read() {
        Manager manager = new Manager();

        manager.readFields();

        return manager;
    }

    @Override
    void print() {
        System.out.print("K ");
        super.print();
    }
}
