package lib1;

class Rect {
	private int length, width;

	public Rect(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override 
	public String toString() {
		return   this.length + "," + this.width;
	}
	
	@Override 
	public boolean equals(Object obj) {
		// compare this with obj 
		return true;
	}
	
}
public class TestRect {

	public static void main(String[] args) {
		var r1 = new Rect(10, 20);
		var r2 = new Rect(10, 20);
		
		System.out.println(r1.toString());
		System.out.println(r1.equals(r2));
		
		
	}
}
