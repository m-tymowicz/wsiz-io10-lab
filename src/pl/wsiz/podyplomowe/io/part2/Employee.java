package pl.wsiz.podyplomowe.io.part2;

public class Employee {
    String firstname;
    String lastname;
    int age;

    void print() {
        System.out.printf("%s %s %d\n", firstname, lastname, age);
    }
}
