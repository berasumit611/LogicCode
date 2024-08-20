package stringProgram;
//Java Program to count the total number of characters in a string
//ignore space
public class CharacterCounter {
		public static void main(String[] args) {
			String s="i love java so much";//char->15
			int i=0,count=0;
			while(i<s.length()){
				if(s.charAt(i)!=' ') {
					count++;
				}
				i++;
			}
			System.out.println("\""+s+"\""+" has "+count+" charcter");
		}

}
