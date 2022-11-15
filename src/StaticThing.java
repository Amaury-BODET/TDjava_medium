import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class StaticThing {
    protected Integer SizeX;
    protected Integer SizeY;
    protected Integer value;
    private ImageView Background;
    protected Image ImageBackground;

    public StaticThing(Integer SizeX, Integer SizeY, double X, double Y, String fileName, Integer value){
        this.SizeX = SizeX;
        this.SizeY = SizeY;
        this.ImageBackground = new Image(fileName);
        this.Background = new ImageView(ImageBackground);
        this.Background.setX(X);
        this.Background.setY(Y);
        this.value=value;
    }
    public ImageView getBackground(){
        return Background;
    }
    public Image getImageBackground() { return ImageBackground;}
}
