/**
 * Created by alexander on 2018-02-14.
 */
public class Cord {
    private int x;
    private int y;

    public Cord() {
        x = 0;
        y = 0;

    }

    public Cord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {x, y};
    }

    public String toString() {
        return this.x + " " + this.y;
    }




}
