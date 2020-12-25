package class_05.exercise01;

public class Retangulo extends Figura{

    private double largura;
    private double comprimento;

    public Retangulo(int x, int y, Double largura, Double comprimento) {
        super(x, y);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public Double getArea(){
        return largura * comprimento;
    }
}
