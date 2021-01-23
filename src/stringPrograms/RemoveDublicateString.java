package stringPrograms;

import java.util.LinkedHashSet;

public class RemoveDublicateString {

	public static void main(String[] args) 
	{
		String s="welcome to github india welcome to git";
		String[] sp = s.split(" ");
		
		
		LinkedHashSet<String> li = new LinkedHashSet<String>();
		for(int i=0;i<sp.length;i++)
		{
			li.add(sp[i]);
		}

		for(String l:li)
		{
			System.out.print(l +" ");
		}
	}

}
