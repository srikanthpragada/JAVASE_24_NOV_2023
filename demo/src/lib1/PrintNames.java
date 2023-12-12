package lib1;

public class PrintNames {

	public static void main(String[] args) {
		String data = "Larry,Jason,Kevin,Scott,Joe,Li";
		
		String names[] = data.split(",");
		
		for(var name : names) {
		   System.out.printf("%-20s  %2d\n", name, name.length());	
		}

	}

}
