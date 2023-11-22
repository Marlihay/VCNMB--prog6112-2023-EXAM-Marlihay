/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estateagentreport2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class EstateAgentGUI extends javax.swing.JFrame {

    /**
     * Creates new form EstateAgentGUI
     */
    public EstateAgentGUI() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        locationLabel = new javax.swing.JLabel();
        AgentNameLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        CommissionLabel = new javax.swing.JLabel();
        Reportlabel = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        PriceInput = new javax.swing.JTextField();
        CommissionInput = new javax.swing.JTextField();
        locationInput = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrintReport = new javax.swing.JList<>();
        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        exitApp = new javax.swing.JMenuItem();
        tools = new javax.swing.JMenu();
        processReport = new javax.swing.JMenuItem();
        clearReport = new javax.swing.JMenuItem();
        saveReport = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        locationLabel.setText("AGENT LOCATION:");

        AgentNameLabel.setText("ESTATE AGENT NAME:");

        PriceLabel.setText("PROPERTY PRICE:");

        CommissionLabel.setText("COMMISSION PERCENTAGE:");

        Reportlabel.setText("ESTATE AGENT REPORT:");

        CommissionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommissionInputActionPerformed(evt);
            }
        });

        locationInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));

        jScrollPane1.setViewportView(PrintReport);

        File.setText("File");

        exitApp.setText("Exit");
        exitApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAppActionPerformed(evt);
            }
        });
        File.add(exitApp);

        jMenuBar1.add(File);

        tools.setText("Tools");

        processReport.setText("Process Report");
        processReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReportActionPerformed(evt);
            }
        });
        tools.add(processReport);

        clearReport.setText("Clear");
        clearReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearReportActionPerformed(evt);
            }
        });
        tools.add(clearReport);

        saveReport.setText("Save Report");
        saveReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveReportActionPerformed(evt);
            }
        });
        tools.add(saveReport);

        jMenuBar1.add(tools);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgentNameLabel)
                                    .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CommissionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameInput)
                            .addComponent(CommissionInput)
                            .addComponent(PriceInput)
                            .addComponent(locationInput, 0, 166, Short.MAX_VALUE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reportlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgentNameLabel)
                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(locationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabel)
                    .addComponent(PriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommissionLabel)
                    .addComponent(CommissionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reportlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CommissionInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommissionInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommissionInputActionPerformed

    private void processReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReportActionPerformed
   

    // Call the method to generate and display the report
      DisplayReport();
    }//GEN-LAST:event_processReportActionPerformed

    private void saveReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveReportActionPerformed
        DefaultListModel<String> listModel = (DefaultListModel<String>) PrintReport.getModel();

    // Call the method to save the report to a file
    saveReport(listModel);
    }//GEN-LAST:event_saveReportActionPerformed

    private void exitAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAppActionPerformed
       int dialogButton = JOptionPane.YES_NO_OPTION;
       int dialogResults = JOptionPane.showConfirmDialog(null, "Would you like to save?", "Warnning", dialogButton);
       
       if(dialogResults == JOptionPane.YES_OPTION)
       {
       System.exit(0);
       }    //to exit the program
       
    }//GEN-LAST:event_exitAppActionPerformed

    private void clearReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearReportActionPerformed
     clearText(); //call the method to clear text fields
    }//GEN-LAST:event_clearReportActionPerformed


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
            java.util.logging.Logger.getLogger(EstateAgentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstateAgentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstateAgentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstateAgentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstateAgentGUI().setVisible(true);
            }
        });
    }
    private void clearText() {
        NameInput.setText(""); // clear name field
        locationInput.setSelectedIndex(0); //clear set location
        PriceInput.setText(""); // clear price field
        CommissionInput.setText(""); // clear commission field
         // Clear List
    DefaultListModel<String> listModel = (DefaultListModel<String>) PrintReport.getModel();
    listModel.clear();
   
}      
  private void DisplayReport() {
// Validate data using the EstateAgent class 
    EstateAgent estateAgent = new EstateAgent();
    String name = NameInput.getText();
    String location = (String) locationInput.getSelectedItem();
    String priceStr = PriceInput.getText();
    String commissionStr = CommissionInput.getText();

    agentInformation info = new agentInformation(location, name, Double.parseDouble(priceStr), Double.parseDouble(commissionStr));

    if (estateAgent.ValidateData(info)) {
        // If the data is valid do the commission calculation
        double earnedCommission = estateAgent.CalculateCommission(info.getPropertyPrice(), info.getAgentCommission());


        // Create the report string
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("AGENT LOCATION: " + location);
        listModel.addElement("AGENT NAME: " + name);
        listModel.addElement("PROPERTY PRICE: R" + info.getPropertyPrice());
        listModel.addElement("COMMISSION PERCENTAGE: " + info.getAgentCommission() + "%");
        
        listModel.addElement("CALCULATED COMMISSION: R" + earnedCommission);

        // Set the model for your JList
        PrintReport.setModel(listModel);
    } else {
        // if the data is not valid an error message will appear
        JOptionPane.showMessageDialog(this, "Invalid data. Please make sure that your inputs are above 0.", "Error", JOptionPane.ERROR_MESSAGE);
    }}
  private void saveReport(DefaultListModel<String> listModel) {
    // Create a StringBuilder to store the report content
    StringBuilder reportContent = new StringBuilder();

    // go through the elements in the list and add to StringBuilder
    for (int i = 0; i < listModel.size(); i++) {
        reportContent.append(listModel.get(i)).append("\n");
    }

    // Save the report to a text file named report.txt
    try (PrintWriter writer = new PrintWriter("report.txt")) {
        writer.print(reportContent.toString());
        JOptionPane.showMessageDialog(this, "Report saved successfully.", "Save Report", JOptionPane.INFORMATION_MESSAGE);
    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "There was an error saving this report " + e.getMessage(), "Save Report Error", JOptionPane.ERROR_MESSAGE);
    }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgentNameLabel;
    private javax.swing.JTextField CommissionInput;
    private javax.swing.JLabel CommissionLabel;
    private javax.swing.JMenu File;
    private javax.swing.JTextField NameInput;
    private javax.swing.JTextField PriceInput;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JList<String> PrintReport;
    private javax.swing.JLabel Reportlabel;
    private javax.swing.JMenuItem clearReport;
    private javax.swing.JMenuItem exitApp;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> locationInput;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JMenuItem processReport;
    private javax.swing.JMenuItem saveReport;
    private javax.swing.JMenu tools;
    // End of variables declaration//GEN-END:variables
}
 //Farrell, J. (2019). Java programming. Boston: Cengage.
//www.youtube.com. VCSOIT. (2020). PROG6112 LU1-LU6