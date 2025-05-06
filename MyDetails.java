import java.util.Scanner;

class MyDetails{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("=====\nEnter Your Details :\n====");
		System.out.print("\nEnter your name : ");
		String name = obj.nextLine();
		System.out.print("\nEnter Gender(M/F) : ");
		char gender = obj.next().charAt(0);
		System.out.print("\nEnter your age : ");
		int age = obj.nextInt();
		System.out.print("\nEnter your Aadhar number : ");
		long aanum = obj.nextLong();
		System.out.print("\n====\n"+name+"'s details :\nName : "+name+"\nGender : "+gender+"\nAge : "+age+"\nAadhar number : "+aanum);
	}
}