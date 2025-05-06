import java.util.Scanner;
import java.util.Arrays;

class BubbleSort{
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
		int temp;
		boolean swapped;
		for(int c=0; c<n-1; c++){
			swapped = false;
			for(int b=0; b<n-c-1; b++){
				if(a[b]>a[b+1]){
					temp = a[b];
					a[b] = a[b+1];
					a[b+1] = temp;
					swapped = true;
				}
			}
			System.out.print("\nStep "+ (c+1)+ " : ");
			for(int i=0; i<n; i++){
				System.out.print(a[i]+" ");
			}

			if(!swapped){
				break;
			}
		}	

		System.out.print("\n\nElements after Sorting :\n");
		for(int i=0; i<n; i++){
			System.out.print("\nElement "+ (i+1) +" : "+a[i]);
		}
	}
}
