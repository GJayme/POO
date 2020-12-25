package class_05.exercise02;

public abstract class Figura {

    private Integer x;
    private Integer y;

    public Figura(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    public abstract Double getArea();
}
