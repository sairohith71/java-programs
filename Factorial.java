import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n=obj.nextInt();
		System.out.print("Factorial of "+n+":");
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		System.out.print("Factorial of "+n+" is "+fact);
	}
}