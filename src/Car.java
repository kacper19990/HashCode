
public class Car {
	public int origin = 0;
	public int destinationRow;
	public int destinationColumn;
	public int carDestinationX;
	public int carDestinationY;
	public Car() {
		carDestinationX = origin;
		carDestinationY = origin;
	}
	
	public void destination(int x, int y) {
		this.destinationRow = y;
		this.destinationColumn = x;
	}

}
