package firstProject;

public class MainAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNome("João");
        a.setIdade(18);

        System.out.println("Nome: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
    }
}
