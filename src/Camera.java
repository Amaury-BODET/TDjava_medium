public class Camera {
    private double X;
    private double Y;
    private Integer WidthX;
    private Integer WidthY;
    private double acceleration;
    private double vitesse;
    private double position;

    private double deltaT;
    private double saveTime;

    private double deltaVx;

    private double deltaX;

    private double k;

    private double m;

    private double f;

    public Camera(Integer X, Integer Y, Integer WidthX, Integer WidthY){
        this.X=X;
        this.Y=Y;
        this.WidthX=WidthX;
        this.WidthY=WidthY;
        saveTime = System.nanoTime();
        deltaVx = 0;
        deltaX = 0;
        deltaT = 0.0016;
        k =1;
        m=1;
        f =1.2;
        acceleration = -300;
        vitesse = 0;
    }
    public void update(long time) {
        this.deltaT = ((time - saveTime)*1e-9); //nanosecond -> second
        this.acceleration = (k/m)*(AnimatedThing.sprite.getX()-X)+(f/m)*vitesse;
        this.deltaVx = acceleration*deltaT;
        this.deltaX = vitesse*deltaT;
        this.vitesse = vitesse+deltaVx;
        this.X = X+deltaX;
        System.out.println("X="+X+" ;Xhero= "+AnimatedThing.sprite.getX()+" ;DeltaT= "+deltaT+"; "+time);
        saveTime = time;
    }
    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
    public double getWidthX(){
        return WidthX;
    }
    public double getWidthY() { return WidthY; }
    public void setX(double x){ X = x; }
    @Override
    public String toString(){
        return "[" + this.X + "," + this.Y + "]";
    }

}
