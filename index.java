// WARZONE - Java mini project using Object-Oriented Programming

package warzone;

import com.company.Player1;
import com.company.Player2;

public class index {
    public static void main(String[] args) {
        Player1 player = new Player1("Niranjan","Sword",100);
        System.out.println("Name of the player:- " + player.getName());
        System.out.println("Name of the weapon:- " + player.getWeapon());
        System.out.println("Percentage of health:- " + player.getHealth());
        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun2();
        player.heal();

        System.out.println();

        Player2 Betterplayer = new Player2("Aishwarya","Machine Gun",100,false);
        System.out.println("Name of the player:- " + Betterplayer.getName());
        System.out.println("Name of the weapon:- " + Betterplayer.getWeapon());
        System.out.println("Percentage of health:- " + Betterplayer.getHealth());
        Betterplayer.damageByGun1();
        Betterplayer.damageByGun1();
        Betterplayer.damageByGun2();
        Betterplayer.heal();
    }
}