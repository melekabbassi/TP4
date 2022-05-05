package Ex3;

public class Point implements Moveable {
    private Integer x;
    private Integer y;
    
    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Point(Integer x) {
        this.x = x;
        this.y = x;
    }
    
    public Integer getX() {
        return x;
    }
    
    public Integer getY() {
        return y;
    }
    
    public void setX(Integer x) {
        this.x = x;
    }
    
    public void setY(Integer y) {
        this.y = y;
    }
    
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    @Override
    public void translate(Integer tx, Integer ty) {
        setX(getX() + tx);
        setY(getY() + ty); 
    }
}
