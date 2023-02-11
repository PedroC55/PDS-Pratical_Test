public class Car implements Product{
    private String code, description;
    private double points;

    public Car(String code, String description, double points){
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
        return "Car [ code=" + code() + ", descr=" +  description() + ", points=" + points + "]";
    }
    
}
