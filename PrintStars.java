import java.util.Scanner;

class PrintStars{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of stars to be printed :");
		int n=obj.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("*");
		}
	}
}