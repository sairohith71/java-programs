import java.util.Scanner;

class PrintReverseElements{
	void printReverse(int a[], int n){
		System.out.print("\nYou've entered :\n");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEntered elements in reversed order :\n");
		for(int i = n-1; i >=0; i--){
			System.out.print(a[i]+" ");
		}

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
		PrintReverseElements p = new PrintReverseElements();
		p.printReverse(a,n);
	}
}
