package p2;

public class LetterGame {
    public String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
    public String word = "";
    public int[] a;

    public void setWord(int[] a) {

        char[] charKeyString = keyString.toCharArray();
        char[] ergebnisWort = new char[a.length];

        boolean check = true;

        for (int i = 0; i<a.length; i++) {

            if (a[i] >= charKeyString.length-1) {
                System.out.println("Die Zahl " + a[i] + " ist zu groß!");
                check = false;
                break;

            } else {
                ergebnisWort[i] = charKeyString[a[i]];
            }
        }

        if (check) {
            word = new String(ergebnisWort);
            System.out.println(word);
        } else {
            word = "";
            System.out.println("Wort kann nicht generiert werden");
        }
    }

    public String findCode(String s) {

        char[] charS = s.toCharArray();

        int [] ergebnisArray = new int[charS.length];

        boolean check = true;

        for (int i = 0; i<charS.length; i++) {
            char aktuellerBuchstabe = charS[i];
            
            aktuellerBuchstabe = Character.toUpperCase(aktuellerBuchstabe);

            int index = keyString.indexOf(aktuellerBuchstabe);

            if (index == -1) {
                check = false;
                System.out.println("index = -1");
                break;
            }

            ergebnisArray[i] = index;
        }

        StringBuilder codeBuilder = new StringBuilder();


        if (check) {
            for (int i = 0; i<ergebnisArray.length; i++) {
                codeBuilder.append(ergebnisArray[i]);

                if (i < ergebnisArray.length - 1) { 
                    codeBuilder.append(" ");
                }
            } 
            return codeBuilder.toString();
        }
        System.out.println("Array kann nicht generiert werden");
        return "";
    }
}
