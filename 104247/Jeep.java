public class Jeep implements Product{
    private String code, description;
    private double points;

    public Jeep(OldJeep jeep){
        String[] s = jeep.getData().split(";");
        this.code = s[0];
        this.description = s[1];
        this.points = Double.parseDouble(s[2]);
    }
    public Jeep(String code, String description, double points){
        this.code = code;
        this.description = description;
        this.points = points;
    }

    
    @Override
    public String code() {
        return code;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public double points() {
        return points;
    }

    @Override
    public String toString(){
        return "Jeep [ code=" + code() + ", descr=" +  description() + ", points=" + points + "]";
    }
    
}