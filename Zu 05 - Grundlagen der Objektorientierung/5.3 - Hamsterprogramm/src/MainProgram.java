package de.oth.pg2.hamster;

import java.util.Scanner;

public class MainProgram {

    private static FieldObject[][] field;
    private static Hamster peter;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        initField();
        int i = 0;
        do {
            printField();
            i = sc.nextInt();
            
            switch (i) {
                case 1:
                    // "1) Links drehen"
                    peter.left();
                    break;
                    
                case 2:
                    // "2) Rechts drehen"
                    peter.right();
                    break;
                    
                case 3:
                    // "3) Vorwärts gehen"
                    field = peter.goForward(field);
                    break;
                    
                case 4:
                    // "4) Anzahl gefressener Körner ausgeben"
                    System.out.println(peter.getName() + " hat bereits " + peter.getCornAmount() + " Körner gefressen");
                    break;
                    
                case 5:
                    // "5) Programm beenden"
                    break;
                    
                default:
                    System.out.println("Falsche Eingabe");
            }
        } while (i != 5);
        
        sc.close();
    }

    public static void initField() {
        Wall wall = new Wall('#');
        Corn corn = new Corn('*');
        EmptyField eField = new EmptyField(' ');
        field = new FieldObject[10][10];
        peter = new Hamster('>', "Peter", 3, 2);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = eField;
            }
        }
        for (int i = 0; i < 10; i++) {
            field[0][i] = wall;
            field[9][i] = wall;
        }
        for (int i = 0; i < 9; i++) {
            field[i][0] = wall;
            field[i][9] = wall;
        }

        field[4][4] = wall;
        field[4][5] = wall;
        field[8][5] = wall;
        field[7][5] = wall;

        field[5][7] = corn;
        field[5][3] = corn;
        field[peter.getX()][peter.getY()] = peter;
    }

    public static void printField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j].getSymbol());
            }
            System.out.println();
        }

        System.out.println("Wählen Sie eine Funktion aus:");
        System.out.println("1) Links drehen:");
        System.out.println("2) Rechts drehen:");
        System.out.println("3) Vorwärts gehen:");
        System.out.println("4) Anzahl gefressener Körner ausgeben:");
        System.out.println("5) Programm beenden:");
    }
}
