package p1;

public class Bruch {
    public int z;
    public int n;

    public Bruch(int zaehler, int nenner) {
        this.z = zaehler;
        this.n = nenner;
    }

    public String toString() {
        return this.z + ":" + this.n;
    }
}
