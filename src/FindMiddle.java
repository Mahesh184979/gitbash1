import java.util.Scanner;

public class FindMiddle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("hi");
	    
		if(a>b&&b>c)
		{
			System.out.println(b);
		}
		if(a>c&&c>b)
		{
			System.out.println(c);
		}
		if(b>a&&a>c)
		{
			System.out.println(a);
		}
		System.out.println("hi");
    
	}

}
