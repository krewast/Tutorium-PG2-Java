package de.oth.pg2_6.aufgabe_2.b;

import java.util.ArrayList;
import java.util.List;

import de.oth.pg2_6.aufgabe_2.COLOR;
import de.oth.pg2_6.aufgabe_2.LKW;

public class Run {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<LKW> fuhrpark = new ArrayList<LKW>();

        fuhrpark.add(new LKW("NM-TG 790", true, COLOR.RED, 150, 4, 1000));
        fuhrpark.add(new LKW("NM-AA 80", true, COLOR.RED, 150, 4, 1000));
        fuhrpark.add(new LKW("NM-FF 70", false, COLOR.BLACK, 95, 6, 1500));

        LKW lkw4 = new LKW(1500);
        LKW lkw5 = new LKW(1550);

        if (fuhrpark.contains(lkw4)) {
            System.out.println("Ist vorhanden");
        } else {
            System.out.println("Ist nicht vorhanden");
        }

        if (fuhrpark.contains(lkw5)) {
            System.out.println("Ist vorhanden");
        } else {
            System.out.println("Ist nicht vorhanden");
        }
    }

}
