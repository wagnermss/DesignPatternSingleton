public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
        System.out.println("Ola eu sou aluno e me  chamo "+ getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}