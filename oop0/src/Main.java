//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Point p = new Point();

        p.x = 50F;
        p.y = 75.5F;

        System.out.println(p);
        p.translate(20,-5);
        System.out.println(p);

        Point p2 = p.translated( -30F,  -0.5F);
        System.out.println(p2);

        Segment s = new Segment();
        s.p = p;
        s.q = p2;

        System.out.println(s.length());
    }
}