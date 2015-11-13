package de.oth.pg2_5.aufgabe_4;

import java.util.ArrayList;
import java.util.List;

import de.oth.pg2_5.aufgabe_3.*;

public class Run {

    public static void main(String[] args) {
        List<Vogel> vogelLst = new ArrayList<>();

        vogelLst.add(new Drossel("Peter"));
        vogelLst.add(new Amsel("Franz"));
        vogelLst.add(new Pinguin("Sophie"));

        for (Vogel vogel : vogelLst) {
            System.out.println(vogel.getName());
        }
    }
}
