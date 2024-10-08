/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author dasun
 */
public class ManagerDashboard extends javax.swing.JFrame {

    /**
     * Creates new form productionManager
     */
    public ManagerDashboard() {
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

        logo1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();
        btnAddSalary = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        btnAddOrder = new javax.swing.JButton();
        btnAddIssuingDetails = new javax.swing.JButton();
        btnAddSales = new javax.swing.JButton();
        btnProductDetails = new javax.swing.JButton();
        btnAddTransportation = new javax.swing.JButton();
        btnIssuingDetails = new javax.swing.JButton();
        btnEmployeeDetails = new javax.swing.JButton();
        btnSalesDetails = new javax.swing.JButton();
        btnSalaryDetails = new javax.swing.JButton();
        btnTransportationDetails = new javax.swing.JButton();
        btnOrderDetails = new javax.swing.JButton();
        btnAddIngredients = new javax.swing.JButton();
        btnIngredientsDetails = new javax.swing.JButton();
        btnProcessDetails = new javax.swing.JButton();
        btnManageProcess = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ISP logo.JPG"))); // NOI18N

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                Login login = new Login();
                login.setVisible(true);
            }
        });

        btnAddEmployee.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                AddEmployee addEmployee = new AddEmployee();
                addEmployee.page="Manager";
                addEmployee.setVisible(true);
            }
        });

        btnAddSalary.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddSalary.setText("Add Salary");
        btnAddSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                AddSalary addSalary = new AddSalary();
                addSalary.page="Manager";
                addSalary.setVisible(true);
            }
        });

        btnAddProduct.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnAddOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddOrder.setText("Add Order");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnAddIssuingDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddIssuingDetails.setText("Add Issuing Details");
        btnAddIssuingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIssuingDetailsActionPerformed(evt);
            }
        });

        btnAddSales.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddSales.setText("Add Sales ");
        btnAddSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSalesActionPerformed(evt);
            }
        });

        btnProductDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnProductDetails.setText("Product Details");
        btnProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductDetailsActionPerformed(evt);
            }
        });

        btnAddTransportation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddTransportation.setText("Add Transportation ");
        btnAddTransportation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransportationActionPerformed(evt);
            }
        });

        btnIssuingDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnIssuingDetails.setText("Issuing Details");
        btnIssuingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssuingDetailsActionPerformed(evt);
            }
        });

        btnEmployeeDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEmployeeDetails.setText("Employee Details");
        btnEmployeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                EmpDetails empDetails = new EmpDetails();
                empDetails.page="Manager";
                empDetails.setVisible(true);
            }
        });

        btnSalesDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSalesDetails.setText("Sales Details");
        btnSalesDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesDetailsActionPerformed(evt);
            }
        });

        btnSalaryDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSalaryDetails.setText("Salary Details");
        btnSalaryDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                SalaryDetails salaryDetails = new SalaryDetails();
                salaryDetails.page="Manager";
                salaryDetails.setVisible(true);
            }
        });

        btnTransportationDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTransportationDetails.setText("Transportation Details");
        btnTransportationDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportationDetailsActionPerformed(evt);
            }
        });

        btnOrderDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOrderDetails.setText("Order Details");
        btnOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailsActionPerformed(evt);
            }
        });

        btnAddIngredients.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddIngredients.setText("Add Ingredients");
        btnAddIngredients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIngredientsActionPerformed(evt);
            }
        });

        btnIngredientsDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnIngredientsDetails.setText("Ingredients Details");
        btnIngredientsDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngredientsDetailsActionPerformed(evt);
            }
        });

        btnProcessDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnProcessDetails.setText("Process Details");
        btnProcessDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessDetailsActionPerformed(evt);
            }
        });

        btnManageProcess.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageProcess.setText("Manage Process ");
        btnManageProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProcessActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setText("Ceylanica Bio Produvts (Pvt) Ltd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddIssuingDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAddIngredients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddTransportation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIngredientsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalaryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIssuingDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalesDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransportationDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnProcessDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEmployeeDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(logo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLogout)))
                        .addGap(9, 9, 9)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSales)
                    .addComponent(btnProductDetails)
                    .addComponent(btnAddEmployee))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTransportation)
                    .addComponent(btnIssuingDetails)
                    .addComponent(btnAddSalary))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalesDetails)
                    .addComponent(btnAddProduct)
                    .addComponent(btnAddIngredients))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransportationDetails)
                    .addComponent(btnAddOrder)
                    .addComponent(btnSalaryDetails))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderDetails)
                    .addComponent(btnAddIssuingDetails)
                    .addComponent(btnEmployeeDetails))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessDetails)
                    .addComponent(btnIngredientsDetails)
                    .addComponent(btnManageProcess))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnAddSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSalaryActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnAddIssuingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIssuingDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddIssuingDetailsActionPerformed

    private void btnAddSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSalesActionPerformed

    private void btnProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductDetailsActionPerformed

    private void btnAddTransportationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransportationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTransportationActionPerformed

    private void btnIssuingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssuingDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIssuingDetailsActionPerformed

    private void btnEmployeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeDetailsActionPerformed

    private void btnSalesDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalesDetailsActionPerformed

    private void btnSalaryDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalaryDetailsActionPerformed

    private void btnTransportationDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportationDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransportationDetailsActionPerformed

    private void btnOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderDetailsActionPerformed

    private void btnAddIngredientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIngredientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddIngredientsActionPerformed

    private void btnIngredientsDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngredientsDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngredientsDetailsActionPerformed

    private void btnProcessDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcessDetailsActionPerformed

    private void btnManageProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageProcessActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnAddIngredients;
    private javax.swing.JButton btnAddIssuingDetails;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnAddSalary;
    private javax.swing.JButton btnAddSales;
    private javax.swing.JButton btnAddTransportation;
    private javax.swing.JButton btnEmployeeDetails;
    private javax.swing.JButton btnIngredientsDetails;
    private javax.swing.JButton btnIssuingDetails;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageProcess;
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JButton btnProcessDetails;
    private javax.swing.JButton btnProductDetails;
    private javax.swing.JButton btnSalaryDetails;
    private javax.swing.JButton btnSalesDetails;
    private javax.swing.JButton btnTransportationDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables
}
