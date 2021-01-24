package pl.wsiz.podyplomowe.io.part2;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(Employee newEmployee) {
        for (Employee employee : employees) {
            if (employee.isEqual(newEmployee)) {
                System.out.println("Pracownik o tych samych danych znajduje się już na liście!");
                return;
            }
        }

        employees.add(newEmployee);
    }

    void addEmployee() {
        Employee newEmployee = Employee.read();

        addEmployee(newEmployee);
    }

    void printEmployees() {
        System.out.println("------------------");

        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%d  ", i + 1);

            Employee employee = employees.get(i);
            employee.print();
        }

        System.out.println("------------------");
    }
}
