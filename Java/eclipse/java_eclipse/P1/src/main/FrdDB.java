
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FrdDB {
    private ArrayList<Frd> alist;
    private String db = "frdb.csv";     // filename
    private int nxtSl;
    
    public FrdDB() {
        alist = new ArrayList<>();      // Initialize
    } 

    public void readCSV() {
        try (BufferedReader bf = new BufferedReader(new FileReader(db))) {
            String s;
            while ((s = bf.readLine()) != null) {
                Frd f = Frd.fromCSV(s);
                alist.add(f);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveCSV() {

    }
}
