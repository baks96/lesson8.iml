package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Antman extends Hero{

    public Antman(int health, int damage, SuperAbility superAbility, String name) {
        super(health, damage, superAbility, name);
    }





    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean one = RPG_Game.random.nextBoolean();
        if (one) {
            this.setHealth(this.getHealth() + 100);
            this.setDamage(this.getDamage() + 10);
        }

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
