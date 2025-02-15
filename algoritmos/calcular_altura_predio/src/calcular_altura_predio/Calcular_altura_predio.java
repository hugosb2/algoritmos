package calcular_altura_predio;
import javax.swing.JOptionPane;
public class Calcular_altura_predio {
    public static void main(String[] args) {
        double alturaPessoa, sombraPessoa, sombraPredio;
        alturaPessoa = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (em metros): "));
        sombraPessoa = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da sua sombra (em metros): "));
        sombraPredio = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da sombra do prédio (em metros): "));
        
        if (alturaPessoa < 0 || sombraPessoa < 0 || sombraPredio < 0) {
            JOptionPane.showMessageDialog(null, "Erro: Valores de altura ou sombra não podem ser negativos.");
        } else {
            double alturaPredio = (alturaPessoa * sombraPredio) / sombraPessoa;
            
            JOptionPane.showMessageDialog(null, "A altura do prédio é: " + alturaPredio + " metros");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real altura_pessoa, sombra_pessoa, sombra_predio, altura_predio

        escreva("Digite sua altura (em metros): ")
        leia(altura_pessoa)
        escreva("Digite o comprimento da sua sombra (em metros): ")
        leia(sombra_pessoa)
        escreva("Digite o comprimento da sombra do prédio (em metros): ")
        leia(sombra_predio)

        se (altura_pessoa < 0 ou sombra_pessoa < 0 ou sombra_predio < 0) {
            escreva("Erro: Valores de altura ou sombra não podem ser negativos.\n")
        } senao {
            altura_predio = (altura_pessoa * sombra_predio) / sombra_pessoa
            escreva("A altura do prédio é: ", altura_predio, " metros\n")
        }
    }
}
*/


/*
 * TESTE DE MESA
 * ALTURA PESSOA /SOMBRA PESSOA / SOMBRA PREDIO / ALTURA PREDIO
 * 1.80 / 0.50 / 1.50 / 3.00
 * 1.50 / 0.50 / 1.50 / 2.25
 * -1.50 / 0.50 / 1.50 / Erro
 */