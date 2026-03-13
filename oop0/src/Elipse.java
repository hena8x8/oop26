import java.util.Locale;

public class Elipse {

    private Point center;
    private float rx, ry;

    public Elipse(Point center, float rx, float ry, Style style){
        super(style);
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String toSvg(){
        return String.format(Locale.ENGLISH,
                "<elipse rx=\"%f\" ry=\"%f\" cy=\"%f\" style=\"%o\" />", rx, ry, center.getX(), center.getY(), style.toSvg());

    }



}
