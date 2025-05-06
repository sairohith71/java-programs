import java.util.Scanner;

class FindElement{
	void findElement(int a[], int n, int k){
		System.out.print("\nYou've entered :\n");
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		boolean found = false;
		for(int i=0; i<n; i++){
			if(k==a[i]){
				found = true;
				System.out.print("\nElement "+k+" found at index : "+i);
			}
		}
		if(!found){
			System.out.print("\nElement "+k+" not found in the list.");
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
		System.out.print("Enter element to be searched : ");
		int k = sc.nextInt();

		FindElement p = new FindElement();
		p.findElement(a,n,k);
	}
}
