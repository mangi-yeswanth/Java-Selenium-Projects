package basic;

public class math {
		public static void main(String[] args) {
			args[0]="10";
			args[1]="5";
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println("addition is"+(num1+num2));
			System.out.println("subtraction is"+(num1-num2));
			System.out.println("multiplication is"+(num1*num2));
			System.out.println("division is"+(num1/num2));

	}


}