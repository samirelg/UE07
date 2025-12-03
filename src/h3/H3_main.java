package h3;

public class H3_main {
    public static void main(String[] args) {
        Mensch test = new Mensch();
        
        test.setName("Elsa");
        test.setGebJahr(2010);
        test.setAlter();

        System.out.println("Vorname: " + test.getName());
        System.out.println("Geburtsjahr: " + test.getGebJahr());
        System.out.println("Alter: " + test.getAlter());
    }

}
