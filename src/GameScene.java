import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class GameScene extends Scene {
    Camera cam1 = new Camera(100,100);
    StaticThing stRight = new StaticThing(600,400,"C:\\Users\\momob\\Documents\\ENSEA\\Java\\img\\desert.png");
    StaticThing stLeft = new StaticThing(600,400,"C:\\Users\\momob\\Documents\\ENSEA\\Java\\img\\desert.png");

    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }

}
