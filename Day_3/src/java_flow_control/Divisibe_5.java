package java_flow_control;
import java.util.Scanner;
public class Divisibe_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number%5==0){
		System.out.println("Your Number is divisible by 5");
	}
	sc.close();
	}

}

