public class Rectangle {
    // Atributos de instância
    private float length = 1.0f;
    private float width = 1.0f;

    // Construtor padrão
    public Rectangle() {
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

    // Calcula a área
    public double getArea() {
        return length * width;
    }

    // Calcula o perímetro
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Sobrescreve o método toString
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
