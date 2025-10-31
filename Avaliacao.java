public class Avaliacao {
    private String nome;
    private double nota1;
    private double nota2;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String getNome() {
        return nome;
    }
}
