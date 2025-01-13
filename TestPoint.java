public class TestPoint {
    public static void main(String[]args){
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(-5, 7);
        Point p4 = new Point(3, -10);
        Point p5 = new Point(3, 10);
        Point p6 = new Point(6, 8);
        System.out.println("The points: ");
        System.out.println("p1: x = " + p1.getX() + ", y = " + p1.getY());
        System.out.println("p2: x = " + p2.getX() + ", y = " + p2.getY());
        System.out.println("p3: x = " + p3.getX() + ", y = " + p3.getY());
        System.out.println("p4: x = " + p4.getX() + ", y = " + p4.getY());
        System.out.println("p5: x = " + p5.getX() + ", y = " + p5.getY());
        System.out.println("p6: x = " + p6.getX() + ", y = " + p6.getY());
    }
}
