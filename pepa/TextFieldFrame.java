import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;

    public TextFieldFrame()
    {
        super(" Testing JTextField and JPasswordField");
        setLayout(new FlowLayout() );

        textField1 = new JTextField("Nome",10);
        add( textField1 );

        textField2 = new JTextField("Sobrenome",10);
        add( textField2 );

        textField3 = new JTextField( "Senha:", 10);
        textField3.setEditable(false);
        add( textField3 );

        passwordField = new JPasswordField(10);
        add(passwordField);

        TextFielHandler handler = new TextFielHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    private class TextFielHandler implements ActionListener 
    {
        public void actionPerformed( ActionEvent event )
        {
            String string = "";

            if (event.getSource()== textField1)
                string = String.format( "Nome: %s" , event.getActionCommand());
            
            else if (event.getSource() == textField2)
                string = String.format("Sobrenome: %s", event.getActionCommand() );
            
            else if (event.getSource() == textField3) 
                string = String.format( "textField3: %s", event.getActionCommand() );

            else if (event.getSource() == passwordField )
                string = String.format("Senha: %s", event.getActionCommand());


            JOptionPane.showMessageDialog(null, string);
                
            }
        }
    
        
    }

