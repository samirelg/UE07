package p2;

import java.util.Arrays;;

public class P2_main {      
    public static void main(String[] args) {

    int[] a = {0, 1, 2, 43};
    int[] b = {6, 7, 23, 7};
    int[] c = {14, 2, 0, 0, 19, 19};

    String d = "UNI";
    String e = "z";

    LetterGame test = new LetterGame();
    
    String code_d = test.findCode(d);

    String[] code_d_teile = code_d.split(" ");

    System.out.println(code_d);
    System.out.println(Arrays.toString(code_d_teile));

    int[] code_zahlen_d = new int[code_d_teile.length];

    for (int i = 0; i < code_zahlen_d.length; i++) {
        code_zahlen_d[i] = Integer.parseInt(code_d_teile[i]);
    }

    test.setWord(a);
    test.setWord(b);
    test.setWord(c);

    test.setWord(code_zahlen_d);

    String code_e = test.findCode(e);
    System.out.println(code_e);


    }

}