package game.template;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;


public abstract class AbstractCard {
    protected int cost = 0;
    protected Image icon;
    protected CardType type = null;

    public AbstractCard(int cost, String imageName)
    {
        this.cost = cost;
        this.icon = new Image(getClass().getResource("card_assests" + imageName + ".png").toString(),100,200, true, true);
    }

    public Color getColor()
    {
        return type.getColor();
    }

}
