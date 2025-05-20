package game.template;


public class TestEnemy extends AbstractEntity {

    private int atkDamage = 0;
    public TestEnemy(int health, String imageName, int atkDamage) {
        super(health, imageName);
        this.atkDamage = atkDamage;
        //TODO Auto-generated constructor stub
    }

     public void attack(IEntity target)
    {
        target.takeDamage(this.atkDamage);
    }

  
}

