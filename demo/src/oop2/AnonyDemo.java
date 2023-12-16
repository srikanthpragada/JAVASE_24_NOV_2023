package oop2;

interface Task {
	void process();
}

class MyTask implements Task  {
	@Override
	public void process() {
	}
}


public class AnonyDemo {
	public static void main(String[] args) {
		 Task t = new Task()  {
			@Override
			public void process() {
				System.out.println("Process in Anonymous inner class");
			}
		 };
		 
		 System.out.println(t.getClass());
		 t.process();
		 
		 
		 Task t2 = () -> System.out.println("Lambda!");
		 t2.process();
		 
	}

}
