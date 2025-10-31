package firstProject;

public class MainCarro {
    public static void main(String[] args) {
        Carro c = new Carro();

        c.setModelo("Ferrari F8");
        c.setAno(2023);

        c.acelerar(50);
        System.out.println("Velocidade atual: " + c.getVelocidadeAtual());

        c.frear(30);
        System.out.println("Velocidade atual: " + c.getVelocidadeAtual());
    }
}
