package modelo;
import javax.swing.*;
import java.time.LocalDate;
import java.util.*;

public class teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(" ", " ");

        p.setNome("Pedro");
        //system.out.println(p.getNome());
        //JOptionPane.showMessageDialog(null, p.nome);

        Pessoa p1 = new Pessoa("Juka", "9999999");
        p1.setDataNascimento(LocalDate.of(1990, 1, 1));

        AvaliacaoFisica a1 = new AvaliacaoFisica(p1);
        AvaliacaoFisica a2 = new AvaliacaoFisica(p1);
        a1.setAltura(1.80);
        a1.setPeso(75.9);
        a2.setAltura(1.80);
        a2.setPeso(72);

        p1.adicionaAvaliacao(a1);
        p1.adicionaAvaliacao(a2);
        a1.setImc(a1.CalcularImc(a1.getPeso(), a1.getAltura()));

        System.out.println(p1.exibirDados());
        a1.exibirDados();


    }
}
