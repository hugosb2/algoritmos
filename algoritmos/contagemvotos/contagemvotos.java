import javax.swing.JOptionPane;
public class contagemvotos{
    public static void main(String[] args) {
        int voto, firmino = 0, eugenia = 0, branco = 0, nulo = 0, total = 0;
        do {
            String s_voto = JOptionPane.showInputDialog("Digite o voto (1-Firmino, 2-Eugênia, 0-Branco, 9-Nulo, -1 para encerrar): ");
            voto = Integer.parseInt(s_voto);
            if (voto == 1) {
                firmino++;
            } else if (voto == 2) {
                eugenia++;
            } else if (voto == 0) {
                branco++;
            } else if (voto == 9) {
                nulo++;
            }
            total++;
        } while (voto != -1);
        JOptionPane.showMessageDialog(null, "Total de votos: " + (total - 1) + "\n" +
            "Firmino: " + firmino + "\n" +
            "Eugênia: " + eugenia + "\n" +
            "Votos em branco: " + branco + "\n" +
            "Votos nulos: " + nulo + "\n");
        
        if (firmino > eugenia) {
            JOptionPane.showMessageDialog(null, "Firmino venceu!");
        } else if (eugenia > firmino) {
            JOptionPane.showMessageDialog(null, "Eugênia venceu!");
        } else {
            JOptionPane.showMessageDialog(null, "Empate!");
        }
        
    }
}

/*
TESTE DE MESA

Total de Votos / Firmino / Eugênia / Branco / Nulo / Resultado
5 / 2 / 2 / 0 / 1 / Empate
5 / 3 / 1 / 0 / 1 / Firmino venceu
5 / 1 / 3 / 0 / 1 / Eugênia venceu

*/
/*
programa {
    funcao inicio() {
        inteiro voto, firmino = 0, eugenia = 0, branco = 0, nulo = 0, total = 0

        faca {
            escreva("Digite o voto (1-Firmino, 2-Eugênia, 0-Branco, 9-Nulo, -1 para encerrar): ")
            leia(voto)

            se (voto == 1) {
                firmino++
            }
            senao se (voto == 2) {
                eugenia++
            }
            senao se (voto == 0) {
                branco++
            }
            senao se (voto == 9) {
                nulo++
            }

            total++
        } enquanto (voto != -1)

        escreva("Total de votos: ", total - 1, "\n")
        escreva("Firmino: ", firmino, "\n")
        escreva("Eugênia: ", eugenia, "\n")
        escreva("Votos em branco: ", branco, "\n")
        escreva("Votos nulos: ", nulo, "\n")

        se (firmino > eugenia) {
            escreva("Firmino venceu!\n")
        }
        senao se (eugenia > firmino) {
            escreva("Eugênia venceu!\n")
        }
        senao {
            escreva("Empate!\n")
        }
    }
}
*/