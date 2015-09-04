package Aufgabe4;

public class Aufgabe4 {

	public static void main(String[] args) {
		//Initalisieren beider eindimensionalen int-Arrays
		int[] arr1 = {1,2,4};
		int[] arr2 = {1,2,4};
		
		//Überprüfen der beiden Arrays auf Gleichheit
		if(!f(arr1,arr2)) {
			System.out.println("Arrays stimmen nicht überein");
		} else {
			System.out.println("Arrays stimmen überein");
		}
	}
	
	
	public static boolean f(int[] arr1, int[] arr2) {
		//Falls eines der beiden Arrays leer ist oder die Länge der beiden unterschiedlich, wird false zurückgegeben
		if(arr1 == null || arr2 == null || arr1.length != arr2.length) {
			return false;
		} else {
			for(int i=0; i!=arr1.length; i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
			return true;
		}
	}

}
