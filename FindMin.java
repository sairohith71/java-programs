import java.util.Scanner;

class FindMin{
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
		
		int min=a[0];
		for(int i=0; i<n; i++){
			if(a[i]<min){
				min= a[i];
			}
		}
		System.out.print("Minimum element : "+min);
	}
}