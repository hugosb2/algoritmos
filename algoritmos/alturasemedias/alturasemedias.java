import javax.swing.JOptionPane;

public class alturasemedias {
    public static void main(String[] args) {
        double[] alturas = new double[50];
        char[] sexos = new char[50];
        double maior_altura = 0.0, menor_altura = Double.MAX_VALUE;
        double soma_mulheres = 0.0, soma_turma = 0.0;
        int cont_mulheres = 0;

        for (int i = 0; i < 50; i++) {
            String s_alturas = JOptionPane.showInputDialog("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = Double.parseDouble(s_alturas);

            String s_sexos = JOptionPane.showInputDialog("Digite o sexo da pessoa (M/F): ");
            sexos[i] = s_sexos.charAt(0);

            if (i == 0) {
                maior_altura = alturas[i];
                menor_altura = alturas[i];
            } else {
                if (alturas[i] > maior_altura) {
                    maior_altura = alturas[i];
                }
                if (alturas[i] < menor_altura) {
                    menor_altura = alturas[i];
                }
            }

            soma_turma += alturas[i];
            if (sexos[i] == 'F') {
                soma_mulheres += alturas[i];
                cont_mulheres++;
            }
        }

        double media_mulheres = (cont_mulheres > 0) ? (soma_mulheres / cont_mulheres) : 0;
        double media_turma = soma_turma / 50;

        JOptionPane.showMessageDialog(null, 
            "Maior altura: " + maior_altura + "\n" +
            "Menor altura: " + menor_altura + "\n" +
            "Média da altura das mulheres: " + media_mulheres + "\n" +
            "Média da altura da turma: " + media_turma);
    }
}

/*
programa {
    funcao inicio() {
        real alturas[50]
        caracter sexos[50]
        real maior_altura = 0.0, menor_altura = 0.0
        real soma_mulheres = 0.0, soma_turma = 0.0
        inteiro cont_mulheres = 0

        para (inteiro i = 0; i < 50; i++) {
            escreva("Digite a altura da pessoa ", i + 1, ": ")
            leia(alturas[i])
            escreva("Digite o sexo da pessoa (M/F): ")
            leia(sexos[i])

            se (i == 0) {
                maior_altura = alturas[i]
                menor_altura = alturas[i]
            }
            senao {
                se (alturas[i] > maior_altura) {
                    maior_altura = alturas[i]
                }
                se (alturas[i] < menor_altura) {
                    menor_altura = alturas[i]
                }
            }

            soma_turma += alturas[i]

            se (sexos[i] == 'F') {
                soma_mulheres += alturas[i]
                cont_mulheres++
            }
        }

        real media_mulheres = soma_mulheres / cont_mulheres
        real media_turma = soma_turma / 50

        escreva("Maior altura: ", maior_altura, "\n")
        escreva("Menor altura: ", menor_altura, "\n")
        escreva("Média da altura das mulheres: ", media_mulheres, "\n")
        escreva("Média da altura da turma: ", media_turma)
    }
}
*/