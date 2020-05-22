import java.util.regex.*;
import java.util.*;

public class RegexDemo1 {
  public static void main(String args[])	{

		String target ="22.231.113.164";
		String pattern = "^((([1][0-9][0-9])|([0-9]{1,2})|([2][0-5][0-5])).){3}(([1][0-9][0-9])|([0-9]{1,2})|([2][0-5][0-5]))";
//		String Pattern = "^[0-9][0-9]$"

		System.out.println(target);
		System.out.println(pattern);

		String replace = "$1";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(target);
		
		

		boolean flag = false;		

		String s1 = "";
		while(m.find()){
//			System.out.println("BackReference="+backReference);
			flag = true;
			System.out.println(m.start()+" "+m.end()+" "+m.group());
	
		}

//		s1 = m.replaceAll(replace);
		System.out.println("Replace String="+s1);
		if(flag == false){
			System.out.println("No Matches");
		}else{
			System.out.println(s1);
			}
	}

}
