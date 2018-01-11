package D;

public class StringGetByte {
public static void main(String[] args) {
	String s1="PREm";
	byte[] brr= s1.getBytes();
	for (int i=0;i<brr.length;i++){
		System.out.println(brr[i]);
	}
}
}
