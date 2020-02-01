import java.util.Scanner;

public class While {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		int num = scan.nextInt();
		
		
		
		while (num != -1 )
		System.out.println("Give me more number");
		num = scan.nextInt();	
			
		System.out.println("The top number is: " + num);
		return;

	}

	
	
	
			
}



