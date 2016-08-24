package game;

public class Board {

	private Cell[][] cells;

	public Board() {

		cells = new Cell[10][10];
	}

	public void drawBoard() {

		for (int i = 0; i < cells[0].length; i++) {

			for (int j = 0; j < cells.length; j++) {
				cells[i][j].drawState();
			}
			System.out.println();
		}
	}

	public void initBoard() {
		for (int i = 0; i < cells[0].length; i++) {

			for (int j = 0; j < cells.length; j++) {
				cells[i][j] = new Cell(false, 0, ' ');
			}
		}
	}

	public Cell[][] getCells() {
		return cells;
	}

	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}
	
	public void wakeCell(int y, int x){
		
		cells[y][x].setAlive(true);
		
	}


}
