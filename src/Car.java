
public class Car {
	public int origin = 0;
	public int destinationRow;
	public int destinationColumn;
	public int carDestinationX;
	public int carDestinationY;
	Trip currentTrip;
	public Car() {
		carDestinationX = origin;
		carDestinationY = origin;
	}
	
	public void destination(int x, int y) {
		this.destinationRow = y;
		this.destinationColumn = x;
	}
	
	public void changeTrip(Trip carTrip) {
		this.currentTrip = carTrip;
		
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
		return carDestinationX;
	}

	public void setCarDestinationX(int carDestinationX) {
		this.carDestinationX = carDestinationX;
	}

	public int getCarDestinationY() {
		return carDestinationY;
	}

	public void setCarDestinationY(int carDestinationY) {
		this.carDestinationY = carDestinationY;
	}

}
