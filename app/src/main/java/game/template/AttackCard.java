package game.template;

public class AttackCard extends AbstractCard {

    private int attack = 0;

    public AttackCard(int cost, String imageName, String name) {
        super(cost, imageName, name);
        this.type = CardType.ATTACK;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void useOnEnemy(IEntity target) {
        target.takeDamage(attack);
    }

    @Override
    public void useOnPlayer(Player player) {
        throw new UnsupportedOperationException("Attack Card not supported for player self use.");
    }

}
