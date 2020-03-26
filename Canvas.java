import Point.java;

public class Canvas {
    List<Point> poeni = new List<Point>();
    public Canvas(List<Point> point) {
        this.point = point;
    }
    public void dodadi(Point poen){
        poeni.add(poen);
    }
    public void izbrisi(Point poen){
        poeni.remove(poen);
    }
    public void pomesti(List<Point> poeni, String xDir, String yDir){
        for(Point pts: poeni){
            pts.move(xDir,yDir);
        }
    }
}