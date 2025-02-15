package ponto_na_reta_generica;
import javax.swing.JOptionPane;
public class Ponto_na_Reta_Generica {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente 'a' da reta: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente 'b' da reta: "));
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do ponto: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do ponto: "));
        
        if (a == 0 && b == 0) {
            JOptionPane.showMessageDialog(null, "Coeficientes inválidos. A reta não pode ser definida.");
        } else if (a * x + b * y == 3) {
            JOptionPane.showMessageDialog(null, "O ponto pertence à reta " + a + "x + " + b + "y = 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto não pertence à reta " + a + "x + " + b + "y = 3.");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real x, y, a, b

        escreva("Digite os coeficientes da reta (a, b): ")
        leia(a, b)
        escreva("Digite as coordenadas do ponto (x, y): ")
        leia(x, y)

        se(a == 0 e b == 0) {
            escreva("Coeficientes inválidos. A reta não pode ser definida.")
            retorne
        }

        se(a * x + b * y == 3) {
            escreva("O ponto pertence à reta ", a, "x + ", b, "y = 3.")
        } senao {
            escreva("O ponto não pertence à reta ", a, "x + ", b, "y = 3.")
        }
    }
}
*/


// TESTE DE MESA
// A / B / X / Y
// 0.0 / 0.0 / 1.0 / 2.0 / Coeficientes inválidos.
// 1.0 / 2.0 / 1.0 / 2.0 / O ponto pertence à reta 1.0x + 2.0y = 3.
// 1.0 / 2.0 / 2.0 / 1.0 / O ponto não pertence à reta 1.0x + 2.0y = 3.
