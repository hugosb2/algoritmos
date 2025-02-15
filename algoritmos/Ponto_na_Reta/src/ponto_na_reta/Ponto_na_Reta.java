package ponto_na_reta;
import javax.swing.JOptionPane;
public class Ponto_na_Reta {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do ponto: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do ponto: "));
        
        if (2 * x + y == 3) {
            JOptionPane.showMessageDialog(null, "O ponto pertence à reta 2x + y = 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto não pertence à reta 2x + y = 3.");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real x, y

        escreva("Digite as coordenadas do ponto (x, y): ")
        leia(x, y)

        se(2 * x + y == 3) {
            escreva("O ponto pertence à reta 2x + y = 3.")
        } senao {
            escreva("O ponto não pertence à reta 2x + y = 3.")
        }
    }
}
*/


// TESTE DE MESA
// X / Y / RESULTADO
// 1.0 / 2.0 / O ponto pertence à reta 2x + y = 3.
// 2.0 / 3.0 / O ponto pertence à reta 2x + y = 3.
// 1.0 / 3.0 / O ponto não pertence à reta 2x + y = 3.
// 2.0 / 2.0 / O ponto pertence à reta 2x + y = 3.
