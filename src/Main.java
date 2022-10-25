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
        GameScene theScene = new GameScene(pane, 800, 400,true);
        Image spriteSheet = new Image("C:\\Users\\momob\\Documents\\ENSEA\\Java\\img\\heros.png");
        ImageView sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20,0,65,100));
        sprite.setX(200);
        sprite.setY(300);
        primaryStage.setScene(theScene);
        primaryStage.show();
        System.out.println(theScene.cam1.toString());
    }
    public static void main(String[] args) {
        launch(args);
    }
}