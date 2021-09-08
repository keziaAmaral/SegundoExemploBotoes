package br.com.KeziaAmaral.SegundoExemplo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploBotao implements ActionListener {
    private JLabel jLabelResultado;

    ExemploBotao(){
        JFrame container = new JFrame("Exemplo de uso de botão");
        container.setLayout(new FlowLayout());

        container.setSize(200,90);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");
        JButton jButtonClear = new JButton("Clear");

        jButtonUp.addActionListener(this);
        jButtonDown.addActionListener(this);
        jButtonClear.addActionListener(this);

        container.add(jButtonUp);
        container.add(jButtonDown);
        container.add(jButtonClear);

        jLabelResultado = new JLabel("Por favor pressione um botão");

        container.add(jLabelResultado);

        container.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getActionCommand().equals("Up"))
            jLabelResultado.setText("Você pressionou o botão Up");
        else if (actionEvent.getActionCommand().equals("Down"))
            jLabelResultado.setText("Você pressionou o botão Down");
        else
            jLabelResultado.setText("");
    }
}


