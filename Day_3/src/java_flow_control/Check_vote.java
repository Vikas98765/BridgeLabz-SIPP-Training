package java_flow_control;
import java.util.*;
public class Check_vote {
		public static void main(String[] args) {

			Scanner s= new Scanner(System.in);
			int age =s.nextInt();
			
			if(age>=18) {
				System.out.println("The person's age is "+age+" and can vote.");
			}
			else {
				System.out.println("The person's age is "+age+" and cannot vote.");
			}
		}

	}


