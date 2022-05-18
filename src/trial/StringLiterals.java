package trial;

public class StringLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Priya";
		System.out.println("String literal is "+str);
		
		String str1 = new String("Sangeetha");
		System.out.println("String using new keyword is "+str1);
		
		char arr[] = {'p','r','i','y','a'};
		String str2 = new String (arr);
		System.out.println("Character array converted into String is " + str2);
		

	}

}
