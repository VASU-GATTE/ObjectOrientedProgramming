package LambdaOperations.InnerClasses;

public class PopCorn {
    public void taste(){
        System.out.println("spicy");
    }
}
//class Sweet extends PopCorn {
//    public void taste() {
//        System.out.println("Sweet");
//    }
//}
//class Test{
//    public static void main(String[] args) {                             //Normal usage of classes
//        PopCorn s=new Sweet();
//        s.taste();
//    }
//}
class Test{
    public static void main(String[] args) {
        PopCorn p=new PopCorn(){
            public void taste(){
                System.out.println("Sweet");
            }
        };
        p.taste();
    }
}