package oop2;

enum PaymentModes {
	CASH, CARD, UPI
}

public class EnumDemo {

	public static void main(String[] args) {
		PaymentModes payMode;
		int pmode  = 1;
		
		 payMode = PaymentModes.CARD;
		 System.out.println(payMode);
		 
		 if(payMode == PaymentModes.UPI)
			 System.out.println("UPI Mode is used!");
			 
		 

	}

}
