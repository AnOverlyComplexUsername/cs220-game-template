package game.template;

import javafx.scene.paint.Color;

public enum CardType {
    ATTACK(Color.RED),
    UTILITY(Color.DARKGRAY),
    HEAL(Color.GREEN),
    DEFENSE(Color.YELLOW);

    private final Color color;
    CardType(Color color){
    this.color = color;
    }  

    public Color getColor(){
        return color;
    }
}



