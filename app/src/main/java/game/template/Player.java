package game.template;


public class Player extends AbstractEntity {

    private int energy = 10;
    private int armor = 0;

    public Player(int health, String imageName, int energy) {
        super(health, imageName);
        this.energy = energy;
    }

    @Override
    public void takeDamage(int damage)
    {
        if(armor > 0) 
        {
            armor -= damage;
            if (armor <= 0)
            {
                armor = 0;
            }
        }
        else this.health -= damage;
    }

    

    public void useCard(AbstractCard card, IEntity target)
    {
        
    }
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getDefense() {
        return armor;
    }

    public void setDefense(int defense) {
        this.armor = defense;
    }

}
