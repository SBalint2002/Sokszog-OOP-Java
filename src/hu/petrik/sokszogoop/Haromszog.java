package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private boolean isSzerkesztheto() {
        return !((this.getA() + this.b) <= this.c) && !((this.getA() + this.c) <= this.b) && !((this.c + this.b) <= this.getA());
    }

    public double getKerulet() {
        return this.getA() + this.b + this.c;
    }

    public double getTerulet() {
        double s = (this.getA() + this.b + this.c) / 2;
        return Math.sqrt(s * (s - this.getA()) * (s - this.b) * (s - this.c));
    }
}
