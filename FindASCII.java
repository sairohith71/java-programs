class FindASCII{
	public static void main(String [] args){
		String s = "hello";
		int c = 0;
		System.out.print("1.Entered String : "+s+"\n2. ASCII Values of each Character : \n");
		for(int i=0; i<s.length(); i++){
			c = s.charAt(i);
			System.out.print(s.charAt(i)+" -- "+c+"\n");
			
		}
	}
}
