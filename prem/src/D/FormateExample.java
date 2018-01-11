package D;

public class FormateExample {
	public static void main(String[] args) {
		String name="prem";
		String sf= String.format("name is %s", name);
		System.out.println(sf);
		String sf1=String.format("name is %f",12.34);
		System.out.println(sf1);
		String sf2=String.format("value is %f55.898",22.333);
		System.out.println(sf2);
	}

}
