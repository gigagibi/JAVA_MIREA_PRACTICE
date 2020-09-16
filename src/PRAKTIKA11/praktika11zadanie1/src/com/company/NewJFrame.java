package PRAKTIKA11.praktika11zadanie1.src.com.company;

import java.lang.Math.*;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    private int num;
    private int attempts = 2;
    private javax.swing.JTextArea inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;

    public NewJFrame() {
        Random rand = new Random();
        initComponents();
        num =  1 + rand.nextInt(20 - 1);
        attempts = 2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputField = new javax.swing.JTextArea();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputField.setColumns(20);
        inputField.setRows(5);
        jScrollPane1.setViewportView(inputField);

        jToggleButton2.setText("Угадал?");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ожидается ввод...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jToggleButton2)
                                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(Integer.parseInt(inputField.getText()) == num)
        {
            JOptionPane.showMessageDialog(rootPane, "Вы угадали!", "Тупо победитель", 1);
            System.exit(0);
        }

        else if(Integer.parseInt(inputField.getText()) != num)
        {
            if(attempts !=0)
            {
                attempts--;
                if(num > Integer.parseInt(inputField.getText()))
                {
                    jLabel1.setText("Неправильно! Ваше число меньше загаданного");
                }
                else if(num < Integer.parseInt(inputField.getText()))
                {
                    jLabel1.setText("Неправильно! Ваше число больше загаданного");
                }
            }
            else
            {
                if(num > Integer.parseInt(inputField.getText()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Вы не смогли угадать с 3-х попыток, ваше число меньше загаданного", "Лузер но много слов", 0);
                    System.exit(0);
                }
                else if(num < Integer.parseInt(inputField.getText()))
                {
                    JOptionPane.showMessageDialog(rootPane, "Вы не смогли угадать с 3-х попыток, ваше число больше загаданного", "Лузер но много слов", 0);
                    System.exit(0);
                }

            }
        }
    }


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }


}
