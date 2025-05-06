import java.util.Scanner;

class SelectionSort{
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
		for(int i=0; i<n-1; i++){
			int min=i;
			for(int j=i+1; j<n; j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			temp= a[i];
			a[i]= a[min];
			a[min]= temp;

			System.out.print("\nStep "+ (i+1)+ " : ");
			for(int k=0; k<n; k++){
				System.out.print(a[k]+" ");
			}

		}
		System.out.print("\n\nElements after Sorting :\n");
		for(int i=0; i<n; i++){
			System.out.print("\nElement "+ (i+1) +" : "+a[i]);
		}
	}
}

		
		