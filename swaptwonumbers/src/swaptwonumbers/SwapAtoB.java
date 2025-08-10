package swaptwonumbers;
import java.util.Scanner;
public class SwapAtoB {
public static void Swap(int a,int b) {
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a +" "+ b);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	SwapAtoB swap=new SwapAtoB();
	swap.Swap(x,y);
}
}