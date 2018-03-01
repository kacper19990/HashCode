
public class Car {
	public int origin = 0;
	public int destinationRow;
	public int destinationColumn;
	public int currentColumn;
	public int currentRow;
	Trip currentTrip = null;
	public Car() {
		currentRow = origin;
		currentColumn = origin;
	}
	
	public boolean hasTrip() {
		if(this.currentTrip == null) {
			return false;
		}
		return true;
	}
	
	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public Trip getCurrentTrip() {
		return currentTrip;
	}

	public int getCurrentColumn() {
		return currentColumn;
	}
	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}
	public void setCurrentTrip(Trip currentTrip) {
		this.currentTrip = currentTrip;
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

}
