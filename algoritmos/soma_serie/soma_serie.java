import javax.swing.JOptionPane;
public class soma_serie{
    public static void main(String[] args) {
        int n, i;
        float soma = 0, termo;

        String s_n = JOptionPane.showInputDialog("Digite a quantidade de termos da série: ");
        n = Integer.parseInt(s_n);

        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Erro");
        }

        else{
            for (i = 1; i<=n; i++){
            termo = (float) (i / (11*i + 1.0));
            soma = soma + termo;
        }

       JOptionPane.showMessageDialog(null, "A soma dos "+ n +" primeiros termos da série é: " + soma);
        }
    }
}

/*TESTE DE MESA

Entrada / Saída
n = -5  / Erro
0       / Erro
2       / 0.17028986
3       / 0.25852516
*/


/**
programa
{
    funcao inicio()
    {
        inteiro n, i
        real soma = 0, termo
        
        escreva("Digite a quantidade de termos da série: ")
        leia(n)
                
        se (n < 0) {
            escreva()"Erro");
        }

        senao{
            para(i = 1; i <= n; i++)
            {
                termo = i / (11*i + 1.0)
                soma = soma + termo
            }
            
            escreva("A soma dos ", n, " primeiros termos da série é: ", soma)
        }
    }
}
*/