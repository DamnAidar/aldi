//import kz.java.course.oop.modernman.Human;
import kz.java.course.oop.oldman.Human;

public class Main { //Различие println от println в \n который отсутствует в printf

    public static void main(String[] args) {
//        Human n = new Human("iPhone");
        Human n = new Human("Айдар", 183);
//        n.setName("Айдар"); // Устанавливаем значение для переменной - name
//        n.setAge(20);     // Устанавливаем значение для переменной - age
//        n.setHeight(183); // Устанавливаем значение для переменной - height
//        n.setWeight(75);  // Устанавливаем значение для переменной - weight
//        n.eat();
//        n.go();
//        n.speak();
//        n.hunt();
        n.showInfo();
//        n.call();
    }

}