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
		return this.length + "," + this.width;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rect) {
			Rect other = (Rect) obj;
			return this.length == other.length && this.width == other.width;
		}
		else
		   return false;
	}
	
	@Override 
	public int hashCode() {
		return this.length;
	}

}

public class TestRect {

	public static void main(String[] args) {
		var r1 = new Rect(10, 20);
		var r2 = new Rect(10, 20);
		var r3 = new Rect(10, 30);

		System.out.println(r1.toString());
		System.out.println(r1.equals(r2));

	}
}
