package pl.wsiz.podyplomowe.io.demo.package2;

import pl.wsiz.podyplomowe.io.demo.package1.Animal;

public class Kangaroo extends Animal {

    public Kangaroo() {
        super(30);
    }

    @Override
    public String toString() {
        return "Kangaroo{" + "weight=" + getWeight() + '}';
    }

    @Override
    public void grow() {
        if (getWeight() < 30) {
            grow(2);

        } else {
            grow(5);
        }
    }
}
