/**
 * Created by hchan on 8/10/15.
 */
public class Player {
      private String name;
      private int hp;
      private int atk;


      public Player(String name, int hp, int atk) {
            this.name = name;
            this.hp = hp;
            this.atk = atk;
      }

      public void attack(Player player){
            player.hp-=this.atk;
      }




      public String getName() {
            return name;
      }

//      public void setName(String name) {
//            this.name = name;
//      }

      public int getHp() {
            return hp;
      }

      public void setHp(int hp) {
            this.hp = hp;
      }

      public int getAtk() {
            return atk;
      }

      public void setAtk(int atk) {
            this.atk = atk;
      }



}
