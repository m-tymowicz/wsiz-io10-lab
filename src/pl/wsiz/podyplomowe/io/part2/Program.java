package pl.wsiz.podyplomowe.io.part2;

public class Program {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Kowalski", 32);
        employee1.print();

        Employee employee2 = new Employee("Anna", "Nowak", 30);
        employee2.print();

        Employee employee3 = Employee.read();
        employee3.print();
    }
}
