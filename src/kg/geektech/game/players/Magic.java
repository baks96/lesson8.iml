package kg.geektech.game.players;

public class Magic extends Hero{
    public Magic(int health, int damage,String name) {
        super(health, damage,
                SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
