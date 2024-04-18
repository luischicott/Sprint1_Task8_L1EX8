package level1.execise8;

public class S1_T8_N1EX8_Luis_Chicott implements Reverse{

	public static void main(String[] args) {
		
		S1_T8_N1EX8_Luis_Chicott object = new S1_T8_N1EX8_Luis_Chicott();
		
		
		Reverse reverseImpl = word -> object.reverse(word);

        String original = "Caracas - Venezuela";
        String reversed = reverseImpl.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
		
		
	}
	
	public String reverse (String word) {
		StringBuilder reverseWord = new StringBuilder (word).reverse(); 	
		return reverseWord.toString(); 
	}

}
