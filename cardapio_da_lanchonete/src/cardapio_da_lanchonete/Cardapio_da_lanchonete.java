package cardapio_da_lanchonete;
import javax.swing.JOptionPane;
public class Cardapio_da_lanchonete {
    public static void main(String[] args) {
        int codigoSanduiche = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do sanduíche (100, 101, 102, 103): "));
        int codigoBebida = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da bebida (201, 202, 203): "));
        
        double precoSanduiche = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do sanduíche: "));
        double precoBebida = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da bebida: "));
        
        switch (codigoSanduiche) {
            case 100:
                precoSanduiche = 1.20;
                break;
            case 101:
                precoSanduiche = 1.30;
                break;
            case 102:
                precoSanduiche = 1.50;
                break;
            case 103:
                precoSanduiche = 1.20;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código de sanduíche inválido.");
                return;
        }
        
        switch (codigoBebida) {
            case 201:
                precoBebida = 1.00;
                break;
            case 202:
                precoBebida = 1.50;
                break;
            case 203:
                precoBebida = 0.70;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código de bebida inválido.");
                return;
        }
        
        double total = precoSanduiche + precoBebida;
        
        JOptionPane.showMessageDialog(null, "O valor a pagar é: R$" + total);
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro codigoSanduiche, codigoBebida
        real precoSanduiche, precoBebida, total

        escreva("Digite o código do sanduíche (100, 101, 102, 103): ")
        leia(codigoSanduiche)
        escreva("Digite o código da bebida (201, 202, 203): ")
        leia(codigoBebida)

        escolha(codigoSanduiche) {
            caso 100: precoSanduiche = 1.20
                pare
            caso 101: precoSanduiche = 1.30
                pare
            caso 102: precoSanduiche = 1.50
                pare
            caso 103: precoSanduiche = 1.20
                pare
            padrao:
                escreva("Código de sanduíche inválido.")
                retorne
        }

        escolha(codigoBebida) {
            caso 201: precoBebida = 1.00
                pare
            caso 202: precoBebida = 1.50
                pare
            caso 203: precoBebida = 0.70
                pare
            padrao:
                escreva("Código de bebida inválido.")
                retorne
        }

        total = precoSanduiche + precoBebida
        escreva("O valor a pagar é: R$", total)
    }
}
*/


// TESTE DE MESA
// CÓDIGO SANDUICHE / CÓDIGO BEBIDA / PREÇO SANDUICHE / PREÇO BEBIDA / TOTAL
// 100 / 201 / 1.20 / 1.00 / 2.20
// 101 / 202 / 1.30 / 1.50 / 2.80
// 102 / 203 / 1.50 / 0.70 / 2.20
