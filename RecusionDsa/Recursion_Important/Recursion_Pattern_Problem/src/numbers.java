public class numbers {
    static void number3(int n) {  // condition by me normaly printing number 1 - 10
        if(n<=10){
            System.out.println(n);
            number3(n+1);
        }
    }

//    static void main() {
//        number3(1);
//    }
    }
    static void number1(int n) { // reverse printing
        if(n<=10){
            number1(n+1);
            System.out.println(n);
        }
    }

void main() {
    System.out.println();
    number1(1);

}
//    static void number2(int n) { // condition by kunal
//        if(n==10){
//            System.out.println(n);
//            return;
//        }
//        System.out.println(n);
//        number2(n+1);
//    }




