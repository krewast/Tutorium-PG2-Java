public class MainCaesarCode {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Verschlüsselte Nachricht: " + encoding("Programmieren", 3));
    
    System.out.println("Entschlüsselte Nachricht " +decryption("Moldoxjjfbobk", 3));
  }
  

  public static String encoding(String text, int key) {
    
    String output = "";
    for (char c : text.toCharArray()){
      int cInt = (int) c;
      for (int i = 1; i <= key; i++){
        cInt--;
        if (cInt == 'a'-1){
          cInt = 'a'-1 + 26;
        }
      }
      output += (char)(cInt);
    }
    
    return output;
  }
  
  public static String decryption(String text, int key){
    
    String output = "";
    for (char c : text.toCharArray()){
      
      int cInt = (int) c;
      for (int i = 1; i <= key; i++){
        cInt++;
        if (cInt == 123){
          cInt = 123 - 26;
        }
      }
      output += (char)(cInt);
    }
    
    return output;
  }

}