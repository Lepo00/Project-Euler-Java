
public class Main {
	public static boolean pal(String s) {
		int a=s.length()/2;
		for(int i=0;i<a;i++)
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int n=0,n1=0;
		boolean b=false;
			for(int i=999;i>0;i--) {
				for(int j=999;j>0;j--) {
					k=i*j;
					if(pal(Integer.toString(k))==true && k>n*n1) {
						b=true;
						n=i;
						n1=j;
					}
				}
				/*if(b==true)
					break;*/
		}
		if(b==true)
			System.out.println("i numeri sono"+n+"e "+n1);
			
	}

}
