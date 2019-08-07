package fight;

 public interface Attackable {

        int attack(Attackable attackable, String command);
        void setName(String name);
        String getName();
        void setHealth(int health);
        int getHealth ();


}