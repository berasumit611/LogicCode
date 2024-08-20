package stringProgram;
//Java Program to count the total number of vowels and consonants in a string
public class VowelConsonantCounter {
	static boolean contain(char x) {
		char [] vowel= {'a','e','i','o','u'};
		for(int i=0;i<vowel.length;i++) {
			if(x==vowel[i]) {
				return true;
			}
		}
		return false;
	
		
	}
	public static void main(String[] args) {
		String s="i love java";// v->5
								//c->4
		
		int i=0,vCount=0,cCount=0;
		while(i<s.length()){
			if(s.charAt(i)!=' ') {
				if(contain(s.toLowerCase().charAt(i))) {
					vCount++;
				}else {
					cCount++;
				}
			}
			i++;
		}
		System.out.println("\""+s+"\""+" has "+vCount+" vowels and "+cCount+" consonants");
	}
}
