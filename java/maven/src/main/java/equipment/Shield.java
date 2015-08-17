package equipment;

/**
 * Created by hchan on 8/14/15.
 */
public class Shield {
    private String name;
    private Integer armor;

    public Shield( String name,Integer armor) {

        this.armor = armor;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }


}
