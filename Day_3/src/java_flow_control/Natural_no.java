package java_flow_control;
import java.util.*;
public class Natural_no {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(n>0) {
			int sumofnum = n*(n+1)/2;
			System.out.println("The sum of "+ sumofnum+" natural numbers is " +n);
			
		}
		else {
			System.out.println("the number is not natural");
			
		}

	}

}

