package calcular_ponto_eixo_x;
import javax.swing.JOptionPane;
public class Calcular_ponto_eixo_x {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente 'a' da reta (y = ax + b): "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente 'b' da reta (y = ax + b): "));
        
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Erro: O coeficiente 'a' não pode ser zero.");
        } else {
            double x = -b / a;
            
            JOptionPane.showMessageDialog(null, "O ponto onde a reta toca o eixo x é: (" + x + ", 0)");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real a, b, x

        escreva("Digite o coeficiente 'a' da reta (y = ax + b): ")
        leia(a)
        escreva("Digite o coeficiente 'b' da reta (y = ax + b): ")
        leia(b)

        se (a == 0) {
            escreva("Erro: O coeficiente 'a' não pode ser zero.\n")
        } senao {
            x = -b / a
            escreva("O ponto onde a reta toca o eixo x é: (", x, ", 0)\n")
        }
    }
}
*/

// TESTE DE MESA
// A / B / X
// 1.0 / 2.0 / -2.0
// 0.0 / 2.0 / Erro
// 1.0 / 0.0 / 0.0