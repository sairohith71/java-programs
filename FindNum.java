import java.util.Scanner;

class FindNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Element number of elements to be entered : ");
		int n = sc.nextInt();
		System.out.print("Enter the elements : ");
		int a[]= new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Element "+ (i+1) +" : ");
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the element to be found : ");
		int num = sc.nextInt();
		boolean stmt = false;
		for(int i=0; i<n;i++){
			if(num==a[i]){
				stmt = true;
				System.out.print("Element "+num+" is found at index "+i+" of the array.");
				break;
			}
		}
		if(!stmt){
			System.out.print("Element "+num+" is not found in the array.");
		}
	}
}