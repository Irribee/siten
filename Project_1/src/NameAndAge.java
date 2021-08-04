public class NameAndAge {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 20);
        Person person2 = new Person();
        String s1 = "Вова";
        person2.setNameAndAge(s1, 67);
        person1.speak();
        person2.speak();
    }
}
        class Person {
            String name;
            int age;
void setNameAndAge(String piname, int piage){
    name=piname;
    age=piage;
}
void speak(){
    for (int  i=0;i<2; i++);
    System.out.println ("Меня зовут "+name+"мне " +age+" лет");

}
        }


