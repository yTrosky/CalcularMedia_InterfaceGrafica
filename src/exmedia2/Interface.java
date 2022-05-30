package exmedia2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface extends JFrame {
    JLabel rotulo1, rotulo2,rotulo3, rotulo4, exibir;
    JTextField texto1, texto2, texto3, texto4;
    JButton calcular;
    public Interface() {
        super("Exemplo de cálculo de média");
        Container tela = getContentPane();
        setLayout(null);    
        rotulo1 = new JLabel("1° número: ");
        rotulo2 = new JLabel("2° número: ");
        rotulo3 = new JLabel("3° número: ");
        rotulo4 = new JLabel("4° número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);
        exibir = new JLabel("");
        calcular = new JButton("Calcular");
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        rotulo3.setBounds(50, 100, 100, 20);
        rotulo4.setBounds(50, 140, 100, 20);
        texto1.setBounds(120, 20, 150, 20);
        texto2.setBounds(120, 60, 150, 20);
        texto3.setBounds(120, 100, 150, 20);
        texto4.setBounds(120, 140, 150, 20);
        exibir.setBounds(50, 180, 200, 20);
        calcular.setBounds(150, 180, 80, 20);   
        calcular.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double num1, num2,num3, num4, media = 0;
                    num1 = Double.parseDouble(texto1.getText());
                    num2 = Double.parseDouble(texto2.getText());
                    num3 = Double.parseDouble(texto3.getText());
                    num4 = Double.parseDouble(texto4.getText());
                    media = (num1 + num2 + num3+ num4) / 4;
                    exibir.setVisible(true);
                    exibir.setText("A média é: " + media);
                }
            }
        );
        exibir.setVisible(false);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);   
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(exibir);
        tela.add(calcular);
        setSize(400, 250);
        setVisible(true);
    }
}

