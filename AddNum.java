import java.util.Scanner;

class AddNum{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int a = obj.nextInt();
		System.out.print("\nEnter 2nd number : ");
		int b = obj.nextInt();
		int c = a + b;
		System.out.print("\nSum of two numbers is : "+c);
	}
}