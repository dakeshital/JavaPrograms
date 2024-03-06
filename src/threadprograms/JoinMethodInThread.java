package threadprograms;

class AptitudeTest extends Thread {
	public void run() {
		System.out.println("first clear aptitudetest ");
	}
}

class TechnicalRound extends Thread {
	public void run() {
		System.out.println("If pass Aptitude test join technical round ");
	}
}

class HrRound extends Thread {
	public void run() {
		System.out.println("If pass technical round join Hr round ");
	}
}

class OfferLetter extends Thread {
	public void run() {
		System.out.println("Congratulations.... ");
	}
}

public class JoinMethodInThread {
	public static void main(String[] args) throws InterruptedException {
		AptitudeTest apt = new AptitudeTest();
		apt.start();
		apt.join();

		TechnicalRound tech = new TechnicalRound();
		tech.start();

		HrRound hr = new HrRound();
		hr.start();
		
		OfferLetter offer = new OfferLetter();
		offer.start();

	}

}
