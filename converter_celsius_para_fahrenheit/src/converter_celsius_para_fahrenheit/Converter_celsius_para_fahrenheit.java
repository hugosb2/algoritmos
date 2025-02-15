package converter_celsius_para_fahrenheit;
import javax.swing.JOptionPane;
public class Converter_celsius_para_fahrenheit {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius: "));
        
        fahrenheit = (celsius * 9/5) + 32;
        
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);
    }
    
}

/*
programa {
    funcao inicio() {
        real celsius, fahrenheit

        escreva("Digite a temperatura em graus Celsius: ")
        leia(celsius)

            fahrenheit = (celsius * 9/5) + 32
            escreva("A temperatura em Fahrenheit é: ", fahrenheit, "\n")
    }
}
*/

// TESTE DE MESA
// CELSIUS / FAHRENHEIT
// 0.0 / 32.0
// 100.0 / 212.0