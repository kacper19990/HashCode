
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
		if (tripFinished()) {
			return false;
		}
		return true;
	}

	public boolean tripFinished() {
		if (this.currentRow == this.destinationRow && this.currentColumn == this.destinationRow) {
			this.currentTrip = null;
			return true;
		}
		return false;
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
		destination(this.currentTrip.getEndColumn(), this.currentTrip.getEndRow());
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

	public void move() {
		if (currentTrip != null) {
			if (!currentTrip.isHasStarted()) {
				if (!currentTrip.hasCar()) {
					currentTrip.setDistToStart(currentTrip.distanceToStart(this));
					currentTrip.setHasCar(true);
				}
				currentTrip.setDistToStart(currentTrip.getDistToStart() - 1);
				if(currentTrip.getDistToStart() <= 0)
					currentTrip.setHasStarted(true);
			} else {
				currentTrip.setTimeToFinish(currentTrip.getTimeToFinish() - 1);
				if(currentTrip.getTimeToFinish() <= 0) {
					currentColumn = currentTrip.getEndColumn();
					currentRow = currentTrip.getEndRow();
					currentTrip.setFinished(true);
					currentTrip = null;
				}
			}
		}
	}

}
