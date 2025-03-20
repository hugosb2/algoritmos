import javax.swing.JOptionPane;

public class numerosperfeitos {
    public static void main(String[] args) {
        int cont = 0, num;

        String s_num = JOptionPane.showInputDialog("Digite um número: ");
        num = Integer.parseInt(s_num);


        while (cont < 5) {
            int soma_divisores = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    soma_divisores += i;
                }
            }
            if (soma_divisores == num) {
                JOptionPane.showMessageDialog(null, num + " ");
                cont++;
            }
            num++;
        }

    }}

/**
 * teste de mesa
 * entrada | saída
 * 1       | 6 28 496 8128
 * 2       | 6 28 496 8128
 */
/*
programa {
    funcao inicio() {
        inteiro cont = 0, num = 2

        enquanto (cont < 5) {
            inteiro soma_divisores = 0
            para (inteiro i = 1; i < num; i++) {
                se (num % i == 0) {
                    soma_divisores += i
                }
            }
            se (soma_divisores == num) {
                escreva(num, " ")
                cont++
            }
            num++
        }
    }
}
*/