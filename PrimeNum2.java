import java.util.Scanner;

class PrimeNum2{

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
		
		System.out.print("\nPrime numbers are :\n");
		for(int i=0; i<n; i++){
			boolean prime = true;
			if(a[i]<=1){
				prime=false;;
			}
			for(int j=2; j<=Math.sqrt(a[i]); j++){
				if(a[i]%j==0){
					prime = false;
				}
			}
		
			if(prime){
				System.out.print(a[i]+" ");
			}
		}
}
}
