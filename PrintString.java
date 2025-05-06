class PrintString{
	public static void main(String[] args){
		String s = "India123##";
		System.out.print("1.Entered String : "+s);
		int countAlpha = 0;
		int countNum = 0;
		int countSChar = 0;
		for(int i=0; i<s.length(); i++){
			if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
				countAlpha++;
			} else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
				countNum++;
			}
			else{
				countSChar++;
			}
		}
		System.out.print("\n2.No. of alphabets : "+countAlpha+"\n3. No. of numbers : "+countNum+"\n4. No. of special characters : "+countSChar);	
	}
}

/* 
if(Character.isLetter(s.charAt(i))){
				countAlpha++;
			}
} */	