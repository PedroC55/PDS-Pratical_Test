public class Client {
    private String code, name;
    public Client(String code, String name){
        this.code = code;
        this.name = name;
    }
    public String getNome(){
        return name;
    }
    public String getcode(){
        return code;
    }


    @Override
    public String toString(){
        return name;
    }
}
