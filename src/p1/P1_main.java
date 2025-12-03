package p1;

public class P1_main {
    public static void main(String[] args) {
        Bruch a = new Bruch(5, 2);
        Bruch b = new Bruch(3, 4);

        System.out.println(multFrac(5, 2, 3, 4).toString());
        System.out.println(b);
        multFrac(a, b); 
        
    }

    public static Bruch multFrac(int z1, int n1, int z2, int n2) {
        int zGes = z1 * z2;
        int nGes = n1 * n2;

        System.out.println(zGes + ":" + nGes);

        return new Bruch(zGes, nGes);
    } 

    public static Bruch multFrac(Bruch a, Bruch b) {
        int zGes = a.z * b.z;
        int nGes = a.n * b.n;

        System.out.println(zGes + ":" + nGes);

        return new Bruch(zGes, nGes);

    }
}
