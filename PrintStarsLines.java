import java.util.Scanner;

class PrintStarsLines{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of stars to be printed :");
		int n=obj.nextInt();
		System.out.print("Enter number of lines the stars to be printed :");
		int N=obj.nextInt();
		for(int i=0;i<N;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}