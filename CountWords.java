class CountWords{
	public static void main(String [] args){
		String s="Hello World! I'm Balaji.";
		int count = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == ' ' || (s.charAt(i) == '!' && s.charAt(i) - 1!= ' ') || (s.charAt(i) == '.' && s.charAt(i) - 1!= ' ') || (s.charAt(i) == ',' && s.charAt(i) - 1!= ' ') || (s.charAt(i) == '?' && s.charAt(i) - 1!= ' ')){
				count++;
			}
		}
		System.out.print("Entered String : "+s+"\nNo. of words in the string : "+count);
	}
}