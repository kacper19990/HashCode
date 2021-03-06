public class Trip {
	private boolean isValid;
	private boolean hasStarted;
	private boolean isFinished;
	private boolean hasCar;
	private int distToStart;
	private int startRow;
	private int startColumn;
	private int endRow;
	private int endColumn;
	private int earliestStart;
	private int latestFinish;
	private int timeToFinish;

	public Trip(int startRow, int startColumn, int endRow, int endColumn, int earliestStart, int latestFinish) {
		isValid = true;
		hasStarted = false;
		this.startRow = startRow;
		this.startColumn = startColumn;
		this.endRow = endRow;
		this.endColumn = endColumn;
		this.earliestStart = earliestStart;
		this.latestFinish = latestFinish;
		timeToFinish = timeToFinish();
		hasCar = false;
	}
	
	public Trip() {
	}
	
	public boolean hasCar() {
		return hasCar;
	}

	public void setHasCar(boolean hasCar) {
		this.hasCar = hasCar;
	}

	public int getDistToStart() {
		return distToStart;
	}

	public void setDistToStart(int distToStart) {
		this.distToStart = distToStart;
	}

	public void setTimeToFinish(int timeToFinish) {
		this.timeToFinish = timeToFinish;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getStartColumn() {
		return startColumn;
	}

	public void setStartColumn(int startColumn) {
		this.startColumn = startColumn;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getEndColumn() {
		return endColumn;
	}

	public void setEndColumn(int endColumn) {
		this.endColumn = endColumn;
	}

	public int getEarliestStart() {
		return earliestStart;
	}

	public void setEarliestStart(int earliestStart) {
		this.earliestStart = earliestStart;
	}

	public int getLatestFinish() {
		return latestFinish;
	}

	public void setLatestFinish(int latestFinish) {
		this.latestFinish = latestFinish;
	}
	
	public int distanceToStart(Car theCar) {
		return Math.abs(theCar.getCurrentRow() - startRow) + Math.abs(theCar.getCurrentColumn() - startColumn);
	}
	
	public int timeToFinish() {
		return Math.abs(startRow - endRow) + Math.abs(startColumn - endColumn);
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean isHasStarted() {
		return hasStarted;
	}

	public void setHasStarted(boolean hasStarted) {
		this.hasStarted = hasStarted;
	}

	public int getTimeToFinish() {
		return timeToFinish;
	}
	
	public boolean canFinishOnTime(Car theCar, int currentTime) { //Returns if the current car can finish the trip on time.
		if(distanceToStart(theCar) + timeToFinish + currentTime <= latestFinish)
			return true;
		return false;
	}
	
	public boolean canStartOnTime(Car theCar, int currentTime) {//Returns if the current car can start the trip on time.
		if(distanceToStart(theCar) + currentTime >= earliestStart)
			return true;
		return false;
	}
	
	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	
}
