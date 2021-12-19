import java.math.BigInteger;

public class Somma2alla1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger n=new BigInteger("2");
		int j=0;
		String s;
		n=n.pow(1000);
		System.out.println(n);
		s=n.toString();
		for(int i=0;i<s.length();i++) {
			j+=Character.getNumericValue(s.charAt(i));
			System.out.print(j+"- ");
		}
		System.out.println("\n"+j);
	}

}
