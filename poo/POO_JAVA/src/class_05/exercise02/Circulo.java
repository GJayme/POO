package class_05.exercise02;

public class Circulo extends Figura {

    private Double raio;

    public Circulo(Integer x, Integer y, Double raio) {
        super(x, y);
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
