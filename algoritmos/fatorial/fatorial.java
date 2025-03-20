import javax.swing.JOptionPane;
public class fatorial{
    public static void main(String[] args) {
        int N, i, fatorial = 1;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if (N<0) {
            JOptionPane.showMessageDialog(null, "Número inválido");
        } else if (N == 0) {
            JOptionPane.showMessageDialog(null, "O fatorial de 0 é: 1");
        } else {
            for (i = 1; i <= N; i++) {
                fatorial *= i;
            }
        JOptionPane.showMessageDialog(null, "O fatorial de " + N + " é: " + fatorial);
        }
        
    }
}

/*
TESTE DE MESA

Entrada / Saída
5 / 120
0 / 1
-2 / Número inválido

*/

/*
programa {
    funcao inicio() {
        inteiro N, i, fatorial = 1

        escreva("Digite um número inteiro: ")
        leia(N)

        se (N < 0) {
            escreva("Número inválido")
            retorne
        } senao se (N == 0) {
            escreva("O fatorial de 0 é: 1")
            retorne
        } senao {

        para (i = 1; i <= N; i++) {
            fatorial *= i
        }
        
        }

        escreva("O fatorial de ", N, " é: ", fatorial)
    }
}
 */