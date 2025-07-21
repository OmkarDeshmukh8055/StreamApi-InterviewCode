package abc;

public class TestFunctionalInterFace {

	public static void main(String[] args) {
		
		String str="Hello World!!";
		FunctionalInteface f=()->System.out.println(str);
		f.print();
	}
}
