package media_de_aproveitamento;
import javax.swing.JOptionPane;
public class Media_de_Aproveitamento {
    public static void main(String[] args) {
       int numeroIdentificacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de identificação do aluno: "));
        double V1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno (entre 0 e 10): "));
        double V2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno (entre 0 e 10): "));
        double V3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno (entre 0 e 10): "));
        double ME = Double.parseDouble(JOptionPane.showInputDialog("Digite a média dos exercícios (entre 0 e 10): "));
        
        if (V1 < 0 || V1 > 10 || V2 < 0 || V2 > 10 || V3 < 0 || V3 > 10 || ME < 0 || ME > 10) {
            JOptionPane.showMessageDialog(null, "Notas e média dos exercícios devem estar entre 0 e 10.");
        } else {
            double MA = (V1 + 2 * V2 + 3 * V3 + ME) / 7;
            char conceito;
            
            if (MA >= 9.0) {
                conceito = 'A';
            } else if (MA >= 7.5) {
                conceito = 'B';
            } else if (MA >= 6.0) {
                conceito = 'C';
            } else if (MA >= 4.0) {
                conceito = 'D';
            } else {
                conceito = 'E';
            }
            
            JOptionPane.showMessageDialog(null, "Número do aluno: " + numeroIdentificacao + 
                    "\nNotas: " + V1 + ", " + V2 + ", " + V3 + 
                    "\nMédia dos exercícios: " + ME + 
                    "\nMédia de aproveitamento: " + MA + 
                    "\nConceito: " + conceito);
            
            if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
                JOptionPane.showMessageDialog(null, "APROVADO");
            } else {
                JOptionPane.showMessageDialog(null, "REPROVADO");
            }
        }
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro numeroIdentificacao
        real V1, V2, V3, ME, MA
        caracter conceito

        escreva("Digite o número de identificação do aluno: ")
        leia(numeroIdentificacao)
        escreva("Digite as três notas do aluno (entre 0 e 10): ")
        leia(V1, V2, V3)
        escreva("Digite a média dos exercícios (entre 0 e 10): ")
        leia(ME)

        se(V1 < 0 ou V1 > 10 ou V2 < 0 ou V2 > 10 ou V3 < 0 ou V3 > 10 ou ME < 0 ou ME > 10) {
            escreva("Notas e média dos exercícios devem estar entre 0 e 10.")
            retorne
        }

        MA = (V1 + 2 * V2 + 3 * V3 + ME) / 7

        se(MA >= 9.0) {
            conceito = 'A'
        } senao se(MA >= 7.5) {
            conceito = 'B'
        } senao se(MA >= 6.0) {
            conceito = 'C'
        } senao se(MA >= 4.0) {
            conceito = 'D'
        } senao {
            conceito = 'E'
        }

        escreva("Número do aluno: ", numeroIdentificacao, "\nNotas: ", V1, ", ", V2, ", ", V3, "\nMédia dos exercícios: ", ME, "\nMédia de aproveitamento: ", MA, "\nConceito: ", conceito)

        se(conceito == 'A' ou conceito == 'B' ou conceito == 'C') {
            escreva("\nAPROVADO")
        } senao {
            escreva("\nREPROVADO")
        }
    }
}
*/

// TESTE DE MESA
// NUMERO IDENTIFICACAO / V1 / V2 / V3 / ME / CONCEITO / SITUACAO
// 1 / 5.0 / 6.0 / 7.0 / 8.0 / C / APROVADO
// 2 / 4.0 / 5.0 / 6.0 / 7.0 / D / REPROVADO