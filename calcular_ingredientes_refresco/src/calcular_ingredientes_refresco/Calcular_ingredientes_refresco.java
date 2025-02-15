package calcular_ingredientes_refresco;
import javax.swing.JOptionPane;
public class Calcular_ingredientes_refresco {
public static void main(String[] args) {
        double litrosRefresco = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros de refresco desejada: "));
        
        if (litrosRefresco < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de refresco não pode ser negativa.");
        } else {
            double litrosAgua = litrosRefresco * 0.8;
            double litrosSuco = litrosRefresco * 0.2;
            
            JOptionPane.showMessageDialog(null, "Serão necessários " + litrosAgua + " litros de água e " + litrosSuco + " litros de suco.");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real litros_refresco, litros_agua, litros_suco

        escreva("Digite a quantidade de litros de refresco desejada: ")
        leia(litros_refresco)

        se (litros_refresco < 0) {
            escreva("Erro: A quantidade de refresco não pode ser negativa.\n")
        } senao {
            litros_agua = litros_refresco * 0.8
            litros_suco = litros_refresco * 0.2
            escreva("Serão necessários ", litros_agua, " litros de água e ", litros_suco, " litros de suco.\n")
        }
    }
}
*/

// TESTE DE MESA
// LITROS REFRESCO / LITROS AGUA / LITROS SUCO
// 2.0 / 1.6 / 0.4
// 0.0 / 0.0 / 0.0
// -1.0 / Erro