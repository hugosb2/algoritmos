package calcular_ingredientes_sanduiche;
import javax.swing.JOptionPane;
public class Calcular_ingredientes_sanduiche {
    public static void main(String[] args) {
        int quantidadeSanduiches;
        double queijo, presunto, carne;
        
        quantidadeSanduiches = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de sanduíches a fazer: "));
        
        if (quantidadeSanduiches < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de sanduíches não pode ser negativa.");
        } else {
            queijo = (quantidadeSanduiches * 2 * 50) / 1000.0;
            presunto = (quantidadeSanduiches * 1 * 50) / 1000.0;
            carne = (quantidadeSanduiches * 1 * 100) / 1000.0;
            
            JOptionPane.showMessageDialog(null, "Quantidade de queijo necessária: " + queijo + " kg" +
                    "\nQuantidade de presunto necessária: " + presunto + " kg" +
                    "\nQuantidade de carne necessária: " + carne + " kg");
        }
    }
}

/*programa {
    funcao inicio() {
        inteiro quantidade_sanduiches
        real queijo, presunto, carne

        escreva("Digite a quantidade de sanduíches a fazer: ")
        leia(quantidade_sanduiches)

        se (quantidade_sanduiches < 0) {
            escreva("Erro: A quantidade de sanduíches não pode ser negativa.\n")
        } senao {
            queijo = (quantidade_sanduiches * 2 * 50) / 1000.0
            presunto = (quantidade_sanduiches * 1 * 50) / 1000.0
            carne = (quantidade_sanduiches * 1 * 100) / 1000.0

            escreva("Quantidade de queijo necessária: ", queijo, " kg\n")
            escreva("Quantidade de presunto necessária: ", presunto, " kg\n")
            escreva("Quantidade de carne necessária: ", carne, " kg\n")
        }
    }
}*/


// TESTE DE MESA
// QUANTIDADE SANDUICHES / QUEIJO / PRESUNTO / CARNE
// 0 / 0 / 0 / 0
// -1 / Erro
// 2 / 0.2 / 0.1 / 0.2