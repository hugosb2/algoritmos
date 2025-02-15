package calcular_total_litros_refrigerante;
import javax.swing.JOptionPane;
public class Calcular_total_litros_refrigerante {
public static void main(String[] args) {
        int latas, garrafas600, garrafas2l;
        double totalLitros;
        latas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de latas de 350 ml: "));
        garrafas600 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de garrafas de 600 ml: "));
        garrafas2l = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de garrafas de 2 litros: "));
        
        if (latas < 0 || garrafas600 < 0 || garrafas2l < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de embalagens não pode ser negativa.");
        } else {
            totalLitros = (latas * 0.350) + (garrafas600 * 0.600) + (garrafas2l * 2.0);
            
            JOptionPane.showMessageDialog(null, "Total de litros de refrigerante comprados: " + totalLitros + " litros");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro latas, garrafas_600, garrafas_2l
        real total_litros

        escreva("Digite a quantidade de latas de 350 ml: ")
        leia(latas)
        escreva("Digite a quantidade de garrafas de 600 ml: ")
        leia(garrafas_600)
        escreva("Digite a quantidade de garrafas de 2 litros: ")
        leia(garrafas_2l)

        se (latas < 0 ou garrafas_600 < 0 ou garrafas_2l < 0) {
            escreva("Erro: A quantidade de embalagens não pode ser negativa.\n")
        } senao {
            total_litros = (latas * 0.350) + (garrafas_600 * 0.600) + (garrafas_2l * 2.0)
            escreva("Total de litros de refrigerante comprados: ", total_litros, " litros\n")
        }
    }
}
*/

// TESTE DE MESA
// LATAS / GARRAFAS 600 ML / GARRAFAS 2L / TOTAL DE LITROS
// 1 / 2 / 3 / 7.55
// 0 / 0 / 0 / 0
// -1 / -1 / -1 / Erro
