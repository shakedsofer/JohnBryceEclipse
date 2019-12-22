import java.util.Scanner;

public class HomeWorkLec_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me double digit"); // דו סיפרתי
		
		int num = scan.nextInt();
		int num02;
		int num03;
		num02 = num / 10 ;

		num03 = num02  % num02;  
	
		if (num03 == num) 
			
			System.out.println("Equal");
		}else if

	{
		System.out.println("Not equal");

	}else {
		System.out.println("Invalid");	
		
		}
	}

