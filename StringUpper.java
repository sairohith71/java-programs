class StringToUpper{
	public static void main(String [] args){
        	String s = "JavaPrograms"; 
		System.out.print("1. Entered String : "+s);
		char [] ch1 = s.toCharArray();
		char [] ch2 = s.toCharArray();
		for(int i=0; i<ch1.length; i++){
            		if(ch1[i] >= 'a' && ch1[i] <= 'z'){
                		ch1[i] = (char) (ch1[i]-32);
             		}
        	}
		for(int i=0; i<ch2.length; i++){
            		if(ch2[i] >= 'A' && ch2[i] <= 'Z'){
                		ch2[i] = (char) (ch2[i]+32);
             		}
        	}
		String str1 = new String(ch1); 
		String str2 = new String(ch2); 
        	System.out.print("\n2. String after capitalizing : "+str1+"\n3. String after lower case : "+str2);
	}
}

