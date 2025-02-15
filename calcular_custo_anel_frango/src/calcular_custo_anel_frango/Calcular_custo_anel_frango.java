package calcular_custo_anel_frango;
import javax.swing.JOptionPane;
public class Calcular_custo_anel_frango {
    public static void main(String[] args) {
        int quantidadeFrangos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de frangos: "));
        
        if (quantidadeFrangos < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de frangos não pode ser negativa.");
        } else {
            double custoTotal = (quantidadeFrangos * 4) + (quantidadeFrangos * 2 * 3.5);
            
            JOptionPane.showMessageDialog(null, "O gasto total da granja é: R$" + custoTotal);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro quantidade_frangos
        real custo_total

        escreva("Digite a quantidade de frangos: ")
        leia(quantidade_frangos)

        se (quantidade_frangos < 0) {
            escreva("Erro: A quantidade de frangos não pode ser negativa.\n")
        } senao {
            custo_total = (quantidade_frangos * 4) + (quantidade_frangos * 2 * 3.5)
            escreva("O gasto total da granja é: R$", custo_total, "\n")
        }
    }
}
*/

// TESTE DE MESA
// QUANTIDADE FRANGOS / CUSTO TOTAL
// 5 / 47.5
// 0 / 0
// -1 / Erro