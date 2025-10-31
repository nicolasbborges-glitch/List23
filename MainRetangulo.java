package firstProject;

public class MainRetangulo {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setAltura(5);
        r.setLargura(8);

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}
