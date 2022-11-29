
public class lenthDemo {

	public static void main(String[] args) {

		// Example 1

		String str1 = "Java";
		String str2 = "";

		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("Java".length());
		System.out.println("Java\n".length());
		System.out.println("Learn Java".length());

		// Example 2
// public class IsEmptyExample 
		String s1 = "";
		String s2 = "hello";

		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());

		// Example 3
// public class StringTrimExample
		String s11 = "      hello     ";
		System.out.println(s11 + "how are you");
		System.out.println(s11.trim() + "how are you");
//public class StringLowerExample
		// Example 4

		String s1 = "HELLO HOW Are You?";
		String s1lower = s1.toLowerCase();
		System.out.println(s1lower);
		
		// Example 5
//public class StringUpperExample
		String s1 = "Hello how are you";
		String s1upper=s1.toUpperCase();
		System.out.println(s1upper);
		
		// Example 6 
//public class concatDemo
		String str1 = "Learn";
		String str2 = "Java";
		
		System.out.println(str1.concat(str2));
		
		System.out.println(str2.concat(str1));
		
		String str3 = "hello";
		String str4 = "Learners";
		
		String message = "Welcome" + "to " + "Java";
		
		String s = "Chapter" +2;
		String s1 = "Supplement" + 'B';
		
//Example 7 
		
		import java.util.Arrays;
		
// public class main
		
		String vowels = "a::b::c::d::e";
		
		String[] result = vowels.split("::");
		
		System.out.println("result =" + Arrays.toString(result));
		
// Example 8 
		
		String message = "Welcome to Java";
		System.out.println("The first character in the message is" + message.charAt(0));
		
// Example 9
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hello";
		String s4 = "flag";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
		
		
// Example 10
// public class substringDemo
		String str1 = "Java is fun";
		
		System.out.println(str1.substring(0,4));
		
//Example 11
		String str1 = " Java is fun";
		int result;
		
		result = str1.indexOf('s');
		System.out.println(result);
		
		result = str1.lastIndexOf('J');
		System.out.println(result);
		
		result = str1.lastIndexOf('a');
		System.out.println(result);
		
		result = str1.lastIndexOf("ava");
		System.out.println(result);
		
		result = str1.lastIndexOf("java");
		System.out.println(result);
		
//Example 12
		String str1 = "Learn Java";
		boolean result;
		
		result = str1.contains("Java";
		System.out.println(result);
		
		result = str1.contains("Python");
		System.out.println(result);
		
		result = str1.contains("");
		
// Example 13
		
		String str1 = "abc cba";
		System.out.println(str1.replace('a,', 'z'));
		System.out.println("Lava".replce('L', 'J'));
		System.out.println("Hello".replace('4', 'J'));
		System.out.println(str1.replace("C++", "Java"));
		
		System.out.println("aa bb aa zz".replace("aa", "zz"));
		System.out.println("Java".replace("C++", "C"));
		
// Exapmple 14 1)
		String s1="PerScholas";
		String s2+"PerScholas";
		String s3=new String("PerScholas");
		String s4="Teksystem";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.eauals(s4));
		
// Example 14 2)
		String s1="PerScholas");
		String s2="PerScholas");
		String s3 = new String("PerScholas");
		System.out.println(s1==s3);
		
// Example 14 3)
		String s1="PerScholas";
		String s2="PerScholas";
		String s3="PerScholas";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		
		
		
		
		

	}

}
