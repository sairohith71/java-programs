import java.util.Scanner;

class PrimeNum{

boolean isPrime(int n){
	if(n<=1){
		return false;
	}
	for(int i=2; i<=Math.sqrt(n); i++){
		if(n%i==0){
			return false;
		}
	}
	return true;
}

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
		PrimeNum p = new PrimeNum();
		boolean prime = false;
		System.out.print("\nPrime numbers are :\n");
		for(int i=0; i<n; i++){
			prime = p.isPrime(a[i]);
			if(prime){
				System.out.print(a[i]+" ");
			}
		}
}
}
