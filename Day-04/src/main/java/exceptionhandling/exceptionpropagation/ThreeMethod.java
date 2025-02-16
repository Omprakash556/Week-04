package exceptionhandling.exceptionpropagation;

public class ThreeMethod {
    public static void method1(){
        System.out.println(10/0);
    }
    public static void method2(){
        method1();
    }
    public static void method3(){
        method2();
    }
    public static void main(String[] args) {

        try {
            method3();
        }catch (ArithmeticException e){
            System.out.println("Handled exception in main"+e.getMessage());
        }
    }
}
