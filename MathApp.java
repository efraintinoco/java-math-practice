public class MathApp {
  public static void main(String[] args) {

    int salary1 = 100000;
    int salary2 = 50000;
    System.out.println(Math.max(salary1, salary2));

    int carPrice = 50000;
    int truckPrice = 75000;
    System.out.println(Math.min(carPrice, truckPrice));

    double radius = 7.25;
    System.out.println(Math.PI * (radius * radius));

    double num1 = 5.0;
    System.out.println(Math.sqrt(num1));

    double x1 = 5;
    double x2 = 10;
    double y1 = 85;
    double y2 = 50;
    System.out.println(Math.hypot(x1 - x2, y1 - y2));

    double num2 = -3.8;
    System.out.println(Math.abs(num2));

    double randomNumber = Math.random();
    System.out.println(randomNumber);
  }
}
