
public class ExplicitTest {

	public static void main(String[] args) {
		
		double d = 100.04;
		long l =(long)d;
		int i = (int)1;
		System.out.println("Double value " +d);
		System.out.println("Long value " +1);
		System.out.println("Int value " +i);
		
		byte b;
		int z = 257;
		double dou = 323.142;
		System.out.println("Conversion of int to byte.");
		
		b = (byte) z;
		System.out.println("i = " + z + " b = " + b);
		System.out.println("Conversion of doouble to int.");
		
		z = (int) dou;
		System.out.println("d = " + "b = " + b);
		
		b = (byte) dou;
		System.out.println("d = " + dou + "b = " + b);
		

	}

}
