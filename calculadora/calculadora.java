package calculadora;
import javax.swing.JOptionPane;

public class calculadora {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double num2 = Double.parseDouble(input2);

        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha a operação:", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, operacoes, operacoes[0]);

        double resultado = 0;

        switch (escolha) {
            case 0:
                resultado = num1 + num2;
                break;
            case 1:
                resultado = num1 - num2;
                break;
            case 2:
                resultado = num1 * num2;
                break;
            case 3:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha inválida.");
                return;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}

