package com.damladincer.loops;
/*
 * Complete the code in this function to find and return the lowest index in the String array
stringArray that the String target occurs. If the String target does not occur in
stringArray, -1 should be returned.
Starting code:
public int indexOfFirstOccurrence(String[] stringArray, String target)
{
return -1;
}
As an example of how this function should work, this code should print 1, because the word
“Java” appears at index 1.
String[] sentence = {"Learning", "Java", "is", "fun."};
int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
System.out.println(indexOfWordJava);
Hint: you cannot compare two Strings using the == operator! This will be false unless
the two Strings are actually the same String object, not just two Strings with the same
letters. To check whether two Strings have the same letters, use the equals() method:
if (myString1.equals(myString2)).
 */
public class Question3 {

	public static void main(String[] args) {
		final int ERROR_CODE=-1;

		String[] sentence = {"Learning", "Java", null, "fun."};
		int index = indexOfFirstOccurrence(sentence, null); 
		if (index==ERROR_CODE) {
			System.out.println(ERROR_CODE);
		}else {
			System.out.println(index);			
		}
	}

	public static int indexOfFirstOccurrence(String[] stringArray, String target) {
		if (stringArray==null) {
			return -1;
		}
		int length = stringArray.length;
		for(int i=0; i<length; i++) {

			if(stringArray[i]==null) {
				if(target==null) {
					return i;
				} 
			} else {
				if(stringArray[i].equals(target)) {
					return i;
				}
			}
		}
		return -1;
	}
}