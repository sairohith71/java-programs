import java.util.Scanner;

class PrintEvenSum{

	int printEvenSum(int a[], int n){
		int evenSum=0;
		System.out.print("\nYou've entered :\n");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		
		for(int i=1; i<n; i++){
			if(a[i]%2==0){
				evenSum= evenSum+a[i];
			}
		}
		return evenSum;
	}

	int printOddSum(int a[], int n){
		int oddSum = 0;
		for(int i=0; i<n; i++){
			if(a[i]%2!=0){
				oddSum = oddSum+a[i];
			}
		}
		return oddSum;
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
		PrintEvenSum p = new PrintEvenSum();
		System.out.print("\nSum of even elements : "+p.printEvenSum(a,n)+"\nSum of odd elements : "+p.printOddSum(a,n));
	}
}