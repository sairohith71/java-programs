import java.util.Scanner;

class PrintNumbers{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of numbers to be printed : ");
		int n=obj.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
		}
	}
}
