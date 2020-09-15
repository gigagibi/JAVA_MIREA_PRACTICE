package PRAKTIKA11.praktika11zadanie3.src.com.company;

import java.awt.Color;
import java.awt.Font;
import java.lang.Math.*;
import javax.swing.JOptionPane;
import java.util.*;

import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    //JOptionPane dialog = new JOptionPane();

    public NewJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Text1 = new javax.swing.JTextField();
        FontChoose = new javax.swing.JMenuBar();
        ColorChoose = new javax.swing.JMenu();
        ColorChooseBlue = new javax.swing.JMenuItem();
        ColorChooseRed = new javax.swing.JMenuItem();
        ColorChooseBlack = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        FontChooseTNR = new javax.swing.JMenuItem();
        FontChooseMSSS = new javax.swing.JMenuItem();
        FontChooseCN = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1ActionPerformed(evt);
            }
        });

        ColorChoose.setText("Цвет");

        ColorChooseBlue.setText("Синий");
        ColorChooseBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorChooseBlueActionPerformed(evt);
            }
        });
        ColorChoose.add(ColorChooseBlue);

        ColorChooseRed.setText("Красный");
        ColorChooseRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorChooseRedActionPerformed(evt);
            }
        });
        ColorChoose.add(ColorChooseRed);

        ColorChooseBlack.setText("Черный");
        ColorChooseBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorChooseBlackActionPerformed(evt);
            }
        });
        ColorChoose.add(ColorChooseBlack);

        FontChoose.add(ColorChoose);

        jMenu4.setText("Шрифт");

        FontChooseTNR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, 0));
        FontChooseTNR.setText("Times New Roman");
        FontChooseTNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontChooseTNRActionPerformed(evt);
            }
        });
        jMenu4.add(FontChooseTNR);

        FontChooseMSSS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, 0));
        FontChooseMSSS.setText("MS Sans Serif");
        FontChooseMSSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontChooseMSSSActionPerformed(evt);
            }
        });
        jMenu4.add(FontChooseMSSS);

        FontChooseCN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, 0));
        FontChooseCN.setText("Courier New");
        FontChooseCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontChooseCNActionPerformed(evt);
            }
        });
        jMenu4.add(FontChooseCN);

        FontChoose.add(jMenu4);

        setJMenuBar(FontChoose);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Text1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Text1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void ColorChooseBlueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Text1.setForeground(Color.BLUE);
    }

    private void ColorChooseRedActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Text1.setForeground(Color.RED);
    }

    private void FontChooseMSSSActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Text1.setFont(new Font("MS Sans Serif", Font.BOLD, 14));
    }

    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void ColorChooseBlackActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Text1.setForeground(Color.BLACK);
    }

    private void FontChooseTNRActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Text1.setFont(new Font("Times New Roman", Font.BOLD, 14));
    }

    private void FontChooseCNActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Text1.setFont(new Font("Courier New", Font.BOLD, 14));
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JMenu ColorChoose;
    private javax.swing.JMenuItem ColorChooseBlack;
    private javax.swing.JMenuItem ColorChooseBlue;
    private javax.swing.JMenuItem ColorChooseRed;
    private javax.swing.JMenuBar FontChoose;
    private javax.swing.JMenuItem FontChooseCN;
    private javax.swing.JMenuItem FontChooseMSSS;
    private javax.swing.JMenuItem FontChooseTNR;
    private javax.swing.JTextField Text1;
    private javax.swing.JMenu jMenu4;
}

