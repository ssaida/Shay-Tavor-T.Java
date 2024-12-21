public class Tester{
  public static void main(String[] args){
	  scanner in = new Scanner(System.in);
	Circle c1 = new Circle();
    Circle c2 = new Circle(3, 1, 1);
    System.out.println(c1);
    c1.setRadius(10);
    c1.setCenterX(15);
    c1.setCenterY(9);
    System.out.println(c2.area());
    System.out.println(c2.perameter());
    System.out.println(c1.toString());
  }
}
