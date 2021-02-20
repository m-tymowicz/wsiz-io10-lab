package pl.wsiz.podyplomowe.io.demo.package3;

public class Tree implements Growable {

    public Tree(int height) {
        this.height = height;
    }

    private int height;

    @Override
    public void grow() {
        height += 2;
    }

    @Override
    public String toString() {
        return "Tree{" + "height=" + height + '}';
    }

}
