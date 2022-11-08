import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AnimatedThing {
    protected static Image spriteSheet;
    protected static ImageView sprite;
    protected static Integer countFrame;
    protected static Integer maxFrame;
    protected static Integer offsetFrame;
    protected static Integer index;
    protected static Integer maxindex;


    public AnimatedThing (String filename, Integer x, Integer y, Integer state) {
        spriteSheet = new Image(filename);
        sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20, 0, 65, 100));
        sprite.setX(200);
        sprite.setY(300);
    }

    public ImageView getSprite(){return sprite;}

    public static void update (long time){
        if (countFrame==maxFrame){
            Hero.sprite.setViewport(new Rectangle2D((Hero.index)*Hero.offsetFrame,0,85,100));
            if(Hero.index==Hero.maxindex){
                Hero.index=0;
            }
            else{
                Hero.index+=1;
            }
            countFrame=0;
        }
        else{
            countFrame+=1;
        }
    }
}

















