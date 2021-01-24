package pl.wsiz.podyplomowe.io.part2;

public class Program {

    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new Employee("Jan", "Kowalski", 32);
        Employee employee2 = new Employee("Anna", "Nowak", 30);
        Employee employee3 = new Employee("Katarzyna", "Janda", 21);

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        company.printEmployees();

        company.removeEmployee(40);
        company.printEmployees();

        company.removeEmployee(2);
        company.printEmployees();
    }
}
