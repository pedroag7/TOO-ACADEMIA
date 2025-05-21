package modelo;
import java.text.DecimalFormat;
import java.util.*;
public class Plano implements Exibivel {
    private String nome;
    private String descricao;
    private double valor;
    DecimalFormat df = new DecimalFormat("#,##0.00");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String exibirDados() {
        String aux = "Dados do Plano:\n";
        aux += "Nome: " + nome + "\n";
        aux += "Descricao: " + descricao + "\n";
        aux += "Valor: " + df.format(valor) + "\n";
        return aux;

    }
}