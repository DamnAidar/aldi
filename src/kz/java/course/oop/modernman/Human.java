package kz.java.course.oop.modernman;

public class Human {
    private String phoneModel;

    public Human(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public void call(){
        System.out.println("Я звоню по телефону " + phoneModel);
    }

    public String getPhoneModel(){
        return phoneModel;
    }

    public String setPhoneModel(){
        this.phoneModel = phoneModel;
        return null;
    }
}
