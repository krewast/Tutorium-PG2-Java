import java.util.Scanner;

public class Section4 {

  int start = 1;
  
  public static void main(int[] args) {

    if (args != null){
      start = args[0]  //Fehlender Strichpunkt
    }
    
    System.out.println("Die Ursprungszahl ist: " + start);  //Variable "start" nicht vorhanden (static)
    Scanner sc = new Scanner(System.in);
        
    double d1 = add(start, sc.nextInt()); //Variable "start" nicht vorhanden (static)
    
    double d2 = sub(start, sc.nextFloat());  //Float statt Integer als Übergabewert
    
    test(20);
  }
  
  public static void add(int start, int add){
    return (start + add);  //Falscher Rückgabewert der Funktion
  }
  
  public int sub(int start, int sub){ //Aufruf der Funktion nicht möglich (static)
    return (start - sub);
  }
  
  public static void test(int start){
    if (start > 10){
      int value = 5;
    }
    else {
      int value = -5;
    }
    
    System.out.println(value);  //Der Lebensraum der Variable "value" endet mit dem Block der if-Bedinung
  }

}