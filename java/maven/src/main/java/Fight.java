import java.io.PrintStream;

/**
 * Created by hchan on 8/10/15.
 */
public class Fight {
    private Player offensivePlayer,defensivePlayer;
    private PrintStream printer;
    public Fight(Player offensivePlayer,Player defensivePlayer,PrintStream printer) {
        this.offensivePlayer=offensivePlayer;
        this.defensivePlayer=defensivePlayer;
        this.printer=printer;
    }

    public void start(){

        boolean fightEnd=false;
        while(!fightEnd){
            fightEnd = attackAndPrint(offensivePlayer,defensivePlayer);
                if(!fightEnd){
                    fightEnd = attackAndPrint(defensivePlayer,offensivePlayer);
                }

//            offensivePlayer.attack(defensivePlayer);
//            if(defensivePlayer.getHp()<=0){
//                printer.println(defensivePlayer.getName()+"被打败了");
//                break;
//            }
//
//            defensivePlayer.attack(offensivePlayer);
//            if(offensivePlayer.getHp()<=0){
//                printer.println(offensivePlayer.getName()+"被打败了");
//                break;
//            }
        }

    }



     boolean attackAndPrint(Player attacker,Player defender){
        attacker.attack(defender);
        if(defender.getHp()<=0) {
            printer.println(defender.getName() + "被打败了");
            return true;
        }
        return false;


    }
}
