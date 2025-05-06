import java.util.Scanner;

class ElementsProd{
	int printProd(int a[], int n){
		System.out.print("\nYou've entered :\n");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		int prod=1;
		for(int i=0; i<n; i++){
			prod = prod * a[i];
		}
		return prod;
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
		ElementsProd p = new ElementsProd();
		System.out.print("\nProduct of the entered elements : "+p.printProd(a,n));
	}
}