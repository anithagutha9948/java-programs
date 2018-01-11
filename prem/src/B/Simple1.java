package B;
import java.util.StringTokenizer;

public class Simple1 {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("prem  is created"," " );
		while(st.hasMoreTokens()){
		System.out.println(st.nextToken());
	}
	}
}
