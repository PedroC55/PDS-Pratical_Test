import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ToShare {
    private ArrayList<Product> produtcts = new ArrayList<>(); 
    private ArrayList<Product> productsshared = new ArrayList<>(); 
    private ArrayList<Client> clients = new ArrayList<>();
    private int x,y;
    private Reader r;
    public ArrayList<Product> getProducts(){
        return produtcts;
    }

    public ArrayList<Product> getSharedProducts(){
        return productsshared;
    }
    public boolean add(Product p){
        x++;
        return produtcts.add(p);
    }
    public int totalProducts(){
        return x;
    }
    public int totalProductsShared(){
        return x;
    }
    public Product remove(String code){
        for(Product pr : produtcts){
            String x = pr.code();
            if(code.equals(x)){
                return pr;
            }
        }
        return null;
    }
    public  ArrayList<Product> readfile(File f) {
        ArrayList<Product> prod = r.readfile(f);
        for (Product p : prod){
            produtcts.add(p);
        }
        return produtcts;
    }

    public Product add(String code){
        for(Product pr : productsshared){
            String x = pr.code();
            if(code.equals(x)){
                return pr;
            }
        }
        return null;
    }

    public boolean share(String code, Client user){
        productsshared.add(remove(code));
        clients.add(user);
        y++;
        return produtcts.remove(remove(code));

    }
    public boolean share(Product p, Client user){
        productsshared.add(p);
        clients.add(user);
        y++;
        return produtcts.remove(p);

    }

    public boolean giveBack(String code){
        return produtcts.add(add(code));
    }

    public boolean giveBack(Product p){
        return produtcts.add(p);
    }

    public String sharedProducts(){
        String pro = "";
        pro+="Total: " + totalProductsShared() + "\n";
        for (Product item : productsshared)
			pro +="\t"+item+"\n";

        return pro;
    }
}
