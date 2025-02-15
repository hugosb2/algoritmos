package calcular_volume_caixa_agua;
import javax.swing.JOptionPane;
public class Calcular_volume_caixa_agua {
public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da caixa d'água (em metros): "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da caixa d'água (em metros): "));
        
        if (raio < 0 || altura < 0) {
            JOptionPane.showMessageDialog(null, "Erro: O raio ou a altura não podem ser negativos.");
        } else {
            double volume = 3.14159 * raio * raio * altura;
            
            JOptionPane.showMessageDialog(null, "O volume da caixa d'água é: " + volume + " metros cúbicos");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real raio, altura, volume

        escreva("Digite o raio da caixa d'água (em metros): ")
        leia(raio)
        escreva("Digite a altura da caixa d'água (em metros): ")
        leia(altura)

        se (raio < 0 ou altura < 0) {
            escreva("Erro: O raio ou a altura não podem ser negativos.\n")
        } senao {
            volume = 3.14159 * raio * raio * altura
            escreva("O volume da caixa d'água é: ", volume, " metros cúbicos\n")
        }
    }
}
*/

// TESTE DE MESA
// RAIO / ALTURA / VOLUME
// 1.0 / 2.0 / 6.28318
// 0.0 / 2.0 / 0.0
// -1.0 / 2.0 / Erro
// 1.0 / -2.0 / Erro