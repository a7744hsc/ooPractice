package role;

import java.io.PrintStream;

/**
 * Created by hchan on 8/10/15.
 */
public class Player {
      private String name;
      private int hp;
      private int atk;
      private String type;


      public Player(String name, int hp, int atk) {
            type="普通人";//两种声明方式
            this.name = name;
            this.hp = hp;
            this.atk = atk;
      }

      public String attack(Player player){
            player.hp-=getAtk();//在同一个类即可访问
            return this.getType()+this.getName()+"攻击了"+player.getType()+player.getName()+","+player.getName()+"受到了"+this.getAtk()+"点伤害,"+player.getName()+"剩余生命："+player.getHp();
      }
    
      public String getType() {
            return type;
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
