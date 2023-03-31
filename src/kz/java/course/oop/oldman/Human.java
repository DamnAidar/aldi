package kz.java.course.oop.oldman;

public class Human { //class

    public Human(String name, int height){
        this.name  = name;                      //конструктор
        this.height  = height;
    }


    private int height;  // Переменная
    private int age;     // Переменная
    private int weight;  // Переменная
    private String name;   // Переменная

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age < 0) {
            System.out.println("age can`t be less than 0");
            return;
        }
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        if (weight < 0) {
            print("weight can`t be less than 0");
            return;
        }
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        if (height <= 0) {
            print("Height can`t be less than 0");
        return;    // аналог break
        }
        this.height = height;
    }

    // объявление методов различных действий
    public void go(){       //Метод
        if (weight > 0) print("Иду(Println)" + " мой вес " + weight + "кг");
    }
    public void eat(){      //Метод
        print("Ем(println) " + "My name is " + name); // Конкатенируем 2 строки и добавляем значение переменной Name которое указывается в классе Main
    }
     public void speak(){   //Метод
       if (height > 0) print("Говорю(Println)" + " Мой рост " + height + "см");
    }
    public void hunt(){    //Метод
        if (age >= 0) print("охочусь(Println)" + " И мне " + age + " Лет");
    }


    private void print(String  str){
        System.out.println(str);
    }

    public void showInfo(){
        print("******************************");
        print("Информация о человеке: \n" +"Имя: "+ name + "\n" + "рост: " + height);
        print("******************************");
    }

}
