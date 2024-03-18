import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng,hindi,math,science,social;
		System.out.println("Enter your marks");
		do {
		    System.out.print("English: ");
		    eng = sc.nextInt();
		    if(eng<0||eng>100) {
		        System.out.println("Invalid input.The marks should be between 0 10 100.");
		    }
		}while(eng<0||eng>100);
		do {
		    System.out.print("Hindi: ");
		    hindi = sc.nextInt();
		    if(hindi<0||hindi>100) {
		        System.out.println("Invalid input.The marks should be between 0 10 100.");
		    }
		}while(hindi<0||hindi>100);
		do {
		    System.out.print("Mathematics: ");
		    math = sc.nextInt();
		    if(math<0||math>100) {
		        System.out.println("Invalid input.The marks should be between 0 10 100.");
		    }
		}while(math<0||math>100);
		do {
		    System.out.print("Science: ");
		    science = sc.nextInt();
		    if(science<0||science>100) {
		        System.out.println("Invalid input.The marks should be between 0 10 100.");
		    }
		}while(science<0||science>100);
		do {
		    System.out.print("Social: ");
		    social = sc.nextInt();
		    if(social<0||social>100) {
		        System.out.println("Invalid input.The marks should be between 0 10 100.");
		    }
		}while(social<0||social>100);
		int total = eng+hindi+math+science+social;
		System.out.println("Total marks:"+total+" out of 500");
		float percent = (float)total/5;
		System.out.println("Percentage:"+String.format("%.2f",percent)+"%");
		if(percent>90&&percent<=100) {
		    System.out.println("Grade:A");
		}else if(percent>80&&percent<=90) {
		    System.out.println("Grade:B");
		}else if(percent>70&&percent<=80) {
		    System.out.println("Grade:C");
		}else if(percent>60&&percent<=70) {
		    System.out.println("Grade:D");
		}else if(percent>50&&percent<=60) {
		    System.out.println("Grade:E");
		}else {
		    System.out.println("FAIL");
		}
	}
}
