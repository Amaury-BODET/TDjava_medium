import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    Camera cam1 = new Camera(100,100);
    StaticThing stRight = new StaticThing(800,400, 799,0,"C:\\Users\\momob\\Documents\\ENSEA\\Java\\img\\desert.png");
    StaticThing stLeft = new StaticThing(800,400,0,0,"C:\\Users\\momob\\Documents\\ENSEA\\Java\\img\\desert.png");

    public GameScene(Pane pane, double v, double v1, boolean b) {
        super(pane, v, v1, b);
        pane.getChildren().add(stRight.getBackground());
        pane.getChildren().add(stLeft.getBackground());
    }
    public void render (Camera cam1){
        cam1.getX()
                setviawpotr
    }

}
