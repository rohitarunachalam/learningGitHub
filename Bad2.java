public class Bad2 {
    public static void main(String[] args) {
        try{
          int a = 1331;
          int b = 0;
          System.out.println("Welcome to \nCS 1331!");
          int c = a / b;
          System.out.println("c is equal to: " + c);
        } catch (ArithmeticException e){
          System.out.println("c is undefined!");
        }
    }
}
