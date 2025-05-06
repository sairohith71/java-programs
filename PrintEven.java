import java.util.Scanner;

class PrintEven{
	void printEven(int a[], int n){
		int max = a[0];
		System.out.print("\nYou've entered :\n");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEven Numbers are :\n");
		for(int i=0; i<n; i++){
			if(a[i]%2==0){
				System.out.print(a[i]+"\n");
			}
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
		PrintEven p = new PrintEven();
		p.printEven(a,n);
	}
}