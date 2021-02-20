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

    void addDeveloper() {
        Employee newEmployee = Developer.read();

        addEmployee(newEmployee);
    }

    void addManager() {
        Employee newEmployee = Manager.read();

        addEmployee(newEmployee);
    }

    void removeEmployee(int employeeIndex) {
        if (employeeIndex < 1 || employeeIndex > employees.size()) {
            System.out.println("Lista nie zawiera pracownika o podanym numerze porządkowym.");
            return;
        }

        employees.remove(employeeIndex - 1);
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
