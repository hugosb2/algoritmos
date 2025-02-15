package calcular_salario_funcionario;
import javax.swing.JOptionPane;
public class Calcular_salario_funcionario {
    public static void main(String[] args) {
        int horasNormais, horasExtras;
        double salarioBruto, salarioLiquido;
        horasNormais = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas normais trabalhadas: "));
        horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas extras trabalhadas: "));
        
        if (horasNormais < 0 || horasExtras < 0) {
            JOptionPane.showMessageDialog(null, "Erro: As horas trabalhadas não podem ser negativas.");
        } else {
            salarioBruto = (horasNormais * 10) + (horasExtras * 15);
            salarioLiquido = salarioBruto * 0.9;
            
            JOptionPane.showMessageDialog(null, "Salário bruto: R$" + salarioBruto + 
                    "\nSalário líquido: R$" + salarioLiquido);
    }
    
    }
}

/*
programa {
    funcao inicio() {
        inteiro horas_normais, horas_extras
        real salario_bruto, salario_liquido

        escreva("Digite o número de horas normais trabalhadas: ")
        leia(horas_normais)
        escreva("Digite o número de horas extras trabalhadas: ")
        leia(horas_extras)

        se (horas_normais < 0 ou horas_extras < 0) {
            escreva("Erro: As horas trabalhadas não podem ser negativas.\n")
        } senao {
            salario_bruto = (horas_normais * 10) + (horas_extras * 15)
            salario_liquido = salario_bruto * 0.9

            escreva("Salário bruto: R$", salario_bruto, "\n")
            escreva("Salário líquido: R$", salario_liquido, "\n")
        }
    }
}
*/

// TESTE DE MESA
// HORAS NORMAIS / HORAS EXTRAS / SALARIO BRUTO / SALARIO LIQUIDO
// 10 / 15 / 325.0 / 292.5
// 0 / 0 / 0.00 / 0.00
// 10 / -15 / Erro