package hu.petrik.sokszogoop;

public class Negyzet extends Sokszog{
    private double atlo;
    private double oldal;

    public Negyzet(){
        super(getVeletlenOldal());
        this.atlo = getVeletlenAtlo();
    }

    public Negyzet(double a, double atlo) {
        super(a);
        this.atlo = atlo;
    }

    public double getAtlo() {
        return atlo;
    }

    public void setAtlo(double atlo) {
        this.atlo = atlo;
    }

    private static double getVeletlenOldal() {
        return Math.random() * 10 + 5;
    }
    private double getVeletlenAtlo(){ return Math.sqrt(2*(this.getA()*this.getA()));}

    @Override
    public double getKerulet() {
        return this.getA()*this.getA();
    }

    @Override
    public double getTerulet() {
        return (this.getA()*this.atlo)/2;
    }

    @Override
    public String toString() {
        return String.format("Négyzet: a = %-10.3f Átló = %-10.3f %s", this.getA(), this.getAtlo(), super.toString());
    }
}
