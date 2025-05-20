package game.template;

import javafx.scene.image.Image;

public abstract class AbstractEntity implements IEntity {
    protected int health;
    protected Image icon;

    public AbstractEntity(int health, String imageName) {
        this.health = health;
        this.icon = new Image(getClass().getResource("/sprite_assests/" + imageName).toString(), 100, 200, true,
                true);
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean checkDeath() {
        return health <= 0;
    }

}
