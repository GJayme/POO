package class_05.exercise01;

public class Triangulo extends Figura {

    private Double l1,l2,l3;

    public Triangulo(Integer x, Integer y, Double l1, Double l2, Double l3) {
        super(x, y);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public Double getArea() {
        Double p = (l1 + l2 + l3)/2;

        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                '}';
    }
}
