
public class DiffQuad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somma=0;
		int somma2=0;
		for(int i=0;i<=100;i++) {
			somma+=Math.pow(i,2);
			somma2+=i;
		}
		System.out.println(somma2);
		somma2=(int) Math.pow(somma2,2);
		System.out.println("n1: "+somma+" n2: "+somma2);
		System.out.println("differenza: "+(somma2-somma));
	}

}
