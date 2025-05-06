import java.util.Scanner;

class Occurence{
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
		
		for(int i=0; i<n; i++){
			int count = 0;
			for(int j=0; j<n; j++){
				if(a[i]==a[j]&& i>j){
					break;
				}
				if(a[i]==a[j]){
					count++;
				}

			}
			if(count>0){
				System.out.print(a[i]+" occurs "+count+" times.\n");
			}
		}
	}
}
