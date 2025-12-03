package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {

        int[] a = {2, 7, 1, 9};
        int[] b = {2, 7, 1, 9};
        int start = 3;
        int end = 2;
        
        int[] ergebnisArray = change(a, b, start, end);

        for(int i = 0; i < ergebnisArray.length; i++) {
            System.out.println(ergebnisArray[i]);
        }
    }


    public static int[] change(int[] a, int[] b, int start, int end) {
        int[] n = null;
        int[] c = null;
        int[] d = null;
        int[] e = null;

        boolean check = true;

        if (a.length != b.length) {
        check = false;
        }

        if (check == true) {
            for (int i = 0; i<a.length; i++) {
                if(a[i] != b[i]) {
                    check = false;
                    break;
                }
            }
        }

        if (end > start && !check) {

            c = new int[a.length];

            for (int i = 0; i<a.length; i++) {
                c[i] = a[i];
            }
            return c;
        }

        if (end > start && check) {
            Arrays.sort(a);
            
            int d_laenge = end - start;
            
            d = new int[d_laenge];

            for (int j = 0; j<d_laenge; j++) {
                d[j] = a[start + j];
            }
            return d;
        }

        if (end <= start) {
            e = new int[0];
            return e;
        }
        return n;
    }
}