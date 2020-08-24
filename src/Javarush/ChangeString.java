package Javarush;

public class ChangeString {
    public static void main(String[] args) {
        Human ded1 = new Human("As", true, 90, null, null);
        Human ded2 = new Human("Sd", true, 88, null, null);
        Human bab1 = new Human("Sa", false, 87, null, null);
        Human bab2 = new Human("Ds", false, 87, null, null);
        Human father = new Human("Fa", true, 50, ded1, bab1);
        Human mother = new Human("Ma", false, 47, ded2, bab2);
        Human ch1 = new Human("A", true, 10, father, mother);
        Human ch2 = new Human("B", false, 5, father, mother);
        Human ch3 = new Human("C", true, 1, father, mother);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human  {
        // напишите тут ваш код
        private String name;
        Boolean sex;
        int age;
        Human father, mother;
        Human (String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human (String name, Boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }

}
