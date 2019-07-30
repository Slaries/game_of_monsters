package fight;

 interface Attackable {

        int attack(Attackable attackable);
        void setName(String name);
        String getName();
        void setHealth(int health);
        int getHealth ();


}
/**
 * TODO:
 * 1. исправить аргумент метода. Не компилируется же!
 * 2. объявить тут геттеры и сеттеры для полей.
 * (только объявить, без реализации!)
 * 3. Убрать модификатор public. Все методы интерфейса по умолчанию публичные,
 *  если не указано другого.
 */