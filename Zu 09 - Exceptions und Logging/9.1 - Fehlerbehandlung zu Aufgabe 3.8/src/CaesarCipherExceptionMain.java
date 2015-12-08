
public class CaesarCipherExceptionMain
{
	public static void main(String[] args) {
		try {
			System.out.println(CaesarCipher.encryptAlternative1("abc", 3));
			
			System.out.println(CaesarCipher.decryptAlternative1("xyz", 3));
		} catch (IllegalCapitalLetterException e) {
			e.printStackTrace();
		} catch (InvalidCharacterException e) {
			e.printStackTrace();
		}
	}

}
