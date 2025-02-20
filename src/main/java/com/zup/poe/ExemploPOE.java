package com.zup.poe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploPOE {
    public static void main(String[] args) {
        // Criando a janela
        JFrame frame = new JFrame("Exemplo POE");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando o botão
        JButton button = new JButton("Clique aqui!");
        frame.add(button);

        // Adicionando o listener ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Manipulador de evento
                JOptionPane.showMessageDialog(frame, "Botão clicado!");
            }
        });

        // Exibindo a janela
        frame.setVisible(true);
    }
}
