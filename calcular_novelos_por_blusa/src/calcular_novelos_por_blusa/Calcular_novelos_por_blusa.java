package calcular_novelos_por_blusa;
import javax.swing.JOptionPane;
public class Calcular_novelos_por_blusa {
public static void main(String[] args) {
        int quantidadeBlusas;
        double quantidadeNovelosTotal, novelosPorBlusa;
        quantidadeBlusas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de blusas produzidas: "));
        quantidadeNovelosTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade total de novelos gastos: "));
        
        if (quantidadeBlusas < 0 || quantidadeNovelosTotal < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de blusas ou novelos não pode ser negativa.");
        } else {
            novelosPorBlusa = quantidadeNovelosTotal / quantidadeBlusas;
            
            JOptionPane.showMessageDialog(null, "A quantidade de novelos gastos por blusa é: " + novelosPorBlusa);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro quantidade_blusas
        real quantidade_novelos_total, novelos_por_blusa

        escreva("Digite a quantidade de blusas produzidas: ")
        leia(quantidade_blusas)
        escreva("Digite a quantidade total de novelos gastos: ")
        leia(quantidade_novelos_total)

        se (quantidade_blusas < 0 ou quantidade_novelos_total < 0) {
            escreva("Erro: A quantidade de blusas ou novelos não pode ser negativa.\n")
        } senao {
            novelos_por_blusa = quantidade_novelos_total / quantidade_blusas
            escreva("A quantidade de novelos gastos por blusa é: ", novelos_por_blusa, "\n")
        }
    }
}
*/

// TESTE DE MESA
// QUANTIDADE BLUSAS / QUANTIDADE NOVELOS TOTAL / NOVELOS POR BLUSA
// 5 / 50.0 / 10.0
// 0 / 0.0 / 0.0
// -1 / Erro