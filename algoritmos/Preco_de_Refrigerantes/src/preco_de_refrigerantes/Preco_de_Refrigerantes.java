package preco_de_refrigerantes;
import javax.swing.JOptionPane;
public class Preco_de_Refrigerantes {
    public static void main(String[] args) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do refrigerante (1, 2 ou 3): "));
        char tipo = JOptionPane.showInputDialog("Digite o tipo (N para normal, D para diet): ").charAt(0);
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade (maior que 0): "));
        
        if (codigo < 1 || codigo > 3) {
            JOptionPane.showMessageDialog(null, "Código inválido. Deve ser 1, 2 ou 3.");
        } else if (tipo != 'N' && tipo != 'D') {
            JOptionPane.showMessageDialog(null, "Tipo inválido. Deve ser N ou D.");
        } else if (quantidade <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida. Deve ser maior que 0.");
        } else {
            double preco = 0;
            
            switch (codigo) {
                case 1:
                    if (tipo == 'N') {
                        preco = 1.50;
                    } else {
                        preco = 1.70;
                    }
                    break;
                case 2:
                    if (tipo == 'N') {
                        preco = 1.60;
                    } else {
                        preco = 1.70;
                    }
                    break;
                case 3:
                    if (tipo == 'N') {
                        preco = 1.40;
                    } else {
                        preco = 1.45;
                    }
                    break;
            }
            
            double total = preco * quantidade;
            
            if (total > 100) {
                double desconto = total * 0.05;
                total -= desconto;
            }
            
            JOptionPane.showMessageDialog(null, "O valor total da compra é: R$" + total);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro codigo, quantidade
        caracter tipo
        real preco, total, desconto

        escreva("Digite o código do refrigerante (1, 2 ou 3): ")
        leia(codigo)
        escreva("Digite o tipo (N para normal, D para diet): ")
        leia(tipo)
        escreva("Digite a quantidade (maior que 0): ")
        leia(quantidade)

        se(codigo < 1 ou codigo > 3) {
            escreva("Código inválido. Deve ser 1, 2 ou 3.")
            retorne
        }

        se(tipo != 'N' e tipo != 'D') {
            escreva("Tipo inválido. Deve ser N ou D.")
            retorne
        }

        se(quantidade <= 0) {
            escreva("Quantidade inválida. Deve ser maior que 0.")
            retorne
        }

        escolha(codigo) {
            caso 1:
                se(tipo == 'N') {
                    preco = 1.50
                } senao {
                    preco = 1.70
                }
                pare
            caso 2:
                se(tipo == 'N') {
                    preco = 1.60
                } senao {
                    preco = 1.70
                }
                pare
            caso 3:
                se(tipo == 'N') {
                    preco = 1.40
                } senao {
                    preco = 1.45
                }
                pare
        }

        total = preco * quantidade

        se(total > 100) {
            desconto = total * 0.05
            total = total - desconto
        }

        escreva("O valor total da compra é: R$", total)
    }
}
*/


// TESTE DE MESA
// CÓDIGO / TIPO / QUANTIDADE / PREÇO / TOTAL / DESCONTO
// 1 / N / 5 / 1.50 / 7.5 / 0
// 1 / D / 5 / 1.70 / 8.5 / 0
// 2 / N / 5 / 1.60 / 8 / 0
// 2 / D / 5 / 1.70 / 9 / 0
// 3 / N / 5 / 1.40 / 6.5 / 0