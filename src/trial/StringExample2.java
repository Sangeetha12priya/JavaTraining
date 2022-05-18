package trial;

public class StringExample2 {
	 public String remove(String str1, String str2)
	 {
	      String strnew="";	int count=0;	int p=0;
	      int l1=str1.length();
	     // int l2=str2.length();
	      for(int j=0;j<l1;)
	      {
	         char ch1=str1.charAt(p);
	         char ch2=str2.charAt(j);
	         if(ch1!=ch2){   
	              count++;
	              j++;
	            if(count==l1){
	              strnew=strnew+ch1;
	              p++;
	              j=0;
	              count=0;
	             }         } 
	         else
	         {
	             p++;
	             count=0;
	             j=0;
	         }
	      }
	     return strnew;	 }       
	 
	 public static void main(String args[])
	 {
		 StringExample2 obj = new StringExample2();
		 obj.remove("In","is");
	 }

}
