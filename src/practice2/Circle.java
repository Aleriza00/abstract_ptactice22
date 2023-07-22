package practice2;

public class Circle extends Shape{
    private  double p;
    private int r;

    public Circle(double p, int r) {
        this.p = p;
        this.r = r;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }

    @Override
    public void calculateArea() {
        int s = (int) (p*(r*r));
        System.out.println(s);
    }

    @Override
    public void calculatePerimeter() {
        int perimetr = (int) (2*p*r);
        System.out.println(perimetr);
    }


}
