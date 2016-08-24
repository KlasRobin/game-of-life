package game;

public class Main {

	public static void main(String[] args) {
		Board b = new Board();
		b.initBoard();

		Logic l = new Logic();
//
//		b.wakeCell(4, 4);
//
//		b.wakeCell(4, 5);
//		b.wakeCell(5, 4);
//
//		b.wakeCell(5, 5);
//
		b.wakeCell(6, 6);
		b.wakeCell(6, 7);
		b.wakeCell(7, 6);
		b.wakeCell(7, 7);
		
//		b.wakeCell(4, 5);
//		b.wakeCell(4, 6);
//		b.wakeCell(5, 4);
//		b.wakeCell(5, 5);
//		b.wakeCell(6, 5);
		while (true) {

			b.drawBoard();
			l.setNeighbours(b);
			System.out.println("-------------------------------------------------------");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}

		}

	}

}
