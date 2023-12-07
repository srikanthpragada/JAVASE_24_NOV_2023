package oop1;

class Counter {
	private int value, initValue;

	public Counter() {
		this.value = 0;
		this.initValue = 0;
	}

	public Counter(int value) {
		this.value = value;
		this.initValue = value;
	}

	public void increment() {
		this.value++;
	}

	public void decrement() {
		this.value--;
	}

	public int getCounter() {
		return this.value;
	}

	public void reset() {
		this.value = this.initValue;
	}
}

public class TestCounter {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.increment();
		System.out.println(c1.getCounter());

		Counter c2 = new Counter(10);
		c2.increment();
		System.out.println(c2.getCounter());
		c2.reset();
		System.out.println(c2.getCounter());

	}

}
