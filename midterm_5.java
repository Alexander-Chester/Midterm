/** Removes any doubled letters from a string.*/

private String removeDoubledLetters(String str) {
	
	String result = "";
	
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (i == 0 || ch != str.charAt(i -1)) {
				result += ch;
			}
		}
			return result;
	}