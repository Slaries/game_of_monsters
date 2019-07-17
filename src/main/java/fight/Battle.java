package fight;

import java.util.Scanner;

public class Battle {
    public static void startBattle() {
        Warrior warrior = new Warrior("Hulk", 100); //  create my doldoebiki
        Monster monster = new Monster("Tanos", 100);
            System.out.println("This war it's best of all, that can you see!");
            System.out.println("Press any key to start game ! ");
        Scanner readFromScanner = new Scanner(System.in);
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
        while (warrior.getHealth() > 0 && monster.getHealth() > 0) {
            System.out.println("нажмите А для атаки");
            if ("A".equals(readFromScanner.next()))
                outputMessageAboutDamage(warrior.getName(), monster.getName(), warrior.attack(monster));
            if (monster.getHealth() > 0)
                    outputMessageAboutDamage(monster.getName(), warrior.getName(), monster.attack(warrior));
            if (warrior.getHealth() == 0)
                System.out.printf( "%s  победил!!! %s погиб в неравном бою \n" , monster.getName(),warrior.getName());
            if (monster.getHealth() == 0)
                System.out.printf( "%s  победил!!! %s погиб в неравном бою \n", warrior.getName(),monster.getName());
        }
        if (monster.getHealth() == 0 && warrior.getHealth() == 0)
            System.out.println( "Никто не победил!!! задано мало очков здоровья");
        System.out.println("Game Over!");
    }
    public static void outputMessageAboutDamage(String attackName,String defenseName, int damage ){
        System.out.printf("%s, нанес %s, %d  урона \n", attackName, defenseName, damage);
    }
}


