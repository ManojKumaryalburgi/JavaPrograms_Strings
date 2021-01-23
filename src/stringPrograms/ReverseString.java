package stringPrograms;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s="manoj";
		String rev="";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			rev=ch[i]+rev;
		}
		
        System.out.print(rev);
	}

}
