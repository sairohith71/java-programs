class StrongNumber{
	public static void main(String[] args){
		int num=145;
		int temp=num;
		int sum=0;

		while(temp>0){
			int digit = temp%10;
			int fact=1;
			for(int i=1; i<=digit; i++){
				fact=fact*i;
			}
			sum = sum+fact;
			temp=temp/10;
		}
		if(sum==num){
			System.out.print("Strong num");
		}else{
			System.out.print("Not");
		}

	}
}