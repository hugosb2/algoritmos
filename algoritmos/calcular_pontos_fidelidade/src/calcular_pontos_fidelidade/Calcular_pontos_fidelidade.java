package calcular_pontos_fidelidade;
import javax.swing.JOptionPane;
public class Calcular_pontos_fidelidade {
    public static void main(String[] args) {
        double compra1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira compra: "));
        double compra2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda compra: "));
        double compra3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da terceira compra: "));
        double compra4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quarta compra: "));
        
        if (compra1 < 0 || compra2 < 0 || compra3 < 0 || compra4 < 0) {
            JOptionPane.showMessageDialog(null, "Erro: Os valores das compras não podem ser negativos.");
        } else {
            double totalPontos = (compra1 + compra2 + compra3 + compra4) / 5.0;
            
            JOptionPane.showMessageDialog(null, "Total de pontos acumulados: " + totalPontos);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real compra1, compra2, compra3, compra4, total_pontos

        escreva("Digite o valor da primeira compra: ")
        leia(compra1)
        escreva("Digite o valor da segunda compra: ")
        leia(compra2)
        escreva("Digite o valor da terceira compra: ")
        leia(compra3)
        escreva("Digite o valor da quarta compra: ")
        leia(compra4)

        se (compra1 < 0 ou compra2 < 0 ou compra3 < 0 ou compra4 < 0) {
            escreva("Erro: Os valores das compras não podem ser negativos.\n")
        } senao {
            total_pontos = (compra1 + compra2 + compra3 + compra4) / 5.0
            escreva("Total de pontos acumulados: ", total_pontos, "\n")
        }
    }
}
*/


// TESTE DE MESA
// PRIMEIRA COMPRA / SEGUNDA COMPRA / TERCEIRA COMPRA / QUARTA COMPRA / TOTAL PONTOS
// 100.0 / 200.0 / 300.0 / 400.0 / 200.0
// 0.0 / 0.0 / 0.0 / 0.0 / 0.0
// -1.0 / Erro