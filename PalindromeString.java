class PalindromeString{
	public static void main(String[] args){
		String s = "Madam";
		System.out.print("1.Entered String : "+s+"\n\n2. Reversed String : ");
		String p = "";
		for(int i = s.length() - 1; i>=0; i--){
			p=p+s.charAt(i);
		}
		System.out.print(p);
		if(s.equalsIgnoreCase(p)){
			System.out.print("\nThe string is palindrome");
		}else{
			System.out.print("\nThe string is not palindrome");
		}
	}
}
		