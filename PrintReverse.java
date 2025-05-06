class PrintReverse{
	public static void main(String[] args){
		String s = "India123##";
		System.out.print("1.Entered String : "+s+"\n\n2. Reversed String : ");
		for(int i = s.length() - 1; i >=0; i--){
			System.out.print(s.charAt(i)+"");
		}
	}
}
