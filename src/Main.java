import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene theScene = new GameScene(pane, 1200, 400,true);
        primaryStage.setScene(theScene);
        primaryStage.show();
        System.out.println(theScene.cam.toString());
        theScene.render(theScene.cam);
        AnimationTimer timer = new AnimationTimer() {
            public void handle(long time) {
                theScene.character.update(time);
                theScene.cam.update(time);
                theScene.update(time);
                System.out.println(time);
            }
        };
        timer.start();
    }
    public static void main(String[] args) {
        launch(args);
    }
}