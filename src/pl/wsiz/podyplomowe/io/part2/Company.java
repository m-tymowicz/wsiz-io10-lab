package pl.wsiz.podyplomowe.io.part2;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();
    private final ConsoleLogger logger;

    Company(ConsoleLogger logger) {
        this.logger = logger;
    }

    void addEmployee(Employee newEmployee) {
        for (Employee employee : employees) {
            if (employee.isEqual(newEmployee)) {
                System.out.println("Pracownik o tych samych danych znajduje się już na liście!");
                logger.error("Próba dodania pracownika o tych samych danych: " + newEmployee);

                return;
            }
        }

        employees.add(newEmployee);
        logger.info("Pracownik dodany (" + newEmployee + ")");
    }

    void addDeveloper() {
        Employee newEmployee = EmployeeReader.read(EmployeeType.DEVELOPER);

        addEmployee(newEmployee);
    }

    void addManager() {
        Employee newEmployee = EmployeeReader.read(EmployeeType.MANAGER);

        addEmployee(newEmployee);
    }

    void removeEmployee(int employeeIndex) {
        if (employeeIndex < 1 || employeeIndex > employees.size()) {
            System.out.println("Lista nie zawiera pracownika o podanym numerze porządkowym.");
            logger.error("Próba usunięcia pracownika o niepoprawnym numerze porządkowym: " + employeeIndex);
            return;
        }

        Employee employee = employees.remove(employeeIndex - 1);
        logger.info("Pracownik usunięty (" + employee + ")");
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
