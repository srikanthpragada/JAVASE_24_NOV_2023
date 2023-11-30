package gs;

public class VaryingArgs {

	public static int add(int... values) {
		int total = 0;
		for (int v : values)
			total += v;

		return total;
	}

    public static void wish(String message, String ... names) {
    	for(String n : names)
    		System.out.println(message + " " + n);
    }
    
	public static void main(String[] args) {

		System.out.println(add(10, 10));
		System.out.println(add(10, 10, 30));
		System.out.println(add(10, 10, 40, 50));

		wish("Hello", "Dave", "Kim");
		wish("Hi");
		
	}

}
