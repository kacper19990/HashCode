public class Trip {
	private int startRow;
	private int startColumn;
	private int endRow;
	private int endColumn;
	private int earliestStart;
	private int latestFinish;

	public Trip(int startRow, int startColumn, int endRow, int endColumn, int earliestStart, int latestFinish) {
		this.startRow = startRow;
		this.startColumn = startColumn;
		this.endRow = endRow;
		this.endColumn = endColumn;
		this.earliestStart = earliestStart;
		this.latestFinish = latestFinish;
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
		return Math.abs(theCar.getRow() - startRow) + Math.abs(theCar.getColumn() - startColumn);
	}
	
	public int distanceToFinish(Car theCar) {
		return Math.abs(theCar.getRow() - endRow) + Math.abs(theCar.getColumn() - endColumn);
	}
}
