package prins.riana.SkiWax;

import java.util.Scanner;

public class Wax {
    private String color;
    private String type;

    //decide which color & type of wax is needed
    public void createWax(int temp, String snow) {
        String c = "White";
        String t = "Standard";

        if (temp <= 5) {
            c = "White";
        } else if (temp <= 18) {
            c = "Green";
        } else if (temp <=26) {
            c = "Blue";
        } else if (temp <= 31) {
            c = "Violet";
        } else if (temp < 38) {
            c = "Red";
        } else if (temp > 38) {
            c = "Yellow";
        } else {
            c = "no color";
        }
        if (c.equals("Yellow") || (c.equals("White"))) {
            t = "Standard";
        } else {
            if (snow.equals("powder")) {
                t = "Special";
            } else if (snow.equals("firm")) {
                t = "Standard";
            } else if (snow.equals("crusty")) {
                t = "Extra";
            } else {
                t = "don't know";
            }
        }
        this.color = c;
        this.type = t;
    }
    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }



}




