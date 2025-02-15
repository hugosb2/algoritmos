package caracteristica_do_numero;
import javax.swing.JOptionPane;
public class Caracteristica_do_Numero {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 4 dígitos (entre 1000 e 9999): "));
        
        if (numero < 1000 || numero > 9999) {
            JOptionPane.showMessageDialog(null, "Número inválido. Deve ser um número de 4 dígitos.");
        } else {
            int parte1 = numero / 100;
            int parte2 = numero % 100;
            
            if ((parte1 + parte2) * (parte1 + parte2) == numero) {
                JOptionPane.showMessageDialog(null, numero + " satisfaz a característica.");
            } else {
                JOptionPane.showMessageDialog(null, numero + " não satisfaz a característica.");
            }
        }
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro numero, parte1, parte2

        escreva("Digite um número de 4 dígitos (entre 1000 e 9999): ")
        leia(numero)

        se(numero < 1000 ou numero > 9999) {
            escreva("Número inválido. Deve ser um número de 4 dígitos.")
            retorne
        }

        parte1 = numero / 100
        parte2 = numero % 100

        se((parte1 + parte2) ** 2 == numero) {
            escreva(numero, " satisfaz a característica.")
        } senao {
            escreva(numero, " não satisfaz a característica.")
        }
    }
}
*/

// TESTE DE MESA
// NUMERO / INVALIDO / SATISFAZ / NAO SATISFAZ
// 1234 / -- / -- / NAO
// 1235 / -- / -- / NAO
// 0000 / SIM / -- / --
// 2025/ -- / sim / --