package h3;

public class Mensch {
    public String name;
    public int gebJahr;
    public int alter;

    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    public void setAlter() {
        this.alter = 2025 - gebJahr;
    }

    public String getName() {
        return name;

    }

    public int getGebJahr() {
        return gebJahr - 1;

    }

    public int getAlter() {
        return alter;

    }
}