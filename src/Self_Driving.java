import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Self_Driving {
    ArrayList<Trip> trips = new ArrayList<Trip>();
    try(BufferedReader br = new BufferedReader(new FileReader("src/temp"))){
        boolean eof = false;
        while(!eof){

        }
    }catch(IOException e){
        e.printStackTrace();
    }
}
