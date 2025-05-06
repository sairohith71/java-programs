import java.util.Scanner;

class PrintMax{
	int printMax(int a[], int n){
		int max = a[0];
		System.out.print("\nYou've entered :\n");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0; i<n; i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		return max;

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements to be entered : ");
		int n = sc.nextInt();
		System.out.print("Enter the elements : \n");
		int a[]= new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Element "+ (i+1) +" : ");
			a[i]=sc.nextInt();
		}
		PrintMax p = new PrintMax();
		System.out.print("\nMaxium element is "+p.printMax(a,n));
	}
}
