public abstract class Shape {
    Style style;

    public Shape(Style style){
        this.style = style;
    }
    public abstract  String toSvg();

}
