package role;

import equipment.Shield;
import equipment.Weapon;
import role.Player;

/**
 * Created by hchan on 8/14/15.
 */
public class Soldier extends Player {
    private String type="战士";
    private Weapon weapon=null;
    private Shield shield=null;


    public Soldier(String name, int hp, int atk) {
        super(name, hp, atk);
    }

    public Soldier(String name, int hp, int atk, Weapon weapon, Shield shield) {
        super(name, hp, atk);
        this.weapon = weapon;
        this.shield = shield;
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getAtk() {
        return super.getAtk()+weapon.getAttack();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }


}
