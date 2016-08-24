package game;

public class Cell {

	private boolean isAlive;
	private int neighbours;
	private char stateChar;
	
	

	public Cell() {}

	public Cell(boolean isAlive, int neighbours, char stateChar) {
		super();
		this.isAlive = isAlive;
		this.neighbours = neighbours;
		this.stateChar = stateChar;
	}

	public void drawState(){
		System.out.print(stateChar);
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		if(isAlive){
			stateChar = 'X';
		}else{
			stateChar = ' ';
		}
		
		this.isAlive = isAlive;
	}

	public int getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(int neighbours) {
		this.neighbours = neighbours;
	}

	
	public void addNeighbour(){
		neighbours++;
	}

}
