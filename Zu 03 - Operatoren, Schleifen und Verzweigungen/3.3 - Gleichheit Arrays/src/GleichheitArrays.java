public class GleichheitArrays {
    public static void main(String[] args) {
        // Initalisieren beider eindimensionalen int-Arrays
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,2,4};
        
        // Überprüfen der beiden Arrays auf Gleichheit mit Hilfe der Funktion
        if(arraysEqual(arr1,arr2)) {
            System.out.println("Arrays stimmen überein");
        } else {
            System.out.println("Arrays stimmen nicht überein");
        }
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        //Falls eines der beiden Arrays leer ist oder die Länge der beiden unterschiedlich, wird false zurückgegeben
        if(arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return false;
        } else {
            for(int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]) {
                    // Wenn auch nur ein Element in einem der Arrays anders ist, gibt die Funktion sofort "false" zurück
                    return false;
                }
            }
            // Wenn alle Elemente gegenseitig überprüft wurden, und gleich sind, gibt die Funktion "true" zurück
            return true;
        }
    }
}
