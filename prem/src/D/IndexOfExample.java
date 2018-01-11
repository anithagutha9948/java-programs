package D;

public class IndexOfExample {
	public static void main(String[] args) {
		String s1="my name is prem";
		int index1=s1.indexOf("prem");
		int index2=s1.indexOf("kumar");
		System.out.println(index1+" "+index2);
		int index3=s1.indexOf("revanth",5);
		System.out.println(index3);
		int index4=s1.indexOf("uyfti");
		System.out.println(index4);
		
	}

}
