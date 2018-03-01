import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Self_Driving {
    private static String SEPARATOR = " ";
    private static int START_ROW = 0;
    private static int START_COLUMN = 1;
    private static int END_ROW = 2;
    private static int END_COLUMN = 3;
    private static int EARLIEST_START = 4;
    private static int LATEST_FINISH = 5;
    
    private ArrayList<Trip> tripList;
    private int rows;
    private int columns;
    private int vehicles;
    private int rides;
    private int bonus;
    private int steps;
    private ArrayList<Car> carList;

    public static void Main(String[] args) {
    	Self_Driving selfDriving = new Self_Driving();
    	selfDriving.readFile("src/temp");
    	
    	
    }
    
    public Self_Driving() {
    	tripList = new ArrayList<Trip>();
    	carList = new ArrayList<Car>();
    }

    public void set(int rows, int columns, int vehicles, int rides, int bonus, int steps) {
    	this.rows = rows;
    	this.columns = columns;
    	this.vehicles = vehicles;
    	this.rides = rides;
    	this.bonus = bonus;
    	this.steps = steps;
    	for(int index = 0; index < vehicles; index++)
    		carList.add(new Car());
    }
    
    public void readFile(String source){
        Trip trip = new Trip();
       // ArrayList<Trip> trips = new ArrayList<Trip>();
        int rows;
        int columns;
        int vehicles;
        int rides;
        int bonus;
        int steps;


        try (BufferedReader br = new BufferedReader(new FileReader("src/temp"))) {
            String first = br.readLine();
            String[] initialise = first.split(SEPARATOR);
            rows = Integer.parseInt(initialise[0]);
            columns = Integer.parseInt(initialise[1]);
            vehicles = Integer.parseInt(initialise[2]);
            rides = Integer.parseInt(initialise[3]);
            bonus = Integer.parseInt(initialise[4]);
            steps = Integer.parseInt(initialise[5]);
            set(rows, columns, vehicles, rides, bonus, steps);

            boolean eof = false;
            while (!eof) {
                String car = br.readLine();
                for(int i = 0; i < rides; i++){
                    String[] tripe = car.split(SEPARATOR);
                    int startR = Integer.parseInt(tripe[START_ROW]);
                    int startC = Integer.parseInt(tripe[START_COLUMN]);
                    int endR = Integer.parseInt(tripe[END_ROW]);
                    int endC = Integer.parseInt(tripe[END_COLUMN]);
                    int earlyS = Integer.parseInt(tripe[EARLIEST_START]);
                    int latestF = Integer.parseInt(tripe[LATEST_FINISH]);
                    tripList.add(new Trip(startR, startC, endR, endC, earlyS, latestF));

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       // return trips;
        
    }
    
    public void run() {
    	boolean finished = false;
    	while(!finished) {
    		for(Trip trip : tripList) {
    			
    		}
    	}
    
    }
}