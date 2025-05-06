import java.util.Scanner;

class EvenAndOddCount{
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
		int even=0;
		int odd=0;
		for(int i=0; i<n; i++){
			if(a[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.print("\nEven count : "+even+"\nOdd count : "+odd);
	}
}