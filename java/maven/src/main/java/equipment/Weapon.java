package equipment;

/**
 * Created by hchan on 8/14/15.
 */
public class Weapon {
    private String name;
    private Integer attack;

    public Weapon(String name, Integer attack) {
        this.name = name;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }
}
