// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat my_cat = new Cat();
        my_cat.setAge(15);
        my_cat.setName("Рыжий");
        my_cat.hello();

        Rectangle four = new Rectangle(15, 15);
        System.out.println("15x15 Area = " + four.calculateArea());
        System.out.println("15x15 Perimeter = " + four.calculatePerimeter());
        four = new Rectangle();
        System.out.println("default Area = " + four.calculateArea());
        System.out.println("default Perimeter = " + four.calculatePerimeter());
    }
}
