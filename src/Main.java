import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene theScene = new GameScene(pane, 600, 400,true);
        primaryStage.setScene(theScene);
        primaryStage.show();
        System.out.println(theScene.cam1.toString());
    }
    public static void main(String[] args) {
        launch(args);
    }
}