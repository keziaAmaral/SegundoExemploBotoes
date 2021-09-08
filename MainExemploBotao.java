package br.com.KeziaAmaral.SegundoExemplo;

import javax.swing.*;

public class MainExemploBotao{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploBotao();
            }
        });

    }
}
