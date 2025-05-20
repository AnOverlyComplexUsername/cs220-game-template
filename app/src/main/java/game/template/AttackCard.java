package game.template;

public class AttackCard extends AbstractCard{

    private int attack = 0;

    public AttackCard(int cost, String imageName) {
        super(cost, imageName);
        this.type = CardType.ATTACK;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


}
