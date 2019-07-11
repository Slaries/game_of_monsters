package fight;

public class Human {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Tom";
        person1.age = 31;

        Person person2 = new Person();
        person2.name = "Sara";
        person2.age = 18;
        System.out.println("Его зовут " + person1.name + ", и ему " + person2.age);
        person2.speak();

        person1.CalculateYears();
        int years1 = person2.CalculateYears();

        Person person3 = new Person();
        person3.setName("Mark person 3");
        person3.setAge(30);
        System.out.println(person3.getName() + "  " + person3.getAge());

        Person person4 = new Person();
        person4.setNameAndAge("Kevin",25);




    }
}
class Person{
    String name;
    int age;

    public void setName(String userName) {
        this.name = userName;
    }

    public void setAge(int userAge) {
        if(userAge > 0 ){
        this.age = userAge;}
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    void setNameAndAge(String userName, int userAge){
        this.name = userName;
        this.age = userAge;
    }

    int CalculateYears(){
        int years = 60 - age;
        System.out.println("До пенсии осталось " + years);
        return years;
    }
    void speak(){
        System.out.println("My name is " + name +", my age is " + age);
    }
}
