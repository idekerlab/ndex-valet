/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cytoscape.cyndex2.internal.ui.swing;

import javax.swing.DefaultComboBoxModel;

import org.cytoscape.cyndex2.internal.util.CxPreferences;
/**
 *
 * @author wilderkrieger
 */
public class PreferencesPanel extends javax.swing.JPanel {

    private boolean viewThresholdPropertyChanged = false;
    private boolean createViewPropertyChanged = false;
    private boolean applyLayoutPropertyChanged = false;
    private boolean largeLayoutThresholdPropertyChanged = false;
    
    public void applyChanges() {
        if (viewThresholdPropertyChanged) {
        	CxPreferences.setViewThreshold((Integer)viewThresholdSpinner.getValue());
        }
        if (createViewPropertyChanged) {
        	CxPreferences.setCreateView((CxPreferences.CreateViewEnum)createViewComboBox.getModel().getSelectedItem());
        }
        if (applyLayoutPropertyChanged) {
        	CxPreferences.setApplyLayout((CxPreferences.ApplyLayoutEnum)applyLayoutComboBox.getModel().getSelectedItem());
        }
        if (largeLayoutThresholdPropertyChanged) {
        	CxPreferences.setLargeLayoutThreshold((Integer)largeLayoutThresholdSpinner.getValue());
        }
    }
    /**
     * Creates new form PreferencesPanel
     */
    public PreferencesPanel() {
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

        createViewComboBox = new javax.swing.JComboBox<>();
        viewCreationLabel = new javax.swing.JLabel();
        viewCreationThresholdLabel = new javax.swing.JLabel();
        applyLayoutComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewThresholdSpinner = new javax.swing.JSpinner();
        largeLayoutThresholdSpinner = new javax.swing.JSpinner();

        createViewComboBox.setModel(new DefaultComboBoxModel(CxPreferences.CreateViewEnum.values()));
        createViewComboBox.setSelectedItem(CxPreferences.getCreateView());
        createViewComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createViewComboBoxActionPerformed(evt);
            }
        });

        viewCreationLabel.setText("View Creation");

        viewCreationThresholdLabel.setText("View Creation Threshold");

        applyLayoutComboBox.setModel(new DefaultComboBoxModel(CxPreferences.ApplyLayoutEnum.values()));
        applyLayoutComboBox.setSelectedItem(CxPreferences.getApplyLayout());
        applyLayoutComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyLayoutComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Layout Application");

        jLabel2.setText("Large Layout Threshold");
        jLabel2.setToolTipText("");

        viewThresholdSpinner.setModel(new javax.swing.SpinnerNumberModel(1000, 1, null, 1000));
        viewThresholdSpinner.setValue(CxPreferences.getViewThreshold());
        viewThresholdSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ViewThresholdChangeHandler(evt);
            }
        });

        largeLayoutThresholdSpinner.setModel(new javax.swing.SpinnerNumberModel(1000, 1, null, 1000));
        largeLayoutThresholdSpinner.setValue(CxPreferences.getLargeLayoutThreshold());
        largeLayoutThresholdSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LargeLayoutThresholdChangeHandler(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewCreationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(createViewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(viewCreationThresholdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(applyLayoutComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewThresholdSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(largeLayoutThresholdSpinner))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createViewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCreationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCreationThresholdLabel)
                    .addComponent(viewThresholdSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(applyLayoutComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(largeLayoutThresholdSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void applyLayoutComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyLayoutComboBoxActionPerformed
        applyLayoutPropertyChanged = true;
    }//GEN-LAST:event_applyLayoutComboBoxActionPerformed

    private void createViewComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createViewComboBoxActionPerformed
       createViewPropertyChanged = true;
    }//GEN-LAST:event_createViewComboBoxActionPerformed

    private void ViewThresholdChangeHandler(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ViewThresholdChangeHandler
       viewThresholdPropertyChanged = true;
    }//GEN-LAST:event_ViewThresholdChangeHandler

    private void LargeLayoutThresholdChangeHandler(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LargeLayoutThresholdChangeHandler
       largeLayoutThresholdPropertyChanged = true;
    }//GEN-LAST:event_LargeLayoutThresholdChangeHandler


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> applyLayoutComboBox;
    private javax.swing.JComboBox<String> createViewComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner largeLayoutThresholdSpinner;
    private javax.swing.JLabel viewCreationLabel;
    private javax.swing.JLabel viewCreationThresholdLabel;
    private javax.swing.JSpinner viewThresholdSpinner;
    // End of variables declaration//GEN-END:variables
}
