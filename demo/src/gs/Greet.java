package gs;

public class Greet {

	public static void main(String[] args) {

		if (args.length == 0)
			System.out.println("Missing name");
		else
			System.out.println("Hello " + args[0]);

	}

}
