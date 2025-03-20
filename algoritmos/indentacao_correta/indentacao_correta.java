import javax.swing.JOptionPane;
public class indentacao_correta {
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 12;
        z = x-y;
        x = z + 8;

        if (x > y){
            if (z < x) {
                z = y;
            }
            else {
              z = x;
            }
        }
        else if (y>x){
           y = z;
        }
        else {
            y = y + 1;
        }
        JOptionPane.showMessageDialog(null, "O valor de x é: " + x + "\nO Valor de y é: "+ y + "\nO valor de z é: "+ z);
    }
}

/*Saída x = 6; y = -2 ; z = -2*/

/*
//Algoritmo para prática do método chinês
Variáveis
    X,Y,Z: inteiro;
//Corpo do algoritmo
início
    X <- 10;
    Y <- 12;
    Z <- X - Y;
    X <- Z + 8;
    se X>Y então
        se Z<X então
            Z <- Y
        senão
            Z <- X
        fim se
    senão
        se Y>X então
            Y <- Z
        senão
            Y <- Y + 1;
        fim se
        escrever 'O valor de X é ',X;
        escrever 'O valor de Y é ',Y;
        escrever 'O valor de Z é ',Z;
    fim se
fim.
*/