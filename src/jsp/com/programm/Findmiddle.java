package jsp.com.programm;

import java.util.Scanner;

public class Findmiddle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && b>c)
		{
			System.out.println(b);
		}
		else if(a>c && c>b)
		{
			System.out.println(c);
		}
		else if(b>a && a>c)
		{
				System.out.println(a);
		}

	}
}


