class StringToUpper{
	public static void main(String [] args){
        	String s = "JavaPrograms"; 
		System.out.print("1. Entered String : "+s);
		char [] ch1 = s.toCharArray();
		for(int i=0; i<ch1.length; i++){
            		if(ch1[i] >= 'a' && ch1[i] <= 'z'){
                		ch1[i] = (char) (ch1[i]-32);
             		}
        	}
		String str1 = new String(ch1); 
        	System.out.print("\n2. String after capitalizing : "+str1);
	}
}

