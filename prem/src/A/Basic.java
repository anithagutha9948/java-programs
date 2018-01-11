package A;


	//Static blocks,Non Static blocks,Static methods,Non static methods,constratctor,Encapsulation.
	public class Basic {
		
		 String name;
		static {
			
			System.out.println("Raghava");
			
		}
		static void m1(){
			System.out.println("Rag");
			
		}
		public void m2(){
			System.out.println("Reddy");
			
		}
		Basic(){
			System.out.println("RAG");
			
		}
		{
			System.out.println("REDDY");
		}
		
	     void m3(){
	    	System.out.println("ASD");
	    	
	    }
	    public void setName(String name) {
			this.name = name;
		}
	  
	    public String getName() {
			return name;
		}
	    
	}
	//Encapsulation
	class Test5{
		public static void main(String[] args) {
			Basic b=new Basic();
			b.m2();
			Basic.m1();
			b.setName("RaghavaM");
			System.out.println("Enter name : "+b.getName());
		}
		
			  
	}
	//Abstraction methos
	abstract class Test6{
			
		
		abstract void m4();
		abstract void m5();
		
		
	}
	//Abstraction methos
	class Test7 extends Test6{
		public static void main(String[] args) {
		 Test7 t2=new Test7();
	     t2.m4();
	     t2.m5();
		}
		
		void m4(){
			System.out.println("LLLLL");
		}
		void m5(){
			System.out.println("KKKKK");
		}
		
	}
	//Inheritance method overriding
	class Test8 extends Basic{
		public static void main(String[] args) {
			Test8 t3=new Test8();
			t3.m3();
		}
		void m3(){
			System.out.println("ASP");
		}
	}

		
	//Method overloading
	class Test9{
		void T(int i){
			System.out.println(i);
		}
		void T(int i,float f){
			System.out.println(f);
	        f=20.0f;
	        System.out.println(f);
		}
	   void T(int i,double d){
			System.out.println(d);
			
		}
	 
	    void T()
	    {
	    	System.out.println("R");
		}
	    public static void main(String args[]){
	    	Test9 t1= new Test9();
	    	t1.T(10);
	    	t1.T(20,5.5f);
	        t1.T(10,10);
	        t1.T();
	        
	    }
	//}
	//Aggrigation(access methods from anthor project class)	(Basic1 class)
	//class Test10{
		//public static void main(String[] args) {
			//Test10 b1=new Test10();
			//b1.m11();
		//}
		
	}
	//Strings 
	class String1 {	  
		public static void main(String[] args) {

		    String s ="Raghava";
		    String s1="Reddy"; 
		    String s2="Raghava"; 
		    String s3="Mulumudi";
		    System.out.println( s.length());
		    System.out.println(s.toUpperCase());
		    System.out.println(s.toLowerCase());
		    System.out.println(s.concat(s1));
		    System.out.println(s.charAt(3));
		    System.out.println(s.replace(s,s3));
		    System.out.println(s.startsWith("Ra"));
		    System.out.println(s1.startsWith("R"));
		    System.out.println(s1.endsWith("a"));
		    System.out.println(s==s2);
		    System.out.println(s!=s3);      
		}

	}


//}
