package entidades;

/**
 * Pessoa
 */
public class Pessoa {

    private int id;
    private int idade;
    private String nome;
    private char sexo;
    public static int contadorPessoas = 0;

    public Pessoa() {
    }

    public Pessoa(int id, int idade, String nome, char sexo) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
