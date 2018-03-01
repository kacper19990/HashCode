
public class Car {
	public int origin = 0;
	public int destinationRow;
	public int destinationColumn;
	public int currentColumn;
	public int currenRow;
	Trip currentTrip;
	public Car() {
		currenRow = origin;
		currentColumn = origin;
	}
	
	public void destination(int x, int y) {
		this.destinationRow = y;
		this.destinationColumn = x;
	}
	
	public void changeTrip(Trip carTrip) {
		this.currentTrip = carTrip;
		destination(this.currentTrip.getEndColumn(),this.currentTrip.getEndRow());
	}
	

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public int getDestinationRow() {
		return destinationRow;
	}

	public void setDestinationRow(int destinationRow) {
		this.destinationRow = destinationRow;
	}

	public int getDestinationColumn() {
		return destinationColumn;
	}

	public void setDestinationColumn(int destinationColumn) {
		this.destinationColumn = destinationColumn;
	}

	public int getCarDestinationX() {
		return currenRow;
	}

	public void setCarDestinationX(int carDestinationX) {
		this.currenRow = carDestinationX;
	}

	public int getCarDestinationY() {
		return currentColumn;
	}

	public void setCarDestinationY(int carDestinationY) {
		this.currentColumn = carDestinationY;
	}

}
