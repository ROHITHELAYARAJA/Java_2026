public class message {
    static void main() {
        message1("hai");
    }
    static void  message1(String message){
        System.out.println(message+"1");
        message2(message);
    }
    static void  message2(String message){
        System.out.println(message+"2");
        message3(message);
    }   static void  message3(String message){
        System.out.println(message+"3");
        message4(message);
    }   static void  message4(String message){
        System.out.println(message+"4");
           message5(message);
     }   static void  message5(String message){
        System.out.println(message+"5");
    }
}
