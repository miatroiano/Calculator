import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("would you like to add,subtract, multiply, or divide your numbers?");
		String type = scanner.nextLine();
		System.out.println("are your numbers Ints, Doubles, or Floats");
		String type2 = scanner.nextLine();

		if (type2.equalsIgnoreCase("ints")) {
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
				if (num2 == 0) {
					System.out.println("“Error: Divide by Zero");
				}
				else {
					System.out.println(num / num2);
				}
				
			}
		}

		else if (type2.equalsIgnoreCase("doubles")) {
			System.out.println("enter one number.");
			Double num = scanner.nextDouble();
			System.out.println("enter another number.");
			Double num2 = scanner.nextDouble();

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
				if (num2 == 0) {
					System.out.println("“Error: Divide by Zero");
				}
				else {
					System.out.println(num / num2);
				}
				
			}
		}

		else if (type2.equalsIgnoreCase("floats")) {
			System.out.println("enter one number.");
			Float num = scanner.nextFloat();
			System.out.println("enter another number.");
			Float num2 = scanner.nextFloat();

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
				if (num2 == 0) {
					System.out.println("“Error: Divide by Zero");
				}
				else {
					System.out.println(num / num2);
				}
			}
				
		}

	}

}
