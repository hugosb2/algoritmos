import javax.swing.JOptionPane;

public class numerosfibonacci {
    public static void main(String[] args) {
        int a = 1, b = 1, c;
        JOptionPane.showMessageDialog(null, a + " " + b + " ");

        for (int i = 3; i <= 15; i++) {
            c = a + b;
            JOptionPane.showMessageDialog(null,c + " ");
            a = b;
            b = c;
        }
    }
}

/*TESTE DE MESA
a = 1
b = 1
c = 0
i = 3
c = 1 + 1 = 2
a = 1*/

/*
programa {
    funcao inicio() {
        inteiro a = 1, b = 1, c
        escreva(a, " ", b, " ")

        para (inteiro i = 3; i <= 15; i++) {
            c = a + b
            escreva(c, " ")
            a = b
            b = c
        }
    }
}

*/