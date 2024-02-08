package practice;

public class javaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String inputString = "My name is Khan";
	        String[] words = inputString.split(" ");
	        
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].equals("Khan")) {
	                words[i] = new StringBuilder(words[i]).reverse().toString();
	                break; // Assuming "Khan" appears only once
	            }
	        }
	        
	        String result = String.join(" ", words);

	}

}
