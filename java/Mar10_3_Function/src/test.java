
public class test {
	public static void test(int q) { 
		System.out.println(q); 
		q = 20;
		System.out.println(q); 
	}
	
	public static void main(String[] args) {
		int q = 10;			   
		System.out.println(q); 
		test(q);			  
		System.out.println(q); 
	}
}