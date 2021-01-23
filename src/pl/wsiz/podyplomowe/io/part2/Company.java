package pl.wsiz.podyplomowe.io.part2;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();

    void add(Employee employee) {
        employees.add(employee);
    }
}
