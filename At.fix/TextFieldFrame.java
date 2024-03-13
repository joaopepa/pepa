import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TextFieldFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
    private JLabel imageLabel;
    private JButton okButton;

    public TextFieldFrame() {
        super(" Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());
        
        ImageIcon icon = new ImageIcon("bug.png");
        imageLabel = new JLabel(icon);
        add(imageLabel);
        
        textField1 = new JTextField("Nome:", 10);
        add(textField1);
        textField2 = new JTextField("Sobrenome:", 10);
        add(textField2);

        textField3 = new JTextField("Senha:", 10);
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField(10);
        add(passwordField);
       
        okButton = new JButton("OK");
        add(okButton); 
       
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
        okButton.addActionListener(handler);
    }

    private class TextFieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = "";

            if (event.getSource() == textField1)
                string = String.format("Nome: %s", event.getActionCommand());

            else if (event.getSource() == textField2)
                string = String.format("Sobrenome: %s", event.getActionCommand());

            else if (event.getSource() == textField3)
                string = String.format("textField3: %s", event.getActionCommand());

            else if (event.getSource() == passwordField)
                string = String.format("Senha: %s", event.getActionCommand());
            else if (event.getSource() == okButton)
                string = String.format("nome: %s \n Sobrenome: %s \n Senha: %s \n", textField1.getText(), textField2.getText(), new String(passwordField.getPassword()).trim());
                JOptionPane.showMessageDialog(null, string);
        }
    }
}

