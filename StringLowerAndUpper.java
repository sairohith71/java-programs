class StringLowerAndUpper{
	public static void main(String[] args){
        	String s = "JavaPrograms"; 
		System.out.print("1.Entered String : "+s);
        	int mid = s.length()/2; 
        	String s1 = s.substring(0,mid); 
        	String s2 = s.substring(mid);

		//To Lower Case
		char [] ch1 = s1.toCharArray();
		for(int i=0; i<ch1.length; i++){
            		if(ch1[i] >= 'a' && ch1[i] <= 'z'){
                		ch1[i] = (char) (ch1[i]-32);
             		}
        	}
		String str1 = new String(ch1);
		
		//To Upper Case
		char [] ch2 = s2.toCharArray();
		for(int i=0; i<s2.length(); i++){
            		if(ch2[i] >= 'A' && ch2[i] <= 'Z'){
                		ch2[i] = (char) (ch2[i]+32);
             		}
        	} 
		String str2 = new String(ch2); 

        	System.out.print("\nFirst Half : "+str1+"\nSecond Half : "+str2);
    	}
}