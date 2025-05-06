class StringLoweUpper{
	public static void main(String[] args) {
        	String s = "JavaPrograms"; 
		System.out.print("1.Entered String : "+s);
        	int mid = s.length()/2; 
        	String s1 = s.substring(0,mid).toLowerCase(); 
        	String s2 = s.substring(mid).toUpperCase(); 
        	System.out.print("\nFirst Half : "+s1+"\nSecond Half : "+s2);
    	}
}