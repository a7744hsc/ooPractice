import role.Player;

/**
 * Created by hchan on 8/12/15.
 */
public class Main {
    public static void main(String[] ags){
        Player p1=new Player("张三",100,1);
        Player p2=new Player("李四",100,2);
        Fight fight=new Fight(p1,p2,System.out);
        fight.start();
    }
}
