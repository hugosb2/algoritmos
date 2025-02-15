package calcular_pontos_funcionario;
import javax.swing.JOptionPane;
public class Calcular_pontos_funcionario {
    public static void main(String[] args) {
        int projetosGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de grande porte: "));
        int projetosMedio = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de médio porte: "));
        int projetosPequeno = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de pequeno porte: "));
        int tempoEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de empresa (em anos): "));
        
        if (projetosGrande < 0 || projetosMedio < 0 || projetosPequeno < 0 || tempoEmpresa < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de projetos ou tempo de empresa não pode ser negativa.");
        } else {
            int totalPontos = (projetosGrande * 10) + (projetosMedio * 5) + (projetosPequeno * 2) + (tempoEmpresa * 2);
            
            JOptionPane.showMessageDialog(null, "Total de pontos acumulados: " + totalPontos);
        }
    }
    
}

/*
programa {
    funcao inicio() {
        inteiro projetos_grande, projetos_medio, projetos_pequeno, tempo_empresa, total_pontos

        escreva("Digite a quantidade de projetos de grande porte: ")
        leia(projetos_grande)
        escreva("Digite a quantidade de projetos de médio porte: ")
        leia(projetos_medio)
        escreva("Digite a quantidade de projetos de pequeno porte: ")
        leia(projetos_pequeno)
        escreva("Digite o tempo de empresa (em anos): ")
        leia(tempo_empresa)

        se (projetos_grande < 0 ou projetos_medio < 0 ou projetos_pequeno < 0 ou tempo_empresa < 0) {
            escreva("Erro: A quantidade de projetos ou tempo de empresa não pode ser negativa.\n")
        } senao {
            total_pontos = (projetos_grande * 10) + (projetos_medio * 5) + (projetos_pequeno * 2) + (tempo_empresa * 2)
            escreva("Total de pontos acumulados: ", total_pontos, "\n")
        }
    }
}
*/


// TESTE DE MESA
// PROJETOS GRANDE / PROJETOS MÉDIO / PROJETOS PEQUENO / TEMPO EMPRESA / TOTAL DE PONTOS
// 1 / 2 / 3 / 4 / 34
// 0 / 0 / 0 / 0 / 0
// 0 / 2 / 3 / 4 / 24
// -1 / -2 / -3 / -4 / Erro