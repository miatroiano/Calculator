import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("would you like to add,subtract, multiply, or divide your numbers?");
		String type = scanner.nextLine();
		
	
			System.out.println("enter one number.");
			int num = scanner.nextInt();
			System.out.println("enter another number.");
			int num2 = scanner.nextInt();

			if (type.equalsIgnoreCase("add")) {
				System.out.println(num + num2);
			}
			else if (type.equalsIgnoreCase("subtract")) {
				System.out.println(num - num2);
				
			}
			else if (type.equalsIgnoreCase("multiply")) {
				System.out.println(num * num2);
				
			}
			else if (type.equalsIgnoreCase("divide")) {
				System.out.println(num / num2);
				
			}
		}

}
