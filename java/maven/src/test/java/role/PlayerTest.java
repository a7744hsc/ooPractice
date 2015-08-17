package role;

import org.junit.Test;
import role.Player;

import static org.junit.Assert.*;



/**
 * Created by hchan on 8/10/15.
 */
public class PlayerTest {
    @Test
    public void should_minus_hp_when_attacked(){
        Player p1=new Player("a",100,10);
        Player p2=new Player("b", 100, 10);
        p1.attack(p2);
        assertEquals(90, p2.getHp());
    }

    @Test
    public void should_return_HP_when_given_a_player(){
        Player player=new Player("a",100,10);
        assertEquals("a",player.getName());
    }



}
