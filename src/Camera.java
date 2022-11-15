public class Camera {
    private Integer X;
    private Integer Y;
    private Integer WidthX;
    private Integer WidthY;

    public Camera(Integer X, Integer Y, Integer WidthX, Integer WidthY){
        this.X=X;
        this.Y=Y;
        this.WidthX=WidthX;
        this.WidthY=WidthY;
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
