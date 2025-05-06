import java.util.Scanner;

class ElementsSum{
	int printSum(int a[], int n){
		System.out.print("\nYou've entered :\n");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		int sum=0;
		for(int i=0; i<n; i++){
			sum = sum + a[i];
		}
		return sum;
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
		ElementsSum p = new ElementsSum();
		System.out.print("\nSum of the entered elements : "+p.printSum(a,n));
	}
}