package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog {
    private double alfa;
    private double b;

    public Paralelogramma() {
        super(getVeletlenOldal());
        this.b = getVeletlenOldal();
        this.alfa = getVeletlenSzog();
        while (!isSzerkesztheto()) {
            super.setA(getVeletlenOldal());
            this.b = getVeletlenOldal();
            this.alfa = getVeletlenSzog();
        }
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    private static double getVeletlenOldal() {
        return Math.random() * 10 + 5;
    }

    private static double getVeletlenSzog() {
        return (Math.random() * (2 * 180) + 1) - 1;
    }

    public boolean isSzerkesztheto() {
        return alfa < 180;
    }

    public Paralelogramma(double a, double alfa) {
        super(a);
        this.alfa = alfa;
    }

    @Override
    public double getKerulet() {
        return 2 * (super.getA() + this.b);
    }

    @Override
    public double getTerulet() {
        return super.getA() * this.b * Math.sin(Math.toRadians(this.alfa));
    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a=%-10.3f b=%-10.3f %s", getA(), this.b, super.toString());
    }
}
