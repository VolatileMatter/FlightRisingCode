/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabel
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static bio current = new bio();
    
    public NewJFrame() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NameField = new javax.swing.JTextField();
        JobField = new javax.swing.JTextField();
        AlignField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        CharismaField = new javax.swing.JSlider();
        MagicField = new javax.swing.JSlider();
        SanityField = new javax.swing.JSlider();
        PossessionField = new javax.swing.JSlider();
        IntellectField = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        MateIDField = new javax.swing.JTextField();
        MateNameField = new javax.swing.JTextField();
        BestFriendField = new javax.swing.JTextField();
        BestFriendFieldID = new javax.swing.JTextField();
        FriendNameField = new javax.swing.JTextField();
        FriendIDField = new javax.swing.JTextField();
        EnemyNameField = new javax.swing.JTextField();
        EnemyIDField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        GenerateButton = new javax.swing.JButton();
        ClearField = new javax.swing.JButton();
        RandomizeField = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CodeField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NameField.setToolTipText("");
        NameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));

        JobField.setBorder(javax.swing.BorderFactory.createTitledBorder("Job"));

        AlignField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alignment"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameField)
                    .addComponent(JobField)
                    .addComponent(AlignField))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlignField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CharismaField.setMajorTickSpacing(1);
        CharismaField.setMaximum(10);
        CharismaField.setMinimum(1);
        CharismaField.setPaintLabels(true);
        CharismaField.setPaintTicks(true);
        CharismaField.setSnapToTicks(true);
        CharismaField.setValue(0);
        CharismaField.setBorder(javax.swing.BorderFactory.createTitledBorder("Charisma"));

        MagicField.setMajorTickSpacing(1);
        MagicField.setMaximum(10);
        MagicField.setMinimum(1);
        MagicField.setPaintLabels(true);
        MagicField.setPaintTicks(true);
        MagicField.setSnapToTicks(true);
        MagicField.setValue(0);
        MagicField.setBorder(javax.swing.BorderFactory.createTitledBorder("Magic"));

        SanityField.setMajorTickSpacing(1);
        SanityField.setMaximum(10);
        SanityField.setMinimum(1);
        SanityField.setPaintLabels(true);
        SanityField.setPaintTicks(true);
        SanityField.setSnapToTicks(true);
        SanityField.setValue(0);
        SanityField.setBorder(javax.swing.BorderFactory.createTitledBorder("Sanity"));

        PossessionField.setMajorTickSpacing(1);
        PossessionField.setMaximum(10);
        PossessionField.setMinimum(1);
        PossessionField.setPaintLabels(true);
        PossessionField.setPaintTicks(true);
        PossessionField.setSnapToTicks(true);
        PossessionField.setValue(0);
        PossessionField.setBorder(javax.swing.BorderFactory.createTitledBorder("Possession Level"));

        IntellectField.setMajorTickSpacing(1);
        IntellectField.setMaximum(10);
        IntellectField.setMinimum(1);
        IntellectField.setMinorTickSpacing(1);
        IntellectField.setPaintLabels(true);
        IntellectField.setPaintTicks(true);
        IntellectField.setSnapToTicks(true);
        IntellectField.setValue(1);
        IntellectField.setBorder(javax.swing.BorderFactory.createTitledBorder("Intellect"));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CharismaField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SanityField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MagicField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PossessionField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(IntellectField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntellectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CharismaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MagicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SanityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PossessionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MateIDField.setText("5");
        MateIDField.setBorder(javax.swing.BorderFactory.createTitledBorder("Mate ID"));

        MateNameField.setText("Shadowbinder ");
        MateNameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Mate Name"));

        BestFriendField.setText("Shadowbinder ");
        BestFriendField.setBorder(javax.swing.BorderFactory.createTitledBorder("Best Friend ID"));

        BestFriendFieldID.setText("5");
        BestFriendFieldID.setBorder(javax.swing.BorderFactory.createTitledBorder("Best Friend ID"));

        FriendNameField.setText("Shadowbinder ");
        FriendNameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Friend Name"));

        FriendIDField.setText("5");
        FriendIDField.setBorder(javax.swing.BorderFactory.createTitledBorder("Friend ID"));

        EnemyNameField.setText("Shadowbinder ");
        EnemyNameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Enemy Name"));

        EnemyIDField.setText("5");
        EnemyIDField.setBorder(javax.swing.BorderFactory.createTitledBorder("Enemy ID"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(MateIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MateNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BestFriendFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BestFriendField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(FriendIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FriendNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EnemyIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnemyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MateNameField)
                    .addComponent(MateIDField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BestFriendField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BestFriendFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FriendNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FriendIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnemyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnemyIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GenerateButton.setText("Generate");
        GenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtonActionPerformed(evt);
            }
        });

        ClearField.setText("Clear");
        ClearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearFieldActionPerformed(evt);
            }
        });

        RandomizeField.setText("Randomize");
        RandomizeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomizeFieldActionPerformed(evt);
            }
        });

        CodeField.setColumns(20);
        CodeField.setLineWrap(true);
        CodeField.setRows(5);
        CodeField.setWrapStyleWord(true);
        jScrollPane2.setViewportView(CodeField);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(GenerateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(RandomizeField)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateButton)
                    .addComponent(RandomizeField)
                    .addComponent(ClearField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateButtonActionPerformed
        // TODO add your handling code here:
        
        
        current.setName(NameField.getText());
        current.setjob(JobField.getText());
        current.setAli1(AlignField.getText());
        current.setBffname(BestFriendField.getText());
        current.setBffid(BestFriendFieldID.getText());
        current.setEnemyid(EnemyIDField.getText());
        current.setEnemyname(EnemyNameField.getText());
        current.setFriendid(FriendIDField.getText());
        current.setFriendname(FriendNameField.getText());
        current.setMateid(MateIDField.getText());
        current.setMatename(MateNameField.getText());
        current.setInte(IntellectField.getValue());
        current.setCha(CharismaField.getValue());
        current.setMag(MagicField.getValue());
        current.setSan(SanityField.getValue());
        current.setPos(PossessionField.getValue());
        
        
        CodeField.setText(current.makeBio());
    }//GEN-LAST:event_GenerateButtonActionPerformed

    private void ClearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearFieldActionPerformed
        // TODO add your handling code here:
        NameField.setText("");
        JobField.setText("");
        AlignField.setText("");
        BestFriendField.setText("");
        BestFriendFieldID.setText("");
        EnemyIDField.setText("");
        FriendIDField.setText("");
        FriendNameField.setText("");
        MateIDField.setText("");
        MateNameField.setText("");
        
        IntellectField.setValue(1);
        CharismaField.setValue(1);
        MagicField.setValue(1);
        PossessionField.setValue(1);
        SanityField.setValue(1);
        
        CodeField.setText("");
    }//GEN-LAST:event_ClearFieldActionPerformed

    private void RandomizeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomizeFieldActionPerformed
        // TODO add your handling code here:
       current.genName(); current.genJob(); current.genAli(); current.genStats();
        NameField.setText(current.getName());
        JobField.setText(current.getjob());
        AlignField.setText(current.getAli1());
        
        IntellectField.setValue(current.getInte());
        CharismaField.setValue(current.getCha());
        MagicField.setValue(current.getMag());
        PossessionField.setValue(current.getPos());
        SanityField.setValue(current.getSan());
        
        
    }//GEN-LAST:event_RandomizeFieldActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlignField;
    private javax.swing.JTextField BestFriendField;
    private javax.swing.JTextField BestFriendFieldID;
    private javax.swing.JSlider CharismaField;
    private javax.swing.JButton ClearField;
    private javax.swing.JTextArea CodeField;
    private javax.swing.JTextField EnemyIDField;
    private javax.swing.JTextField EnemyNameField;
    private javax.swing.JTextField FriendIDField;
    private javax.swing.JTextField FriendNameField;
    private javax.swing.JButton GenerateButton;
    private javax.swing.JSlider IntellectField;
    private javax.swing.JTextField JobField;
    private javax.swing.JSlider MagicField;
    private javax.swing.JTextField MateIDField;
    private javax.swing.JTextField MateNameField;
    private javax.swing.JTextField NameField;
    private javax.swing.JSlider PossessionField;
    private javax.swing.JButton RandomizeField;
    private javax.swing.JSlider SanityField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

class bio {
    static String name = "Unnamed";
    public static String getName() {return name;}
    public static void setName(String a) {name=a;}
    
    static String job = "Cake Sampler";
    public static String getjob(){return job;}
    public static void setjob(String a) {job=a;}
    
    static String Ali = "Lawful";
    public static String getAli1(){return Ali;}
    public static void setAli1(String a) {Ali=a;}
    
    static int inte = 1;
    public static int getInte() {return inte;}
    public static void setInte(int a) {inte=a;} 
    
    static int cha = 1;
    public static int getCha() {return cha;}
    public static void setCha(int a) {cha=a;}
    
    static int mag = 1;
    public static int getMag() {return mag;}
    public static void setMag(int a) {mag=a;}
    
    static int san = 1;
    public static int getSan() {return san;}
    public static void setSan(int a) {san=a;}
    
    static int pos = 1;
    public static int getPos() {return pos;}
    public static void setPos(int a) {pos=a;}
    
    static String MateName = "A";
    public static String getMatename() {return MateName;}
    public static void setMatename(String a) {MateName=a;}
    
    static String MateID = "1";
    public static String getMateid() {return MateID;}
    public static void setMateid(String a) {MateID=a;}
    
    static String BffName = "B";
    public static String getBffname() {return BffName;}
    public static void setBffname(String a) {BffName=a;}
    
    static String BffID = "2";
    public static String getBffid() {return BffID;}
    public static void setBffid(String a) {BffID=a;}
    
    static String FriendName = "C";
    public static String getFriendname() {return FriendName;}
    public static void setFriendname(String a) {FriendName=a;}
    
    static String FriendID = "3";
    public static String getFriendid() {return FriendID;}
    public static void setFriendid(String a) {FriendID=a;}
    
    static String EnemyName = "D";
    public static String getEnemyname() {return EnemyName;}
    public static void setEnemyname(String a) {EnemyName=a;}
    
    static String EnemyID = "4";
    public static String getEnemyid() {return EnemyID;}
    public static void setEnemyid(String a) {EnemyID=a;}
    
    public static String makeURL(String a){
    return "[url=http://flightrising.com/main.php?dragon="+a+"]";
    }
    
     public static String[] makeStats(int num){
        String res[] = new String[2];
        String left = "";
        String right = "▷▷▷▷▷▷▷▷▷▷";
        for (int i = 0; i <num; i++){
            left+="▶";
            right = right.substring(0,right.length()-1);
        }
         res[0]=left;
         res[1]=right;
        
        return res;
    }
     public static void genName() {
  String[] prefix = {"anti","auto","de","dis","down","extra","hyper","il","im","in","ir","inter","mega","mid","mis","non","over","out","post","pre","pro","re","semi","sub","sub","super","tele","trans","ultra","un","under","up"};
  String[] firCon = {"t", "n", "s", "r", "d", "f", "c", "b", "z"};
  String[] secCon = {"r", "h", "s","v"};
  String[] firVow = {"e", "a", "i", "o", "oo", "u"};
  String[] thiCon = {"t", "v", "w", "x", "ck", "g", "p", "ch", "sh","ph","rr",};
  String[] secVow = {"e", "i", "o","a","u"}; 
  String[] fouCon = {"r", "s", "y","de","x","ra","le",};
  String[] suffix = {"iode","able","ac","acity","ocity","ade","age","aholic","oholic","al","algia","an","ian","ance","ant","ar","ard","arian","arium","orium","ary","ation","ate","ative","cide","cracy","crat","cule","cy","cycle","dom","dox","ed","ee","ectomy","eer","emia","en","ence","ency","ent","er","ern","escence","ese","esque","ess","est","etic","ette","ful","fy","gam","gamy","gon","gonic","hood","ial","ian","iasis","iatric","ible","ic","ical","ile","ily","ine","ing","ion","ious","ish","ism","ist","ite","itis","ity","ive","ization","ize","less","let","like","ling","loger","logist","log","ly","ment","ness","oid","ology","oma","onym","opia","opsy","or","ory","osis","ostomy","otomy","ous","path","pathy","phile","phobia","phone","phyte","plegia","plegic","pnea","scopy","scope","scribe","script","sect","ship","sion","some","sophy","sophic","th","tion","tome","tomy","tude","trophy","tude","ty","ular","uous","ure","ward","ware","wise"};
  int numnum = (int)(Math.random() * 100000);  
  String result = " ";         
        //start with the prefix
        if(Math.random() < .5) {
            result += prefix[(int)(Math.random() * prefix.length)];
        }
        
        //then the first consonant
        if(Math.random() < .7) {
            result += firCon[(int)(Math.random() * firCon.length)];
        }
        
        //then the possible second consonant
        if(Math.random() < .4) {
            result += secCon[(int)(Math.random() * secCon.length)];
        }
        
        //then the first vowel
        if(Math.random() < .9) {
            result += firVow[(int)(Math.random() * firVow.length)];
        }
        
        //then the third consonant
        if(Math.random() < .8) {
            result += thiCon[(int)(Math.random() * thiCon.length)];
        }
        
        //then the second vowel
        if(Math.random() < .6) {
            result += secVow[(int)(Math.random() * secVow.length)];
        }
        
        //then the fourth consonant
        if(Math.random() < .5) {
            result += fouCon[(int)(Math.random() * fouCon.length)];
        }
        
        //possibly another vowel?
        if(Math.random() < .5) {
            result += secVow[(int)(Math.random() * secVow.length)];
        }
        
        //then the suffix
        if (Math.random() < .5) {
            result += suffix[(int)(Math.random() * suffix.length)];
        }
        
        //if it's short, then maybe repeat it. (Seg -> Segseg)
        if (Math.random() < .7 && (result.length() < 6)) {
        result += result.substring(1,result.length());
        }
        
        //lastly, capitalize the first letter.
        String temp1 = result.substring(1,2);
        String temp2 = result.substring(2,result.length());
        temp1 = temp1.toUpperCase();
        result = temp1 + temp2;
        
        //if it's too long, delete it. 
        if (result.length() > 9) {
             result = result.substring(0,8);
        }  
        name = result;       
    }
      public static void genJob() {
     String[] jobs = {"Warrior","Paladin","Wizard","Shopkeeper","Courier","Archaeologist","Scribe","Imagineer","Priest","Gardener","Scribne","Messenger","Blacksmith","Metallurgist","Dancer","Scout","Familiar Caretaker","Beast Master","Fisher","hunter","Healer","Nurse","Guard","Scientist",
                           "Lawyer","Professional Appraiser","Potter","Alchemist","Mercenary","Accountant","Magician","Oracle","Seer","Night Watchman","Serial Killer","Potion Master","Aerial Scout","Artist","Spell Weaver","Hatchling Sitter","Forager","Cook","Beekeeper","Farmer","Jeweler","Seamstress",
                           "Tailor","Weaver","Mason","Writer","Carpenter","Peacemaker","Diplomat","Healer","Spy","Vault Guard","Historian","Scholar","Philosopher","Undertaker","Scryer","Matchmaker","Cartographer","Logger","Astronomer","Pirate","Botanist","Mechanic","Dentist","Nanny","Exalter",
                            "Gamekeeper","Baker","Barber","Hairdresser","Explorer","Cooper","Brewster","Butcher","Maid","Housekeeper","Tracker","Innkeeper","Cheesemaker","Aviary keeper","Silk-Worm Keeper","Spider Keeper","Shepherd","Miner","Lair Construction Crew","Leather Worker","Tanner",
                            "Potter","Spinner","Dyer","Archardist","Tree-keeper","Paper Maker","Candlemaker","Glass Blower","Kite-Maker","Brewmaster","Wine Master","Herbalist","Caravan Leader","Messenger","Exotic Dancer","Gladiator","Electrician","Engineer","Mechanic","Translator","Playwright",
                            "Composer","Trader","Chemist","Illusionist","Bard","Luthier","Actor","Embroiderer","Farrier","Haberdasher","Soap Maker","Conman","Pickpocket","Apothecary","Kennel Master","Ward Crafter","Nest Sitter","Festival Keeper","Anarchist","Bandit","Cavelier","Daredevil","Espionage",
                             "Ninja","Poacher","Knight","Musketeer","Pillager","Samurai","Savager","Seafarer","Master-At-Arms","Slayer","Viking","Ranger","Rogue","Stalker","Theif","Trapper","Zealot","Archmage","Bishop","Conjuerer","Invoker","Jinx","Lich","Mage","Magi","Mediator","Monk","Mystic",
                            "Necromancer","Occultist","Saint","Sorcerer","Sprite","Summoner","Trickster","Warlock","Wizard","Witch","Cleric","Doctor","Druid","Herbalist","Purifier","Sage","Shaman","Surgeon","Sylph","Witch Doctor","Bouncer","Lookout","Mafioso","Consigliere","Warden","Apiarist","Arborist",
                           "Collector","Deepsea Diver","Excavator","Fisher","Fletcher","Florist","Fungiculturalist","Gatherer","Gravedigger","Harvester","Hoarder","Hobbyist","Reaper","Scavenger","Adviser","Archivist","Coach","Courtier","Educator","Teacher","Librarian","Mentor","Pedagogue","Proctor",
                            "Professor","Reporter","Storyteller","Savant","Trainer","Locksmith","Woodcarver"};
      int num = (int)(Math.random()*jobs.length);
      job = jobs[num];
  }  
   public static void genAli() {
     String[] al = {"Good", "Evil", "Chaotic", "Neutral", "Lawful"};
      int num = (int)(Math.random()*al.length);
      Ali = al[num];
  } 
   public static void genStats() {
       inte = (int)(Math.random()*10);
       cha = (int)(Math.random()*10);
       mag  = (int)(Math.random()*10);
       san = (int)(Math.random()*10);
       pos = (int)(Math.random()*10);       
   }

    public static String makeBio() {
        String bio = "";
        bio += "[img]https://dl.dropboxusercontent.com/s/y24d2eqrplu438x/shadowshieldl.png[/img]   [img]http://68.media.tumblr.com/a7ea0e04cd9e343acb00d4d14ff03d16/tumblr_nvb4xqYbv71uc01tdo4_540.png[/img]\n" +
"[columns]\n" +
"[FONT=Gabriola][size=7]"+name+"[/size]\n" +
"[size=4]"+job+" • "+Ali+"\n" +
"—–\n" +
"[FONT=Gabriola][size=5]SHADE TOUCHED\n" +
"—–\n" +
"[FONT=Gabriola][size=5]STATS[/size]\n" +
"[FONT=Gabriola]Intellect\n" +
""+makeStats(inte)[0]+makeStats(inte)[1]+"\n" +
"Charisma\n" +
""+makeStats(cha)[0]+makeStats(cha)[1]+"\n" +
"Magic\n" +
""+makeStats(mag)[0]+makeStats(mag)[1]+"\n" +
"Sanity\n" +
""+makeStats(san)[0]+makeStats(san)[1]+"\n" +
"Possession Level\n" +
""+makeStats(pos)[0]+makeStats(pos)[1]+"\n" +
"—–\n" +
"[FONT=Gabriola][size=5]RELATIONSHIPS[/size]\n" +
"[FONT=Gabriola]MATE - "+makeURL(MateID)+MateName+"[/url]\n" +
"BFF - "+makeURL(BffID)+BffName+"[/url]\n" +
"FRIEND - "+makeURL(FriendID)+FriendName+"[/url]\n" +
"ENEMY - "+makeURL(EnemyID)+EnemyName+"[/url]\n" +
"—–[center][img]http://68.media.tumblr.com/e7d90243ebade2beea95e40f24a1c395/tumblr_inline_ns8f89gBpz1sh5702_100.png[/img][/center]\n" +
"[nextcol]\n" +
"[FONT=Gabriola][size=6]Personality[/size][FONT=Gabriola][size=5]\n" +
"Lorem ipsum dolor sit amet, at vidit platonem rationibus eum, ad summo graece regione nec, no pro salutatus principes. Mea vivendo eloquentiam voluptatibus at. Esse veniam deterruisset at est, malis putent periculis ad usu. Has facer utamur ea. Enim soleat qualisque ex mel, in nec hinc democritum. Ex solum homero qui, ea vix quis aliquid invidunt, commodo quaerendum eum ex.\n" +
"[/size]\n" +
"[FONT=Gabriola][size=6]Biography[/size][FONT=Gabriola][size=5]\n" +
"Lorem ipsum dolor sit amet, at vidit platonem rationibus eum, ad summo graece regione nec, no pro salutatus principes. Mea vivendo eloquentiam voluptatibus at. Esse veniam deterruisset at est, malis putent periculis ad usu. Has facer utamur ea. Enim soleat qualisque ex mel, in nec hinc democritum. Ex solum homero qui, ea vix quis aliquid invidunt, commodo quaerendum eum ex.\n" +
"\nLorem ipsum dolor sit amet, at vidit platonem rationibus eum, ad summo graece regione nec, no pro salutatus principes. Mea vivendo eloquentiam voluptatibus at. Esse veniam deterruisset at est, malis putent periculis ad usu. Has facer utamur ea. Enim soleat qualisque ex mel, in nec hinc democritum. Ex solum homero qui, ea vix quis aliquid invidunt, commodo quaerendum eum ex. Has facer utamur ea. Enim soleat qualisque ex mel, in nec hinc democritum. Ex solum homero qui, ea vix quis aliquid invidunt, commodo quaerendum eum ex.\n" +
"[/size]\n" +
"[/columns]\n" +
"[size=3][FONT=Gabriola][color=BLACK]Bio Format by:[/COLOR][/FONT] [url=http://flightrising.com/main.php?p=lair&tab=userpage&id=215765][FONT=Gabriola]CityTurtle[/FONT][/url][/size]";
        
        return bio;
    }
}