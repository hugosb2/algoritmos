package calcular_pagamento_conta;
import javax.swing.JOptionPane;
public class Calcular_pagamento_conta {
    public static void main(String[] args) {
        double valorConta, valorFelipe;
        int valorCarlos, valorAndre;
        
        valorConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da conta: "));
        
        if (valorConta < 0) {
            JOptionPane.showMessageDialog(null, "Erro: O valor da conta não pode ser negativo.");
        } else {
            valorCarlos = (int) (valorConta / 3);
            valorAndre = valorCarlos;
            valorFelipe = valorConta - (valorCarlos * 2);
            
            JOptionPane.showMessageDialog(null, "Carlos deve pagar: R$" + valorCarlos + 
                    "\nAndré deve pagar: R$" + valorAndre + 
                    "\nFelipe deve pagar: R$" + valorFelipe);
    }
    
    }
}

/*
programa {
    funcao inicio() {
        real valorconta, valorfelipe
        inteiro valorcarlos, valorandre

        escreva("Digite o valor total da conta: ")
        leia(valorconta)

        se (valorconta < 0) {
            escreva("Erro: O valor da conta não pode ser negativo.\n")
        } senao {
            
            valorcarlos = valorconta / 3
            valorandre = valorcarlos

            
            valorfelipe = valorconta - (valorcarlos * 2)

            
            escreva("Carlos deve pagar: R$", valorcarlos, "\n")
            escreva("André deve pagar: R$", valorandre, "\n")
            escreva("Felipe deve pagar: R$", valorfelipe, "\n")
        }
    }
}
*/

// TESTE DE MESA
// VALOR CONTA / VALOR CARLOS / VALOR ANDRE / VALOR FELIPE
// 100.00 / 33.33 / 33.33 / 34.0
// 0.00 / 0.00 / 0.00 / 0.00
// -50.00 / Erro
