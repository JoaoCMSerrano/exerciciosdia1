package pt.com.everis.academia.java.aula4;

public class TryCatchFinally {

	public void a() throws Exception{

	}

	public void b(String string){
		string.isEmpty();
	}

	public void c(){

		try {
			b(null);

			System.out.println(123);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new TryCatchFinally().c();
	}
}
