import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator{
    private String transform;

    @Override
    public String toSvg() {
        return this.decoratedShape.toSvg().replace("/>",
                String.format(" transform=\"%s\" />", transform));
    }
    public static  class Builder{
        private  Vec2 translatiom;
        private double rotation;
        private  Vec2 scale;

        public Builder translate(Vec2 translatiom){
            this.translatiom = translatiom;
            return  this;
        }


        public String build(){
            String result = "";
            if(translatiom != null){
                result = String.format(Locale.ENGLISH,
                        "translate(%f %f",
                        translatiom.x(), translatiom.y());
            }
        }

        public TransformationDecorator(Shape decoratedShape, Vec2 translatiom){
            super(decoratedShape);
            Builder builder = new Builder().translate(translatiom).rotate(45),scale(2.0);
            this.transform = builder.build();
        }

        public Builder translate(Vec2, translatiom){
            this.translatiom = translatiom;
            return this;
        }

    }

}
