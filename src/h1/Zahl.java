package h1;

public class Zahl {
    boolean even;
    boolean small;
    boolean positive;

    int num;

    public void setEven() {
        if (num%2 == 0) {
            even = true;
        } else {
            even = false;
        }
    }

    public void setSmall() {
        if (num < 100) {
            small = true;
        } else {
            small = false;
        }
        
    }

    public void setPositive() {
        if (num > 0) {
            positive = true;
        } else {
            positive = false;
        }        
    }

}
