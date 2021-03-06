package towerdefenders.ui;

//import premierjeu.manager.OuvrierManager;
//import premierjeu.manager.TourelleManager;

public class GameWindow extends javax.swing.JFrame {

    private int count = 0;
    private int countT = 0;
    /**
     * Creates new form Fenetre
     */
    public GameWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        btn_start = new javax.swing.JButton();
        life = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_ouvrier = new javax.swing.JLabel();
        lbl_tourelle = new javax.swing.JLabel();
        lbl_mechant = new javax.swing.JLabel();
        btn_ouvrier = new javax.swing.JButton();
        coin = new javax.swing.JLabel();
        board = new towerdefenders.ui.Playground();

        jLabel3.setText("jLabel3");

        jToggleButton1.setText("jToggleButton1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tower Defenders");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("gamewindow"); // NOI18N
        setResizable(false);

        sidebar.setBackground(new java.awt.Color(50, 153, 66));
        sidebar.setToolTipText("");
        sidebar.setAlignmentX(0.0F);
        sidebar.setAlignmentY(0.0F);
        sidebar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        sidebar.setMinimumSize(new java.awt.Dimension(150, 400));
        sidebar.setName("sidebar"); // NOI18N
        sidebar.setPreferredSize(new java.awt.Dimension(150, 600));

        btn_start.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btn_start.setText("Start/Stop");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        life.setForeground(new java.awt.Color(255, 255, 255));
        life.setText("5 Vies");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("0 Expérience ");

        lbl_ouvrier.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ouvrier.setText("0 ouvrier");

        lbl_tourelle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tourelle.setText("0 Tourelle ");

        lbl_mechant.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mechant.setText("0 Monstre");
        lbl_mechant.setToolTipText("");

        btn_ouvrier.setText("Ouvrier");
        btn_ouvrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ouvrierActionPerformed(evt);
            }
        });

        coin.setForeground(new java.awt.Color(255, 255, 255));
        coin.setText("0 Coin");

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btn_ouvrier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lbl_mechant)
                            .addComponent(life)
                            .addComponent(lbl_tourelle)
                            .addComponent(lbl_ouvrier)
                            .addComponent(coin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_start)
                .addGap(18, 18, 18)
                .addComponent(btn_ouvrier)
                .addGap(64, 64, 64)
                .addComponent(life)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addComponent(coin)
                .addGap(20, 20, 20)
                .addComponent(lbl_tourelle)
                .addGap(20, 20, 20)
                .addComponent(lbl_ouvrier, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbl_mechant)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        lbl_ouvrier.getAccessibleContext().setAccessibleName("lbl_ouvrier");

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
            .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidebar.getAccessibleContext().setAccessibleName("sidebar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_ouvrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ouvrierActionPerformed
        //OuvrierManager.init();  
        count++;
        if (count <= 1) {
            lbl_ouvrier.setText(count + " ouvrier");
        } else {
            lbl_ouvrier.setText(count + " ouvriers");
        }
    }//GEN-LAST:event_btn_ouvrierActionPerformed

    private void panneauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panneauMouseClicked
        
        int x = evt.getX();
        int y = evt.getY();
        
        //TourelleManager.init(x , y );
        
        countT++;
        
        if (countT <= 1) {
            lbl_tourelle.setText(countT + " Tourelle");
        } else {
            lbl_tourelle.setText(countT + " Tourelles");
        }
    }//GEN-LAST:event_panneauMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public towerdefenders.ui.Playground board;
    private javax.swing.JButton btn_ouvrier;
    private javax.swing.JButton btn_start;
    public javax.swing.JLabel coin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JLabel lbl_mechant;
    public javax.swing.JLabel lbl_ouvrier;
    public javax.swing.JLabel lbl_tourelle;
    public javax.swing.JLabel life;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables

    private void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void interrupt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
