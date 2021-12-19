
public class Mcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=false;
		int n=0;
		for(int i=2;;i++){
			for(int j=2;j<=20;j++) {
				if(i%j!=0)
					break;
				if(j==20)
					b=true;
				}
			if(b==true) {
				n=i;
				break;
			}
		}
		System.out.println("Mcm= "+n);
	}

}
