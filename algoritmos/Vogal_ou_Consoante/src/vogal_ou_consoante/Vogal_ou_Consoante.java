package vogal_ou_consoante;
import javax.swing.JOptionPane;
public class Vogal_ou_Consoante {
    public static void main(String[] args) {
        char letra = JOptionPane.showInputDialog("Digite uma letra maiúscula: ").charAt(0);
        
        if (letra < 'A' || letra > 'Z') {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Deve ser uma letra maiúscula.");
        } else {
            switch (letra) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    JOptionPane.showMessageDialog(null, "Vogal");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Consoante");
                    break;
            }
        }
    }
    
}

/*
programa {
    funcao inicio() {
        caracter letra

        escreva("Digite uma letra maiúscula: ")
        leia(letra)

        // Verificação de entrada válida
        se(letra < 'A' ou letra > 'Z') {
            escreva("Entrada inválida. Deve ser uma letra maiúscula.")
            retorne
        }

        escolha(letra) {
            caso 'A':
            caso 'E':
            caso 'I':
            caso 'O':
            caso 'U':
                escreva("Vogal")
                pare
            padrao:
                escreva("Consoante")
        }
    }
}
*/


// TESTE DE MESA
// LETRA / INVALIDA / VOGAL / CONSOANTE
// A / -- / VOGAL / --
// E / -- / VOGAL / --
// I / -- / VOGAL / --
// O / -- / VOGAL / --
// U / -- / VOGAL / --
// B / -- / -- / CONSOANTE
// C / -- / -- / CONSOANTE
// 5 / Entrada inválida. Deve ser uma letra maiúscula. / -- / --