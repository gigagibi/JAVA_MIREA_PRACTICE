package PRAKTIKA11.praktika11zadanie2.src.com.company;


import java.lang.Math.*;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        WEST = new javax.swing.JPanel();
        CENTER = new javax.swing.JPanel();
        EAST = new javax.swing.JPanel();
        NORTH = new javax.swing.JPanel();
        SOUTH = new javax.swing.JPanel();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WEST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WESTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout WESTLayout = new javax.swing.GroupLayout(WEST);
        WEST.setLayout(WESTLayout);
        WESTLayout.setHorizontalGroup(
                WESTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 120, Short.MAX_VALUE)
        );
        WESTLayout.setVerticalGroup(
                WESTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        CENTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CENTERMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CENTERLayout = new javax.swing.GroupLayout(CENTER);
        CENTER.setLayout(CENTERLayout);
        CENTERLayout.setHorizontalGroup(
                CENTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 211, Short.MAX_VALUE)
        );
        CENTERLayout.setVerticalGroup(
                CENTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 145, Short.MAX_VALUE)
        );

        EAST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EASTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EASTLayout = new javax.swing.GroupLayout(EAST);
        EAST.setLayout(EASTLayout);
        EASTLayout.setHorizontalGroup(
                EASTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 114, Short.MAX_VALUE)
        );
        EASTLayout.setVerticalGroup(
                EASTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        NORTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NORTHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NORTHLayout = new javax.swing.GroupLayout(NORTH);
        NORTH.setLayout(NORTHLayout);
        NORTHLayout.setHorizontalGroup(
                NORTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        NORTHLayout.setVerticalGroup(
                NORTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        SOUTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SOUTHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SOUTHLayout = new javax.swing.GroupLayout(SOUTH);
        SOUTH.setLayout(SOUTHLayout);
        SOUTHLayout.setHorizontalGroup(
                SOUTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        SOUTHLayout.setVerticalGroup(
                SOUTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 146, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(WEST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NORTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SOUTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EAST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(WEST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EAST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NORTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SOUTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>

    private void WESTMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Добро пожаловать в ЗАО", "Вы пришли в ЗАО", 1);
    }

    private void NORTHMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Добро пожаловать в СВАО", "Вы пришли в СВАО", 1);
    }

    private void CENTERMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Добро пожаловать в ЦАО", "Вы пришли в ЦАО", 1);
    }

    private void SOUTHMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Добро пожаловать в ЮЗАО", "Вы пришли в ЮЗАО", 1);
    }

    private void EASTMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Добро пожаловать в СВАО", "Вы пришли в СВАО", 1);
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

    private javax.swing.JPanel CENTER;
    private javax.swing.JPanel EAST;
    private javax.swing.JPanel NORTH;
    private javax.swing.JPanel SOUTH;
    private javax.swing.JPanel WEST;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
}

