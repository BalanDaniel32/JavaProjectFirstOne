package FirstProjecttt;

public class EcuatieGrad1 {
    protected int a;
    protected int b;

    public EcuatieGrad1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String toString() {
        return this.a + "x + " + this.b + "= 0";
    }

    public double rezolva()
    {
        return (double)(-this.b) / (double)this.a;
    }
}