package calcular_imposto_cpmf;
import javax.swing.JOptionPane;
public class Calcular_imposto_cpmf {
    public static void main(String[] args) {
        double valorCheque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cheque: "));
        
        if (valorCheque < 0) {
            JOptionPane.showMessageDialog(null, "Erro: O valor do cheque não pode ser negativo.");
        } else {
            double impostoCpmf = valorCheque * 0.0038;
            
            JOptionPane.showMessageDialog(null, "Valor a ser recolhido de CPMF: R$" + impostoCpmf);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real valor_cheque, imposto_cpmf

        escreva("Digite o valor do cheque: ")
        leia(valor_cheque)

        // Verificação de erro para valor negativo
        se (valor_cheque < 0) {
            escreva("Erro: O valor do cheque não pode ser negativo.\n")
        } senao {
            imposto_cpmf = valor_cheque * 0.0038
            escreva("Valor a ser recolhido de CPMF: R$", imposto_cpmf, "\n")
        }
    }
}
*/

// TESTE DE MESA
// VALOR CHEQUE / IMPOSTO CPMF
// 1000.00 / 3.80
// 2000.00 / 7.60
//  0.00 / 0.00
// -500.00 / Erro
