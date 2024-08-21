import java.util.Scanner;

class atm{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("WELCOME TO JAVA BANK. SELECT YOUR OPTION: ");
		System.out.println("1. WITHDRAWAL");
		System.out.println("2. DEPOSIT");
		System.out.println("3. CHECK BALANCE");
		System.out.println("4. EXIT");
		int a= sc.nextInt();
		int b= 500;
		switch(a){
			case 1:
				System.out.println("Enter the amount you want to withdraw: ");
				int with=sc.nextInt();
				System.out.println(with+ " amount has been withdrawn");
				System.out.println("please collect your cash and take out your card");
				b=b-with;
				System.out.println("So your current bank balance is: "+b);
				break;
			case 2:
				System.out.println("Enter the amount you want to deposit: ");
				int dep= sc.nextInt();
				System.out.println(dep+ " amount has been succesfully deposited");
				System.out.println("please take out your card");
				b=b+dep;
				System.out.println("So your current bank balance is: "+b);
				break;
			case 3:
				System.out.println("Your current amount in your bank is: "+b);
				break;
			case 4:
			    System.out.println("Thank you for using the ATM. Goodbye!");
			    break;
			default:
				System.out.println("SOME ERROR HAS OCCURED PLEASE RECHECK YOUR OPTION");
		}
	}
}

