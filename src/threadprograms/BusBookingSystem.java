package threadprograms;

class Bus {
	int availableSeats = 40;

	public synchronized void bookSeats(int seats) {

		if (availableSeats >= seats) {
			System.out.println(Thread.currentThread().getName() + " is booking " + seats + " seats.");

			availableSeats = availableSeats - seats;

			System.out.println("Seats booked successfully. Available seats now: " + availableSeats);
		} else {
			System.out.println(Thread.currentThread().getName() + " Not enough available seats");
		}
	}
}

class Passenger extends Thread {
	Bus bus;
	int seats;

	Passenger(Bus bus, int seats) {
		this.bus = bus;
		this.seats = seats;
	}

	public void run() {
		bus.bookSeats(seats);
	}

}

public class BusBookingSystem {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Passenger p1 = new Passenger(bus, 15);
		p1.start();

		Passenger p2 = new Passenger(bus, 10);
		p2.start();

		Passenger p3 = new Passenger(bus, 5);
		p3.start();

		Passenger p4 = new Passenger(bus, 15);
		p4.start();
	}

}
