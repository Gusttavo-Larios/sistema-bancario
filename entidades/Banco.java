package entidades;

import java.util.ArrayList;

/**
 * Banco
 */
public class Banco {

    private int id;
    private ArrayList<Agencia> agencias = new ArrayList<>();
    private String nome;
    private int numero;
    public static int contadorBancos = 0;

    public Banco() {
    }

    public Banco(int id, ArrayList<Agencia> agencias, String nome, int numero) {
        this.agencias = agencias;
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Agencia> getAgencia() {
        return agencias;
    }

    public void setAgencia(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
