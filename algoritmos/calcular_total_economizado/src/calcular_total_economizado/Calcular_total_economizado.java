package calcular_total_economizado;
import javax.swing.JOptionPane;
public class Calcular_total_economizado {
    public static void main(String[] args) {
        int moedas1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 1 centavo: "));
        int moedas5 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 5 centavos: "));
        int moedas10 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 10 centavos: "));
        int moedas25 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 25 centavos: "));
        int moedas50 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 50 centavos: "));
        int moedas1real = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 1 real: "));
        
        if (moedas1 < 0 || moedas5 < 0 || moedas10 < 0 || moedas25 < 0 || moedas50 < 0 || moedas1real < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de moedas não pode ser negativa.");
        } else {
            double totalReais = (moedas1 * 0.01) + (moedas5 * 0.05) + (moedas10 * 0.10) + (moedas25 * 0.25) + (moedas50 * 0.50) + (moedas1real * 1.0);
            
            JOptionPane.showMessageDialog(null, "Total economizado: R$" + totalReais);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro moedas_1, moedas_5, moedas_10, moedas_25, moedas_50, moedas_1real
        real total_reais

        escreva("Digite a quantidade de moedas de 1 centavo: ")
        leia(moedas_1)
        escreva("Digite a quantidade de moedas de 5 centavos: ")
        leia(moedas_5)
        escreva("Digite a quantidade de moedas de 10 centavos: ")
        leia(moedas_10)
        escreva("Digite a quantidade de moedas de 25 centavos: ")
        leia(moedas_25)
        escreva("Digite a quantidade de moedas de 50 centavos: ")
        leia(moedas_50)
        escreva("Digite a quantidade de moedas de 1 real: ")
        leia(moedas_1real)

        se (moedas_1 < 0 ou moedas_5 < 0 ou moedas_10 < 0 ou moedas_25 < 0 ou moedas_50 < 0 ou moedas_1real < 0) {
            escreva("Erro: A quantidade de moedas não pode ser negativa.\n")
        } senao {
            total_reais = (moedas_1 * 0.01) + (moedas_5 * 0.05) + (moedas_10 * 0.10) + (moedas_25 * 0.25) + (moedas_50 * 0.50) + (moedas_1real * 1.0)
            escreva("Total economizado: R$", total_reais, "\n")
        }
    }
}
*/

// TESTE DE MESA
// MOEDAS 1 / MOEDAS 5 / MOEDAS 10 / MOEDAS 25 / MOEDAS 50 / MOEDAS 1REAL / TOTAL REAIS
// 0 / 0 / 0 / 0 / 0 / 0 / 0.0
// 1 / 2 / 3 / 4 / 5 / 6 / 9.91
// -1 / Erro