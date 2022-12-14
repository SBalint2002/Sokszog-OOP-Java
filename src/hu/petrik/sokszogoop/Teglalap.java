package hu.petrik.sokszogoop;

public class Teglalap extends Sokszog {
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public Teglalap() {
        super(getVeletlenOldal());
        this.b = getVeletlenOldal();
    }

    private static double getVeletlenOldal() {
        return Math.random() * 20 + 5;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getKerulet() {
        return 2 * (this.getA() + this.b);
    }

    @Override
    public double getTerulet() {
        return this.getA() * this.b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %-10.3f b = %-10.3f K = %-10.3f T: = %-10.3f", this.getA(), this.getB(), this.getKerulet(), this.getTerulet());
    }
}
