package credito_especial;
import javax.swing.JOptionPane;
public class Credito_especial {
    public static void main(String[] args) {
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo médio do cliente (maior ou igual a 0): R$"));
        
        if (saldoMedio < 0) {
            JOptionPane.showMessageDialog(null, "Saldo médio inválido. Deve ser maior ou igual a 0.");
        } else {
            double credito = 0;
            
            if (saldoMedio <= 200) {
                credito = 0;
            } else if (saldoMedio <= 1000) {
                credito = saldoMedio * 0.20;
            } else if (saldoMedio <= 2000) {
                credito = saldoMedio * 0.30;
            } else {
                credito = saldoMedio * 0.40;
            }
            
            JOptionPane.showMessageDialog(null, "Saldo médio: R$" + saldoMedio + "\nCrédito: R$" + credito);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        real saldoMedio, credito

        escreva("Digite o saldo médio do cliente (maior ou igual a 0): R$")
        leia(saldoMedio)

        se(saldoMedio < 0) {
            escreva("Saldo médio inválido. Deve ser maior ou igual a 0.")
            retorne
        }

        se(saldoMedio <= 200) {
            credito = 0
        } senao se(saldoMedio <= 1000) {
            credito = saldoMedio * 0.20
        } senao se(saldoMedio <= 2000) {
            credito = saldoMedio * 0.30
        } senao {
            credito = saldoMedio * 0.40
        }

        escreva("Saldo médio: R$", saldoMedio, "\nCrédito: R$", credito)
    }
}
*/


// TESTE DE MESA
// SALDO MEDIO / CREDITO
// 1000.00 / 200.00
// 500.00 / 100.00
// 1500.00 / 300.00
// 2500.00 / 500.00
// -100.00 / Erro
