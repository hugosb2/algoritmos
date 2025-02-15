package aumento_de_salario;
import javax.swing.JOptionPane;
public class Aumento_de_Salario {
    public static void main(String[] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário (maior que 0): R$"));
        int codigoCargo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cargo (91, 92, 93): "));
        
        if (salario <= 0) {
            JOptionPane.showMessageDialog(null, "Salário inválido. Deve ser maior que 0.");
        } else {
            double novoSalario = 0;
            
            switch (codigoCargo) {
                case 91:
                    novoSalario = salario * 1.10;
                    break;
                case 92:
                    novoSalario = salario * 1.20;
                    break;
                case 93:
                    novoSalario = salario * 1.30;
                    break;
                default:
                    novoSalario = salario * 1.355;
                    break;
            }
            
            double diferenca = novoSalario - salario;
            
            JOptionPane.showMessageDialog(null, "Salário antigo: R$" + salario + 
                    "\nNovo salário: R$" + novoSalario + 
                    "\nDiferença: R$" + diferenca);
        }
    }  
}

/*
programa {
    funcao inicio() {
        real salario, novoSalario, diferenca
        inteiro codigoCargo

        escreva("Digite o salário do funcionário (maior que 0): R$")
        leia(salario)
        escreva("Digite o código do cargo (91, 92, 93): ")
        leia(codigoCargo)

        se(salario <= 0) {
            escreva("Salário inválido. Deve ser maior que 0.")
            retorne
        }

        escolha(codigoCargo) {
            caso 91: novoSalario = salario * 1.10
                pare
            caso 92: novoSalario = salario * 1.20
                pare
            caso 93: novoSalario = salario * 1.30
                pare
            padrao:
                novoSalario = salario * 1.355
        }

        diferenca = novoSalario - salario
        escreva("Salário antigo: R$", salario, "\nNovo salário: R$", novoSalario, "\nDiferença: R$", diferenca)
    }
}
*/


/*
TESTE DE MESA

SALARIO / CARGO / SALARIO < 0 / NOVO SALARIO / DIFERENCA
1000 / 91 / NAO / 1000 / 100
1000 / 92 / NAO / 1200 / 200
1000 / 93 / NAO / 1300 / 300
1000 / 94 / SIM / 1355 / 355.0
*/
