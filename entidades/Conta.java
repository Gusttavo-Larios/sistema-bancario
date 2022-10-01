package entidades;

import java.util.ArrayList;

/**
 * Conta
 */
public class Conta {

    private int idConta;
    private String numero;
    private Agencia agencia;
    private ArrayList<Transacao> transacoes = new ArrayList<>();
    private Pessoa pessoa;
    private double saldo;
    private double limite;
    public static int contadorBancos = 0;

    public Conta() {
    }

    public Conta(int idConta, String numero, Agencia agencia, ArrayList<Transacao> transacoes, Pessoa pessoa,
            double limite) {
        this.idConta = idConta;
        this.numero = numero;
        this.agencia = agencia;
        this.transacoes = transacoes;
        this.pessoa = pessoa;
        this.limite = limite;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNumero() {
        return numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar() {

    }

    public void sacar() {

    }

    public void transferir() {

    }
}
