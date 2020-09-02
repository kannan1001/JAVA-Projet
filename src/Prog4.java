/* 
1.Name of program: Writing own StringBuilder Class
2.Programmer's name:Geerthana Kannan
3.Current Date:2/28/2017
4.Computer system and compiler you are using:Lenovo Windows 10 ,Eclipse compiler for Java
5.Brief description of the program : Write our own StringBuilder class (called MyStringBuilder) that has many of the
same methods  as the StringBuilder class, but adds a few that are not included. 
*/
import java.util.Scanner;

public class Prog4 {
	public static MyStringBuilder[] collecting() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many array elements: ");
		int size = input.nextInt();
		input.nextLine();
		if (size <= 0) {
			size = 1;
		}
		MyStringBuilder[] sbobj = new MyStringBuilder[size];
		String s;
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a string:");
			s = input.nextLine();
			sbobj[i] = new MyStringBuilder(s);
			sbobj[i].trim();
		}
		return sbobj;

	}

	public static void sorting(MyStringBuilder[] sbobj) 
	{
		for (int j = 0; j < sbobj.length; j++) 
		{
			for (int i = j + 1; i < sbobj.length; i++) 
			{   //System.out.println(sbobj[j].compareToIgnoreCase(sbobj[i]));
				if (sbobj[j].compareToIgnoreCase(sbobj[i]) > 0) 
				{
					MyStringBuilder temp = sbobj[j];
					sbobj[j] = sbobj[i];
					sbobj[i] = temp;
				}
			}
		}
	}

	public static void display(MyStringBuilder[] sbobj) 
	{
		MyStringBuilder sb1 = new MyStringBuilder();
		MyStringBuilder sb2 = new MyStringBuilder();
		System.out.println("Sorted array elements:");
		for (int i = 0; i < sbobj.length; i++) 
		{
			sb1.setLength(0);
			sb2.setLength(0);
			sb1.append(sbobj[i]);
			sb1.removeWhiteSpaces();
			sb2.append(sb1);
			sb2.reverse();
			String strPalOrNot = "";
			if(sb1.equalsIgnoreCase(sb2)==true)
			{
				strPalOrNot= " is a palindrome";
			}
			else
			{
				strPalOrNot= "";
			}
			System.out.println(sbobj[i] + strPalOrNot);
		}
	}

	public static void main(String[] args) 
	{
		MyStringBuilder[] Array;
		Array = collecting();
		sorting(Array);
		display(Array);
	}

}
//Output:
//	Enter how many array elements: 
//		5
//		Enter a string:
//		Mom
//		Enter a string:
//		 madam Im Adam
//		Enter a string:
//		 another STRING
//		Enter a string:
//		 Madam I M aDAm
//		Enter a string:
//		 ANOTHER string
//		Sorted array elements:
//		another STRING
//		ANOTHER string
//		Madam I M aDAm is a palindrome
//		madam Im Adam is a palindrome
//		Mom is a palindrome

//Enter how many array elements: 
//0
//Enter a string:
//A
//Sorted array elements:
//A is a palindrome
//Enter how many array elements: 
//8
//Enter a string:
// Was it a CAT I saw
//Enter a string:
// a Toyotas a Toyota
//Enter a string:
// Kayak
//Enter a string:
// NOT one
//Enter a string:
// K A Y ak
//Enter a string:
// A toyotas A TOYOTA
//Enter a string:
// WAS it a cat I saw
//Enter a string:
// no t ONE
//Sorted array elements:
//a Toyotas a Toyota is a palindrome
//A toyotas A TOYOTA is a palindrome
//K A Y ak is a palindrome
//Kayak is a palindrome
//no t ONE
//NOT one
//WAS it a cat I saw is a palindrome
//Was it a CAT I saw is a palindrome


	
