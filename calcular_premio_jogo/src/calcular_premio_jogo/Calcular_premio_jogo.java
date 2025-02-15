package calcular_premio_jogo;
import javax.swing.JOptionPane;
public class Calcular_premio_jogo {
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro colocado: ");
        int pontos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do primeiro colocado: "));
        String nome2 = JOptionPane.showInputDialog("Digite o nome do segundo colocado: ");
        int pontos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do segundo colocado: "));
        String nome3 = JOptionPane.showInputDialog("Digite o nome do terceiro colocado: ");
        int pontos3 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do terceiro colocado: "));
        
        if (pontos1 < 0 || pontos2 < 0 || pontos3 < 0) {
            JOptionPane.showMessageDialog(null, "Erro: Os pontos não podem ser negativos.");
        } else {
            double premioTotal = 500000.0;
            double premio1 = (pontos1 / (double) (pontos1 + pontos2 + pontos3)) * premioTotal;
            double premio2 = (pontos2 / (double) (pontos1 + pontos2 + pontos3)) * premioTotal;
            double premio3 = (pontos3 / (double) (pontos1 + pontos2 + pontos3)) * premioTotal;
            
            JOptionPane.showMessageDialog(null, "O prêmio de " + nome1 + " é: R$" + premio1 + 
                    "\nO prêmio de " + nome2 + " é: R$" + premio2 + 
                    "\nO prêmio de " + nome3 + " é: R$" + premio3);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        cadeia nome1, nome2, nome3
        inteiro pontos1, pontos2, pontos3
        real premio_total, premio1, premio2, premio3

        escreva("Digite o nome do primeiro colocado: ")
        leia(nome1)
        escreva("Digite os pontos do primeiro colocado: ")
        leia(pontos1)
        escreva("Digite o nome do segundo colocado: ")
        leia(nome2)
        escreva("Digite os pontos do segundo colocado: ")
        leia(pontos2)
        escreva("Digite o nome do terceiro colocado: ")
        leia(nome3)
        escreva("Digite os pontos do terceiro colocado: ")
        leia(pontos3)

        se (pontos1 < 0 ou pontos2 < 0 ou pontos3 < 0) {
            escreva("Erro: Os pontos não podem ser negativos.\n")
        } senao {
            premio_total = 500000.0
            premio1 = (pontos1 / (pontos1 + pontos2 + pontos3)) * premio_total
            premio2 = (pontos2 / (pontos1 + pontos2 + pontos3)) * premio_total
            premio3 = (pontos3 / (pontos1 + pontos2 + pontos3)) * premio_total

            escreva("O prêmio de ", nome1, " é: R$", premio1, "\n")
            escreva("O prêmio de ", nome2, " é: R$", premio2, "\n")
            escreva("O prêmio de ", nome3, " é: R$", premio3, "\n")
        }
    }
}
*/


// TESTE DE MESA
// NOME 1 / NOME 2 / NOME 3 / PONTOS 1 / PONTOS 2 / PONTOS 3 / PREMIO 1 / PREMIO 2 / PREMIO 3
// João / Maria / Carlos / 100 / 200 / 300 / 83333.33... / 166666.67... / 250000.0
// Joao / Maria / Carlos / 0 / 0 / 0 / 0 / 0 / 0
// João / Maria / Carlos / -1 / 0 / 0 / erro / erro / erro