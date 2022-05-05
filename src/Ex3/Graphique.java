package Ex3;

public class Graphique {
    public static void main(String[] args){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);
        
        Segment s1 = new Segment(p1, p2, 1);
        Segment s2 = new Segment(p2, p3, 2);
        Segment s3 = new Segment(p3, p1, 3);

        Triangle t = new Triangle(p1, p2, p3, 1);

        t.draw();
        t.translate(1, 1);
        t.draw();

    }
}
