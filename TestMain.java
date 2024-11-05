public class TestMain {
    public static void main(String[] args) {
        // Testa os construtores e toString()
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);  // toString()
        Rectangle r2 = new Rectangle();  // Construtor padrão
        System.out.println(r2);

        // Testa setters e getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);  // toString()
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // Testa getArea() e getPerimeter()
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}
