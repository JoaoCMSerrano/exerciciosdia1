package pt.com.everis.academia.java;

public class Wrappers2 {

	public static void main(String[] args) {
		
		Double double1 = new Double (3524245534.66345);
		
		System.out.println("Teste Double");
		System.out.println("byte: " + double1.byteValue());
		System.out.println("double: " + double1.doubleValue());
		System.out.println("float: " + double1.floatValue());
		System.out.println("int: " + double1.intValue());
		System.out.println("long: " + double1.longValue());
		System.out.println("short: " + double1.shortValue() + "\n");
		
		Byte byte1 = new Byte ((byte) 1);

		System.out.println("Teste Byte");
		System.out.println("byte: " + byte1.byteValue());
		System.out.println("double: " + byte1.doubleValue());
		System.out.println("float: " + byte1.floatValue());
		System.out.println("int: " + byte1.intValue());
		System.out.println("long: " + byte1.longValue());
		System.out.println("short: " + byte1.shortValue() + "\n");
		
		Float float1 = new Float (3454.4365f);
		
		System.out.println("Teste Float");
		System.out.println("byte: " + float1.byteValue());
		System.out.println("double: " + float1.doubleValue());
		System.out.println("float: " + float1.floatValue());
		System.out.println("int: " + float1.intValue());
		System.out.println("long: " + float1.longValue());
		System.out.println("short: " + float1.shortValue() + "\n");
		
		Integer int1 = new Integer (3557968);
		
		System.out.println("Teste Integer");
		System.out.println("byte: " + int1.byteValue());
		System.out.println("double: " + int1.doubleValue());
		System.out.println("float: " + int1.floatValue());
		System.out.println("int: " + int1.intValue());
		System.out.println("long: " + int1.longValue());
		System.out.println("short: " + int1.shortValue() + "\n");

		Long long1 = new Long (6387162836188935355l);
		
		System.out.println("Teste Long");
		System.out.println("byte: " + long1.byteValue());
		System.out.println("double: " + long1.doubleValue());
		System.out.println("float: " + long1.floatValue());
		System.out.println("int: " + long1.intValue());
		System.out.println("long: " + long1.longValue());
		System.out.println("short: " + long1.shortValue() + "\n");
		
		Short short1 = new Short ((short)27212);
		
		System.out.println("Teste Short");
		System.out.println("byte: " + short1.byteValue());
		System.out.println("double: " + short1.doubleValue());
		System.out.println("float: " + short1.floatValue());
		System.out.println("int: " + short1.intValue());
		System.out.println("long: " + short1.longValue());
		System.out.println("short: " + short1.shortValue() + "\n");
	}

}
