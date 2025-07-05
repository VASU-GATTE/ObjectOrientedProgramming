package Encapsulation;

public class Human {
    private String name;
    private String Password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return Password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

}

class Main{
    public void printDetails(Human h){
        System.out.println("Name : "+h.getName()+"\nPassword : "+h.getPassword());
    }
    public static void main(String[] args) {
        Human human1=new Human();
        human1.setName("Vasu");
        human1.setPassword("VasuGatte@");
        new Main().printDetails(human1);
    }
}
