import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private ArrayList<Product> prod = new ArrayList<>();
    public ArrayList<Product> readfile(File f) {
        try {
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine()){
                String[] s = scan.nextLine().split("\t");
                if(s[0] == "Car"){
                    Product p = new Car(s[1], s[2], Double.parseDouble(s[3]));
                    prod.add(p);
                }
                else if(s[0] == "Motorcycle"){
                    Product p = new Motorcycle(s[1], s[2], Double.parseDouble(s[3]));
                    prod.add(p);
                }
                else if(s[0] == "Van"){
                    Product p = new Van(s[1], s[2], Double.parseDouble(s[3]));
                    prod.add(p);
                }
                else if(s[0] == "Jeep"){
                    Product p = new Jeep(s[1], s[2], Double.parseDouble(s[3]));
                    prod.add(p);
                }
                
            }
            scan.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

        return prod;

    }
}
