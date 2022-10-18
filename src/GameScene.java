import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {
    Camera cam1 = new Camera(100,100);

    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }
}
