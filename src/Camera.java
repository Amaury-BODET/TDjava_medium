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

    @Override
    public String toString(){
        return "[" + this.X + "," + this.Y + "]";
    }
}
