package FirstProjecttt;
public class Punct {
    protected int x;
    protected int y;

    public Punct() {
        this.x = 0;
        this.y = 0;
    }

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "X:" + this.x + "\nY:" + this.y;
    }

    public double Rezolva(Punct p2) {
        return Math.sqrt(Math.pow((double) (this.x - p2.getX()), 2.0) + Math.pow((double) (this.y - p2.getY()), 2.0));
    }
}