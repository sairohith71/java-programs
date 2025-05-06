import java.util.Scanner;

class FindMax{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements to be entered : ");
		int n = sc.nextInt();
		System.out.print("Enter the elements : \n");
		int a[]= new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Element "+ (i+1) +" : ");
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		for(int i=0; i<n; i++){
			if(a[i]>max){
				max= a[i];
			}
		}
		System.out.print("Maximum element : "+max);
	}
}