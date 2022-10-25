import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class StaticThing {
    private Integer SizeX;
    private Integer SizeY;
    private ImageView Background;

    public StaticThing(Integer SizeX, Integer SizeY, double X, double Y, String fileName){
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        Image ImageBackground = new Image(fileName);
        this.Background = new ImageView(ImageBackground);
        this.Background.setX(X);
        this.Background.setY(Y);
    }
    public ImageView getBackground(){
        return Background;
    }

}
