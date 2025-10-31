public class Main {
    public static void main(String[] args) {
        Avaliacao a = new Avaliacao();

        a.setNome("Maria");
        a.setNota1(8.5);
        a.setNota2(9.0);

        System.out.println("Aluno: " + a.getNome());
        System.out.println("Média: " + a.calcularMedia());
    }
}
