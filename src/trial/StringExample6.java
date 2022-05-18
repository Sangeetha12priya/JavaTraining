package trial;
import java.util.Scanner;
public class StringExample6 {
 public static void main(String [] args)
	    {
	        String s1 = "", s2 = "";

	        Scanner scan = new Scanner(System.in);

	        System.out.print("\n Enter the String 1 : ");
	        s1 =scan.nextLine();
	        System.out.print("\n Enter the String 2 : ");
	        s2 =scan.nextLine();
	        scan.close();

	        String a = s1;
	        String b = s2;
	        char temp;
	        String search = "";
	        String replace = "";

	        for(int i= 0; i < s1.length(); i++)
	        {
	            temp = s1.charAt(i);
	            search = Character.toString(temp);

	            for(int j = 0; j < s2.length(); j++)
	            {
	                if(temp == s2.charAt(j))
	                {
	                    a = a.replace(search, replace);
	                    b = b.replace(search, replace);
	                }
	            }       
	        }

	        System.out.println("\n Common Characters Removed String 1 : " + a);
	        System.out.println("\n Common Characters Removed String 2 : " + b);

	    }
	
}
