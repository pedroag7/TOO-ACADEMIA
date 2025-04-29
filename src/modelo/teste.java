package modelo;
import javax.swing.*;
import java.util.*;

public class teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(" ", " ");

        p.setNome("Pedro");
        System.out.println(p.getNome());
        //JOptionPane.showMessageDialog(null, p.nome);
    }
}
