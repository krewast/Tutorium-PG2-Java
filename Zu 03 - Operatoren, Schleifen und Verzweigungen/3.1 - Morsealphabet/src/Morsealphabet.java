import java.util.Scanner;

public class Morsealphabet {
    public static void main(String[] args) {
        String morseCode = "";
        Scanner sc = new Scanner(System.in);
        
        // 5 Zeichen einlesen und an String anfügen
        System.out.println("Bitte geben Sie nacheinander fünf 'Morsebuchstaben' ein und bestätigen jeweils mit Enter: ");
        for (int i = 0; i < 5; i++) {
            morseCode += sc.next();
        }
        sc.close();
        
        // Eingelesenen Morsecode umwandeln
        int output = convertMorseCodeToInt(morseCode);
        
        // Überprüfen, ob eingegebener Morsecode einer Zahl von 0-9 zugeordnet werden konnte
        if(output >= 0) {
            System.out.println(output);
        } else {
            System.err.println("Error: Kein korrekter Morsecode");
        }
    }

    public static int convertMorseCodeToInt(String morse) {
        if(morse.equals("-----")){
            return 0;
        }
        else if(morse.equals(".----")){
            return 1;
        }
        else if(morse.equals("..---")){
            return 2;
        }
        else if(morse.equals("...--")){
            return 3;
        }
        else if(morse.equals("....-")){
            return 4;
        }
        else if(morse.equals(".....")){
            return 5;
        }
        else if(morse.equals("-....")){
            return 6;
        }
        else if(morse.equals("--...")){
            return 7;
        }
        else if(morse.equals("---..")){
            return 8;
        }
        else if(morse.equals("----.")){
            return 9;
        }
        return -1;
    }
}
