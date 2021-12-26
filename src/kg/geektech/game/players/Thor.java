package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor  extends Hero{
    public Thor (int health, int damage){
        super(health,damage,SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth()>0 && RPG_Game.randNumOfThor ==3){
            for (int i=0; i <heroes.length; i++){
                if ( heroes [i].getHealth()>0)
                    heroes[i].setHealth(heroes[i].getHealth()+50);
            }
            System.out.println("THOR KILL BOSS LOL");
        }

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
