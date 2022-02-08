import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("would you like to add or subtract your numbers?");
		String e = scanner.nextLine();
		
		System.out.println("enter one number.");
		int num = scanner.nextInt();
		System.out.println("enter another number.");
		int num2 = scanner.nextInt();
		
		
		if (e.equalsIgnoreCase("add")) {
			System.out.println(num + num2);
		}
		else if (e.equalsIgnoreCase("subtract")) {
			System.out.println(num - num2);
			
		}
		

	}

}
