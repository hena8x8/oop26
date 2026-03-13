import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello World");
//        Point p = new Point();
//
//
//        System.out.println(p);
//        p.translate(20,-5);
//        System.out.println(p);
//
//
//        Point p2 = new Point(2.6F, 9);
//        Point p2 = p.translated( -30F,  -0.5F);
//        System.out.println(p2);
//
//        Segment s = new Segment();
//        s.p = p;
//        s.q = p2;
//
//        System.out.println(s.length());
//
//
//        Point p3 = new Point();
//        p3.x = 6;
//        p3.y = 13;
//        Point p4 = new Point();
//        p4.x = 5;
//        p4.y = 15;
//        Segment s2 = new Segment();
//        s2.p = p3;
//        s2.p = p4;
//
//        Point p5 = new Point();
//        p5.x = 9;
//        p5.y = 23;
//        Point p6 = new Point();
//        p6.x = 4;
//        p6.y = 11;
//        Segment s3 = new Segment();
//        s3.p = p5;
//        s3.p = p6;
//
//        Segment[] segments = new Segment[3];
//        segments [0] = s;
//        segments [1] = s2;
//        segments [2] = s3;
//
//        System.out.println(Segment.findMax(segments).p);

//
//        Segment s1 = new Segment(new Point(p), new Point(p2));
//        System.out.println(s1);
//        p.setX(100);
//        System.out.println(s1);

        Point[] points = new Point[5];
        points[0] = new Point(2.3F, 5.6F);
        points[1] = new Point(10.5F, 12.4F);
        points[2] = new Point(15.4F, 72.2F);
        points[3] = new Point(72.4f, 81.6F);
        points[4] = new Point(162.4f, 51.3F);

        Polygon p1 = new Polygon(points);

        Polygon p2 = new Polygon(new Point[]{
            new Point(), new Point(10, 0), new Point(10, 10)
        });


        SvgScene scene = new SvgScene();
        scene.addPolygon(p1);
        scene.addPolygon(p2);
        System.out.println(scene.toSvg());
//        System.out.println(p1);
//        points[0].setX(0);
//        System.out.println(p1);
        scene.addShape(Polygon.square(new Segment(
                new Point(130.0f, 100.0f),
                new Point(100.0f, 130.0f)
        ), new Style("red", "green", 3.0)));

        scene.addShape(new Elipse(
                new Point( 100.0f, 100.0f),
                 20.0f, 50.0f,
                new Style("blue", "red",3.0)
        ));

        scene.save("out.svg");
        System.out.println(p1.boundingBox());

    }
}