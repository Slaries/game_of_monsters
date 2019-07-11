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

        while (warrior.getHealth() > 0 && monster.getHealth() > 0) {
            warrior.attack(monster);
            monster.attack(warrior);
        }
        System.out.println("Game Over!");
    }
}
