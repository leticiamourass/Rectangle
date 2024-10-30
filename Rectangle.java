public class Rectangle {
    // Atributos privados
    private float length;
    private float width;

    // Construtor padrão
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    // Construtor com parâmetros
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter para length
    public float getLength() {
        return length;
    }

    // Setter para length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter para width
    public float getWidth() {
        return width;
    }

    // Setter para width
    public void setWidth(float width) {
        this.width = width;
    }

    // Método para calcular a área
    public double getArea() {
        return length * width;
    }

    // Método para calcular o perímetro
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Método toString para exibir as informações do retângulo
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
