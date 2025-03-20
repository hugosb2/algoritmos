import javax.swing.JOptionPane;
public class advinharnumero {
    public static void main(String[] args) {
        int numero_secreto, tentativa, tentativas = 0;
        String s_numero_secreto, s_tentativa;

        s_numero_secreto = JOptionPane.showInputDialog("Digite o número secreto: ");
        numero_secreto = Integer.parseInt(s_numero_secreto);

        do {
            s_tentativa = JOptionPane.showInputDialog("Tente adivinhar o número: ");
            tentativa = Integer.parseInt(s_tentativa);
            tentativas++;

            if (tentativa > numero_secreto) {
                JOptionPane.showMessageDialog(null, "Seu número é maior do que o meu.");
            } else if (tentativa < numero_secreto) {
                JOptionPane.showMessageDialog(null, "Seu número é menor do que o meu.");
            }
        } while (tentativa != numero_secreto);

        JOptionPane.showMessageDialog(null, "Parabéns! Você acertou em " + tentativas + " tentativas.");
    }

/*TESTE DE MESA

Número secreto  |  Tentativa  |  Saída
       5        |      3      |   Seu número é menor do que o meu.   
       5        |      7      |   Seu número é maior do que o meu.
       5        |      5      |   Parabéns! Você acertou em 3 tentativas.    
 */
}

/*
programa {
    funcao inicio() {
        inteiro numero_secreto, tentativa, tentativas = 0

        escreva("Digite o número secreto: ")
        leia(numero_secreto)

        faca {
            escreva("Tente adivinhar o número: ")
            leia(tentativa)
            tentativas++

            se (tentativa > numero_secreto) {
                escreva("Seu número é maior do que o meu.\n")
            }
            senao se (tentativa < numero_secreto) {
                escreva("Seu número é menor do que o meu.\n")
            }
        } enquanto (tentativa != numero_secreto)

        escreva("Parabéns! Você acertou em ", tentativas, " tentativas.")
    }
}
*/