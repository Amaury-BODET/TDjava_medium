import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    Camera cam1 = new Camera(100,100);
    private Integer numberOfLives;
    protected Pane pane;

    public GameScene(Pane pane, double v, double v1, boolean b) {
        super(pane, v, v1, b);
        numberOfLives = 3;
        stRight = new StaticThing(800,400, 799,0,"C:\\Users\\momob\\Documents\\ENSEA\\Java\\img\\desert.png");
        stLeft = new StaticThing(800,400,0,0,"C:\\Users\\momob\\Documents\\ENSEA\\Java\\img\\desert.png");

        charactere=
        pane.getChildren().add(stRight.getBackground());
        pane.getChildren().add(stLeft.getBackground());
    }
    public void render (Camera cam1){
        ((ImageView) pane.getChildren().get(1)).setViewport(new Rectangle2D(cam1.getX(),cam1.getY(),cam1.getWidthX(),cam1.getWidthY()));
        ((ImageView) pane.getChildren().get(2)).setX(stRight.SizeX-cam1.getX());
        ((ImageView) pane.getChildren().get(2)).setVisible(false);
        if (cam1.getX()+cam1.getWidthX()>stLeft.SizeX){
            ((ImageView) pane.getChildren().get(2)).setViewport(new Rectangle2D(0,cam1.getY(),cam1.getWidthX()-(stRight.SizeX-cam1.getX()),cam1.getWidthY()));
            ((ImageView) pane.getChildren().get(2)).setVisible(true);
        }
        if (cam1.getX()>=stLeft.SizeX){
            ((ImageView) pane.getChildren().get(2)).setX(cam1.getX()- stLeft.SizeX);
        }
        if (numberOfLives==3){
            stLeft.getBackground().setViewport(new Rectangle2D(100, 5, 755, 200));
            ((ImageView) pane.getChildren().get(3)).setX(-300);
            ((ImageView) pane.getChildren().get(3)).setY(-80);
        }
        else if (numberOfLives==2){
            stLeft.getBackground().setViewport(new Rectangle2D(99, 244, 758, 220));
            ((ImageView) pane.getChildren().get(3)).setX(-300);
            ((ImageView) pane.getChildren().get(3)).setY(-80);
        }
        else if (numberOfLives==1){
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






















