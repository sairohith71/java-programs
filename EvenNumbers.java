import java.util.Scanner;

class EvenNumbers{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n=obj.nextInt();
		System.out.print("Even numbers from 1 to "+n+" are :");
		for(int i=1;i<n;i++){
			if(i%2==0){
				System.out.print(i+",");
			}
		}
	}
}