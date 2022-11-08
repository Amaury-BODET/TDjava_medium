public class Camera {
    private Integer X;
    private Integer Y;

    public Camera(Integer X, Integer Y){
        this.X=X;
        this.Y=Y;
    }

    public Integer getX(){
        return this.X;
    }
    public Integer getY(){
        return this.Y;
    }
    public double getWidthX(){
        return this.X+200;
    }
    public double getWidthY() {
        return this.Y+300;
    }

    @Override
    public String toString(){
        return "[" + this.X + "," + this.Y + "]";
    }

}
