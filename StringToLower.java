class StringToLower{
	public static void main(String [] args){
        	String s = "JAVAPROGRAMS"; 
		System.out.print("1. Entered String : "+s);
		char [] ch2 = s.toCharArray();
		for(int i=0; i<s.length(); i++){
            		if(ch2[i] >= 'A' && ch2[i] <= 'Z'){
                		ch2[i] = (char) (ch2[i]+32);
             		}
        	} 
		String str2 = new String(ch2); 
        	System.out.print("\n2. String after lower case : "+str2);
	}
}

