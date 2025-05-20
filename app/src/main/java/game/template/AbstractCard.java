package game.template;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public abstract class AbstractCard {
    protected int cost = 0;
    protected Image icon;
    protected CardType type = null;
    protected String name = "";

    public AbstractCard(int cost, String imageName, String name) {
        this.cost = cost;
        this.name = name;
        this.icon = new Image(getClass().getResource("/card_assests/" + imageName).toString(), 100, 100, true,
                true);
    }

    public abstract void useOnEnemy(IEntity target);

    public abstract void useOnPlayer(Player player);

    public Color getColor() {
        return type.getColor();
    }

}
