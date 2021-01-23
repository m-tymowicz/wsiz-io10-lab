package pl.wsiz.podyplomowe.io.part2;

public class Program {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.firstname = "Jan";
        employee1.lastname = "Kowalski";
        employee1.age = 32;
        employee1.print();

        Employee employee2 = new Employee();
        employee2.firstname = "Anna";
        employee2.lastname = "Nowak";
        employee2.age = 30;
        employee2.print();
    }
}
