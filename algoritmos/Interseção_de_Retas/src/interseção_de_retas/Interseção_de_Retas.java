package interseção_de_retas;
import javax.swing.JOptionPane;
public class Interseção_de_Retas {
    public static void main(String[] args) {
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente 'a1' da primeira reta: "));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente 'b1' da primeira reta: "));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente 'a2' da segunda reta: "));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente 'b2' da segunda reta: "));
        
        if (a1 == a2 && b1 == b2) {
            JOptionPane.showMessageDialog(null, "As retas são coincidentes ou paralelas.");
        } else if (a1 != a2) {
            double x = (b2 - b1) / (a1 - a2);
            double y = a1 * x + b1;
            
            JOptionPane.showMessageDialog(null, "O ponto de interseção é (" + x + ", " + y + ").");
        } else {
            JOptionPane.showMessageDialog(null, "As retas não se intersectam.");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real a1, b1, a2, b2, x, y

        escreva("Digite os coeficientes da primeira reta (a1, b1): ")
        leia(a1, b1)
        escreva("Digite os coeficientes da segunda reta (a2, b2): ")
        leia(a2, b2)

        se(a1 == a2 e b1 == b2) {
            escreva("As retas são coincidentes ou paralelas.")
            retorne
        }

        se(a1 != a2) {
            x = (b2 - b1) / (a1 - a2)
            y = a1 * x + b1
            escreva("O ponto de interseção é (", x, ", ", y, ").")
        } senao {
            escreva("As retas não se intersectam.")
        }
    }
}
*/


// TESTE DE MESA
// A1 / B1 / A2 / B2 / saida
// 1.0 / 2.0 / 2.0 / 3.0 / (-1.0, 1.0)
// 1.0 / 2.0 / 1.0 / 2.0 / Paralelas
// 1.0 / 2.0 / 1.0 / 1.0 / Nao se intersectam