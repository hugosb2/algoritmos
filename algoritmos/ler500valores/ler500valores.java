import javax.swing.JOptionPane;

public class ler500valores {
    public static void main(String[] args) {
        int[] valores = new int[500];
        int i;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double soma = 0.0;

        for (i = 0; i < 500; i++) {
            String s_valores = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + ": ");
            valores[i] = Integer.parseInt(s_valores);
            
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
            
            soma += valores[i];
        }

        double media = soma / 500;
        JOptionPane.showMessageDialog(null, 
            "Maior valor: " + maior + "\n" +
            "Menor valor: " + menor + "\n" +
            "Média dos números: " + media);
    }
}

/*
TESTE DE MESA

Entrada / Maior Valor / Menor Valor / Média
5,5,5,5,5 / 5 / 5 / 0.05
1,2,3,4,5 / 5 / 1 / 0.03
 */

/*

PORTUGOL

programa {
    funcao inicio() {
        inteiro valores[500]
        inteiro i, maior, menor
        real soma = 0.0

        para (i = 0; i < 500; i++) {
            escreva("Digite o valor ", i + 1, ": ")
            leia(valores[i])
            se (i == 0) {
                maior = valores[i]
                menor = valores[i]
            }
            senao {
                se (valores[i] > maior) {
                    maior = valores[i]
                }
                se (valores[i] < menor) {
                    menor = valores[i]
                }
            }
            soma += valores[i]
        }

        real media = soma / 500
        escreva("Maior valor: ", maior, "\n")
        escreva("Menor valor: ", menor, "\n")
        escreva("Média dos números: ", media)
    }
}
*/