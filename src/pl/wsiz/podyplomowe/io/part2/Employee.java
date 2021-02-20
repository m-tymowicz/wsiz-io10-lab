package pl.wsiz.podyplomowe.io.part2;

import java.util.Scanner;

public abstract class Employee {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final Sex sex;
    private final int salary;
    private final String[] skills;

    Employee(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    void print() {
        char sexChar = sex == Sex.FEMALE ? 'K' : 'M';
        String skillsStr = String.join(", ", skills);

        System.out.printf("%s %s %d %c %dzł [%s]\n", firstname, lastname, age, sexChar, salary, skillsStr);
    }

    boolean isEqual(Employee employee) {
        return firstname.equals(employee.firstname) && lastname.equals(employee.lastname) && age == employee.age;
    }
}
