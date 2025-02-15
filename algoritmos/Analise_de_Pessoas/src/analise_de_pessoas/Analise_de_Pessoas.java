package analise_de_pessoas;
import javax.swing.JOptionPane;
public class Analise_de_Pessoas {
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa: ");
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira pessoa: "));
        double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da primeira pessoa: "));
        
        String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa: ");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda pessoa: "));
        double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da segunda pessoa: "));
        
        String nome3 = JOptionPane.showInputDialog("Digite o nome da terceira pessoa: ");
        int idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da terceira pessoa: "));
        double altura3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da terceira pessoa: "));
        
        if (idade1 <= 0 || idade2 <= 0 || idade3 <= 0 || altura1 <= 0 || altura2 <= 0 || altura3 <= 0) {
            JOptionPane.showMessageDialog(null, "Idades e alturas devem ser maiores que 0.");
        } else {
            String maisAlto = nome1;
            if (altura2 > altura1 && altura2 > altura3) {
                maisAlto = nome2;
            } else if (altura3 > altura1 && altura3 > altura2) {
                maisAlto = nome3;
            }
            
            String maisBaixo = nome1;
            if (altura2 < altura1 && altura2 < altura3) {
                maisBaixo = nome2;
            } else if (altura3 < altura1 && altura3 < altura2) {
                maisBaixo = nome3;
            }
            
            double alturaMedia = (altura1 + altura2 + altura3) / 3;
            
            String maisVelho = nome1;
            if (idade2 > idade1 && idade2 > idade3) {
                maisVelho = nome2;
            } else if (idade3 > idade1 && idade3 > idade2) {
                maisVelho = nome3;
            }
            
            String maisNovo = nome1;
            if (idade2 < idade1 && idade2 < idade3) {
                maisNovo = nome2;
            } else if (idade3 < idade1 && idade3 < idade2) {
                maisNovo = nome3;
            }
            
            JOptionPane.showMessageDialog(null, maisAlto + " é o mais alto.\n" + 
                    maisBaixo + " é o mais baixo.\n" + 
                    "A altura média do grupo é: " + alturaMedia + "\n" + 
                    maisVelho + " é o mais velho.\n" + 
                    maisNovo + " é o mais novo.");
        }
    }
    
}

/*
programa {
    funcao inicio() {
        cadeia nome1, nome2, nome3
        inteiro idade1, idade2, idade3
        real altura1, altura2, altura3

        escreva("Digite o nome, idade e altura da primeira pessoa: ")
        leia(nome1, idade1, altura1)
        escreva("Digite o nome, idade e altura da segunda pessoa: ")
        leia(nome2, idade2, altura2)
        escreva("Digite o nome, idade e altura da terceira pessoa: ")
        leia(nome3, idade3, altura3)

        se(idade1 <= 0 ou idade2 <= 0 ou idade3 <= 0 ou altura1 <= 0 ou altura2 <= 0 ou altura3 <= 0) {
            escreva("Idades e alturas devem ser maiores que 0.")
            retorne
        }

        se(altura1 > altura2 e altura1 > altura3) {
            escreva(nome1, " é o mais alto.\n")
        } senao se(altura2 > altura1 e altura2 > altura3) {
            escreva(nome2, " é o mais alto.\n")
        } senao {
            escreva(nome3, " é o mais alto.\n")
        }

        se(altura1 < altura2 e altura1 < altura3) {
            escreva(nome1, " é o mais baixo.\n")
        } senao se(altura2 < altura1 e altura2 < altura3) {
            escreva(nome2, " é o mais baixo.\n")
        } senao {
            escreva(nome3, " é o mais baixo.\n")
        }

        real alturaMedia = (altura1 + altura2 + altura3) / 3
        escreva("A altura média do grupo é: ", alturaMedia, "\n")

        se(idade1 > idade2 e idade1 > idade3) {
            escreva(nome1, " é o mais velho.\n")
        } senao se(idade2 > idade1 e idade2 > idade3) {
            escreva(nome2, " é o mais velho.\n")
        } senao {
            escreva(nome3, " é o mais velho.\n")
        }

        se(idade1 < idade2 e idade1 < idade3) {
            escreva(nome1, " é o mais moço.\n")
        } senao se(idade2 < idade1 e idade2 < idade3) {
            escreva(nome2, " é o mais moço.\n")
        } senao {
            escreva(nome3, " é o mais moço.\n")
        }
    }
}
*/

/*
TESTE DE MESA
NOME / IDADE / ALTURA
Joaquim / 20 / 1.70
Maria / 25 / 1.60
Jose / 30 / 1.80

MAIS ALTO: Joaquim
MAIS BAIXO: Maria
ALTURA MEDIA: 1.70
MAIS VELHO: Jose
MAIS NOVO: Maria
*/