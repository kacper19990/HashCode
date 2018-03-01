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

    public static void Main(String[] args) {
        int rows;
        int columns;
        int vehicles;
        int rides;
        int bonus;
        int steps;

        ArrayList<Trip> trips = new ArrayList<Trip>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/temp"))) {
            String first = br.readLine();
            boolean eof = false;
            while (!eof) {
                String car = br.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}