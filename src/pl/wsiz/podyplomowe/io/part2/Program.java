package pl.wsiz.podyplomowe.io.part2;

public class Program {

    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new Employee("Jan", "Kowalski", 32);
        Employee employee2 = new Employee("Anna", "Nowak", 30);

        company.add(employee1);
        company.add(employee2);

        Employee employee3 = new Employee("Anna", "Nowak", 30);
        company.add(employee3);

        company.printEmployees();
    }
}
