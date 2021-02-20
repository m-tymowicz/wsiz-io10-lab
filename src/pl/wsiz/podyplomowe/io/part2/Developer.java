package pl.wsiz.podyplomowe.io.part2;

public class Developer extends Employee {

    Developer(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    private Developer() {
        super();
    }

    static Developer read() {
        Developer developer = new Developer();

        developer.readFields();

        return developer;
    }

    @Override
    void print() {
        System.out.print("P ");
        super.print();
    }
}
