import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    protected Pane pane;
    protected static Camera cam ;
    private StaticThing stRight;
    private StaticThing stLeft;
    private StaticThing numberOfLives;
    protected Hero character;
    AnimationTimer timer;

    public void update (long time){
        if (AnimatedThing.countFrame == AnimatedThing.maxFrame) {
            cam.setX(cam.getX()+20);
            this.render(cam);

            AnimatedThing.countFrame = 0;
        }
        else {
            AnimatedThing.countFrame+=1;
        }
    }

    public GameScene(Pane Parentpane, double v, double v1, boolean b) {
        super(Parentpane, v, v1, b);
        pane = Parentpane;
        cam = new Camera(200,50,600,400);
        stRight = new StaticThing(800,400, 799,0,"desert.png",0);
        stLeft = new StaticThing(800,400,0,0,"desert.png",0);
        numberOfLives = new StaticThing(900, 200, 20, 20, "lives.png", 3);
        character = new Hero("heros.png",200,150,0);
        Parentpane.getChildren().add(stRight.getBackground());
        Parentpane.getChildren().add(stLeft.getBackground());
        Parentpane.getChildren().add(numberOfLives.getBackground());
        Parentpane.getChildren().add(character.getSprite());
        Parentpane.getChildren().get(3).setScaleX(0.15);
        Parentpane.getChildren().get(3).setScaleY(0.15);
    }
    public void render (Camera cam){
        ((ImageView) pane.getChildren().get(1)).setViewport(new Rectangle2D(cam.getX(),cam.getY(),cam.getWidthX(),cam.getWidthY()));
        ((ImageView) pane.getChildren().get(2)).setX(stRight.SizeX-cam.getX());
        ((ImageView) pane.getChildren().get(2)).setVisible(false);
        if (cam.getX()+cam.getWidthX()>stLeft.SizeX){
            ((ImageView) pane.getChildren().get(2)).setViewport(new Rectangle2D(0,cam.getY(),cam.getWidthX()-(stRight.SizeX-cam.getX()),cam.getWidthY()));
            ((ImageView) pane.getChildren().get(2)).setVisible(true);
        }
        if (cam.getX()>=stLeft.SizeX){
            ((ImageView) pane.getChildren().get(2)).setX(cam.getX()- stLeft.SizeX);
        }
        if (numberOfLives.value==3){
            stLeft.getBackground().setViewport(new Rectangle2D(100, 5, 755, 200));
            ((ImageView) pane.getChildren().get(3)).setX(-300);
            ((ImageView) pane.getChildren().get(3)).setY(-80);
        }
        else if (numberOfLives.value==2){
            stLeft.getBackground().setViewport(new Rectangle2D(99, 244, 758, 220));
            ((ImageView) pane.getChildren().get(3)).setX(-300);
            ((ImageView) pane.getChildren().get(3)).setY(-80);
        }
        else if (numberOfLives.value==1){
            stLeft.getBackground().setViewport(new Rectangle2D(96, 460, 758, 217));
            ((ImageView) pane.getChildren().get(3)).setX(-300);
            ((ImageView) pane.getChildren().get(3)).setY(-80);
        }
        else {
            stLeft.getBackground().setViewport(new Rectangle2D(94, 681, 754, 221));
            ((ImageView) pane.getChildren().get(3)).setX(-300);
            ((ImageView) pane.getChildren().get(3)).setY(-80);
        }
    }

}






















