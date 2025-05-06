import java.util.Scanner;

class FindDuplicate{
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
		
		int b[]=new int[n];
		boolean stmt = false;
		for(int i=0; i<n;i++){
			for(int j=i+1; j<n; j++){
				if(a[i]==a[j]){
					b[j] = a[i];
				}
			}
		}
		
		System.out.print("Duplicate numbers : \n");
		for(int i=0; i<n; i++){
			if(b[i]!=0){
				stmt = true;
				System.out.print(b[i]);
			}
		}
		if(!stmt){
			System.out.print("Duplicates not found!");
		}
		
	}
}


/* for using single array
		boolean stmt = false;
		for(int i=0; i<n;i++){
			for(int j=i+1; j<n; j++){
				if(a[i]==a[j]){
					stmt=true;
					System.out.print(a[i]);
					break;
				}
			}
		}
		if(!stmt){
			System.out.print("Duplicates not found!");
		}
*/
