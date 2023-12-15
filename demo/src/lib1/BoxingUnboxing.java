package lib1;

public class BoxingUnboxing {

	public static void main(String[] args) {
		 Object obj = 10;  // autoboxing 
		 System.out.println(obj.getClass());
		 
		 
         int n = (Integer) obj;  // Autounboxing 
	}

}
