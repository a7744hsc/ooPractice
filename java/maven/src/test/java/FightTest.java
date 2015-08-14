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
    public void should_be_killed_when_b_is_stronger(){
        Player p1=new Player("a",100,10);
        Player p2=new Player("b", 100, 2);
        PrintStream printStream=mock(PrintStream.class);
        Fight fight=new Fight(p1,p2,printStream);
        fight.start();
        verify(printStream).println("b被打败了");

    }

    @Test
    public void should_retuen_true_When_sb_is_killed(){
        Player p1=new Player("a",100,50);
        Player p2=new Player("b", 30, 2);
        PrintStream printStream=mock(PrintStream.class);
        Fight fight=new Fight(p1,p2,printStream);
        assertEquals(true, fight.attackAndPrint(p1, p2));
        verify(printStream).println("b被打败了");

    }

    @Test
    public void should_retuen_false_When_nobody_is_killed(){
        Player p1=new Player("a",100,50);
        Player p2=new Player("b", 100, 2);
        PrintStream printStream=mock(PrintStream.class);
        Fight fight=new Fight(p1,p2,printStream);
        assertEquals(false, fight.attackAndPrint(p1, p2));
        verify(printStream,times(0)).println("b被打败了");

    }

    @Test
    public void should_print_info_when_attack(){
        Player p1=new Player("a",100,50);
        Player p2=new Player("b", 100, 2);
        PrintStream printStream=mock(PrintStream.class);
        Fight fight=new Fight(p1,p2,printStream);
        fight.attackAndPrint(p1,p2);
        verify(printStream).println("a攻击了b,b受到了50点伤害,b剩余生命：50");

    }



}
