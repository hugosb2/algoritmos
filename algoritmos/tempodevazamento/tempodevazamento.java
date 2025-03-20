import javax.swing.JOptionPane;

public class tempodevazamento {
    public static void main(String[] args) {
        double garrafao;
        String s_garrafao = JOptionPane.showInputDialog("Digite a quantidade de água no garrafão (em ml): ");
        garrafao = Double.parseDouble(s_garrafao);
        double vazamento;
        String s_vazamento = JOptionPane.showInputDialog("Digite a quantidade de água que vaza por minuto (em ml): ");
        vazamento = Double.parseDouble(s_vazamento);
        double horas;
        String s_horas = JOptionPane.showInputDialog("Digite a quantidade de horas que se passaram: ");
        horas = Double.parseDouble(s_horas);

        while (garrafao > 0) {
            garrafao -= vazamento;
            horas += 0.5;
        }

        JOptionPane.showMessageDialog(null, "O garrafão estará vazio em " + horas + " horas.");
    }
}

/**
 * TESTE DE MESA
 * agua | vazamento | horas | saída - horas
 * 20000| 50        | 0.5   | 1999.5h
 */

/*
programa {
    funcao inicio() {
        real garrafao = 20000.0
        real vazamento = 50.0
        real horas = 0.0

        enquanto (garrafao > 0) {
            garrafao -= vazamento
            horas += 0.5
        }

        escreva("O garrafão estará vazio em ", horas, " horas.")
    }
}
*/