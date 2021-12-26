package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random=new Random();
        int randNum =random.nextInt(2)+2;
        int coeff = RPG_Game.random.nextInt(5) + 1;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        this.setDamage(10);
        this.setDamage(this.getDamage() * randNum);
        System.out.println("Warrior hits critically " + this.getDamage() + " randNum: "+randNum * coeff);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
