import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


/**
 * Created by hchan on 8/10/15.
 */
public class FightTest {

    @Test
    public void a_should_be_killed_when_a_is_stronger(){
        Player p1=new Player("a",100,10);
        Player p2=new Player("b", 100, 30);
        PrintStream printStream=mock(PrintStream.class);
        Fight fight=new Fight(p1,p2,printStream);
        fight.start();
        verify(printStream, times(1)).println("a被打败了");

    }

    @Test
    public void b_should_be_killed_when_b_is_stronger(){
        Player p1=new Player("a",100,10);
        Player p2=new Player("b", 100, 2);
        PrintStream printStream=mock(PrintStream.class);
        Fight fight=new Fight(p1,p2,printStream);
        fight.start();
        verify(printStream).println("b被打败了");

    }


}
