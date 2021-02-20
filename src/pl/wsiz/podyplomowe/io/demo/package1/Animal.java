package pl.wsiz.podyplomowe.io.demo.package1;

import pl.wsiz.podyplomowe.io.demo.package3.Growable;

public abstract class Animal implements Growable {

    private int weight;

    protected Animal(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" + "weight=" + weight + '}';
    }

    public abstract void grow();

    protected void grow(int amount) {
        weight += amount;
    }

    public int getWeight() {
        return weight;
    }
}
