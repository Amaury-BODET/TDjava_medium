import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class StaticThing {
    private Integer SizeX;
    private Integer SizeY;
    private ImageView Background;

    public StaticThing(Integer SizeX, Integer SizeY, String fileName, ImageView Background){
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        Image ImageBackground = new Image(fileName);
        this.Background = new ImageView(ImageBackground);
    }

}
