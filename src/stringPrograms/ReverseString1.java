package stringPrograms;

public class ReverseString1 {

	public static void main(String[] args)
	{
		String s="Gireesh";
		String rev=" ";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		
		System.out.print(rev);

	}

}
