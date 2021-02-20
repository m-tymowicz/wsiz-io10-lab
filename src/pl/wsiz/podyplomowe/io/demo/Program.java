package pl.wsiz.podyplomowe.io.demo;

import pl.wsiz.podyplomowe.io.demo.package1.Animal;
import pl.wsiz.podyplomowe.io.demo.package1.DogFactory;
import pl.wsiz.podyplomowe.io.demo.package2.Kangaroo;
import pl.wsiz.podyplomowe.io.demo.package3.Growable;
import pl.wsiz.podyplomowe.io.demo.package3.Tree;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Growable> growables = new ArrayList<>();
        Animal animalDog = DogFactory.getDog();

        growables.add(new Tree(10));
        growables.add(animalDog);
        growables.add(new Kangaroo());

        for (Growable growable : growables) {
            System.out.println("Growable: " + growable);
            growable.grow();
        }

        for (Growable growable : growables) {
            System.out.println("Growable: " + growable);
        }
    }
}
