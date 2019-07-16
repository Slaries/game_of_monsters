package fight;
public class War {
    public static void startOfWar() {
        Warrior warrior = new Warrior("Hulk", 100); //  create my doldoebiki
        Monster monster = new Monster("Tanos", 100);
            System.out.println("This war it's best of all, that can you see!");
            System.out.println("Press any key to start game ! ");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
        do {
            outputMessageAboutDamage(warrior.getName(), monster.getName(), warrior.attack(monster));
            if (monster.getHealth() > 0)
            outputMessageAboutDamage( monster.getName(), warrior.getName(), monster.attack(warrior));

        } while (warrior.getHealth() > 0 && monster.getHealth() > 0);
        if (warrior.getHealth() == 0)
            System.out.printf( "%s  победил!!! %s погиб в не равном бою \n" , monster.getName(),warrior.getName());
        else
            System.out.printf( "%s  победил!!! %s погиб в не равном бою \n", warrior.getName(),monster.getName());
        System.out.println("Game Over!");
    }
    public static void outputMessageAboutDamage(String attackName,String defenseName, int damage ){
        System.out.printf("%s, нанес %s, %d  урона \n", attackName, defenseName, damage);
    }
}


