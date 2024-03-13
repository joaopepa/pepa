import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CandyShop extends JFrame {
    private JTextField chocolateField;
    private JTextField caramelField;
    private JTextField balaField;
    private JButton orderButton;

    public CandyShop() {
        super("Candy Shop");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel chocolateLabel = new JLabel("Quantidade de Chocolate:");
        JLabel caramelLabel = new JLabel("Quantidade de Caramelos:");
        JLabel balaLabel = new JLabel("Quantidade de Balas:");

        chocolateField = new JTextField(10);
        caramelField = new JTextField(10);
        balaField = new JTextField(10);

        orderButton = new JButton("Pedir");

        add(createItemPanel("Chocolate", chocolateLabel, chocolateField, "chocolate.jpg"));
        add(createItemPanel("Caramelo", caramelLabel, caramelField, "caramel.jpg"));
        add(createItemPanel("Bala", balaLabel, balaField, "bala.jpg"));
        add(new JLabel());
        add(orderButton);

        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double totalPrice = calculateTotalPrice();
                String message = String.format("Total: $%.2f", totalPrice);
                JOptionPane.showMessageDialog(null, message, "Total da Compra", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private JPanel createItemPanel(String itemName, JLabel label, JTextField field, String imagePath) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new JLabel(new ImageIcon(imagePath)));
        panel.add(label);
        panel.add(field);
        return panel;
    }

    private double calculateTotalPrice() {
        int chocolateQuantity = Integer.parseInt(chocolateField.getText());
        int caramelQuantity = Integer.parseInt(caramelField.getText());
        int candyQuantity = Integer.parseInt(balaField.getText());

        double totalChocolatePrice = chocolateQuantity * 1.50;
        double totalCaramelPrice = caramelQuantity * 1.00;
        double totalCandyPrice = candyQuantity * 1.50;

        return totalChocolatePrice + totalCaramelPrice + totalCandyPrice;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CandyShop().setVisible(true);
            }
        });
    }
}
