package calculadora;

public class Interfaz extends javax.swing.JFrame {

    String n1;
    String signo;

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bMenosUnitario = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bPunto = new javax.swing.JButton();
        bMas = new javax.swing.JButton();
        bMenos = new javax.swing.JButton();
        bMult = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        bCE = new javax.swing.JButton();
        bInversa = new javax.swing.JButton();
        bIgual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b7.setBackground(new java.awt.Color(0, 204, 204));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(102, 0, 204));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(204, 0, 102));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bMenosUnitario.setBackground(new java.awt.Color(0, 0, 0));
        bMenosUnitario.setForeground(new java.awt.Color(255, 255, 255));
        bMenosUnitario.setText("+/-");
        bMenosUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosUnitarioActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(0, 153, 204));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(204, 0, 204));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 0, 0));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(255, 204, 0));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(0, 51, 204));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(204, 0, 153));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(204, 102, 0));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bPunto.setBackground(new java.awt.Color(0, 0, 0));
        bPunto.setForeground(new java.awt.Color(255, 255, 255));
        bPunto.setText(".");
        bPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPuntoActionPerformed(evt);
            }
        });

        bMas.setForeground(new java.awt.Color(0, 204, 255));
        bMas.setText("+");
        bMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasActionPerformed(evt);
            }
        });

        bMenos.setForeground(new java.awt.Color(0, 51, 255));
        bMenos.setText("-");
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });

        bMult.setForeground(new java.awt.Color(153, 0, 204));
        bMult.setText("*");
        bMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultActionPerformed(evt);
            }
        });

        bDiv.setForeground(new java.awt.Color(255, 0, 153));
        bDiv.setText("/");
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });

        bC.setForeground(new java.awt.Color(0, 204, 204));
        bC.setText("<-");
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        bCE.setForeground(new java.awt.Color(51, 0, 204));
        bCE.setText("CE");
        bCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCEActionPerformed(evt);
            }
        });

        bInversa.setForeground(new java.awt.Color(153, 0, 153));
        bInversa.setText("1/x");
        bInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInversaActionPerformed(evt);
            }
        });

        bIgual.setForeground(new java.awt.Color(255, 0, 153));
        bIgual.setText("=");
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });

        jLabel1.setText("HOOGENBERG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMenosUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMult, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bInversa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bMenosUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bMas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bMult, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bInversa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // numericos
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "0");
    }//GEN-LAST:event_b0ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "9");
    }//GEN-LAST:event_b9ActionPerformed
    // aritmeticos
    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        if (txtPantalla.getText().length() != 0 ) {
            n1 = txtPantalla.getText();
            signo = "+";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_bMasActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        if (txtPantalla.getText().length() != 0 ) {
            n1 = txtPantalla.getText();
            signo = "-";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_bMenosActionPerformed

    private void bMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultActionPerformed
       if (txtPantalla.getText().length() != 0 ) {
            n1 = txtPantalla.getText();
            signo = "*";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_bMultActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        if (txtPantalla.getText().length() != 0 ) {
            n1 = txtPantalla.getText();
            signo = "/";
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_bDivActionPerformed

    private void bPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPuntoActionPerformed
        if (txtPantalla.getText().length() == 0 ) {
            txtPantalla.setText("0.");
        }else{
            if (!txtPantalla.getText().contains(".")) {
                txtPantalla.setText(txtPantalla.getText()+ ".");
            } 
        }
    }//GEN-LAST:event_bPuntoActionPerformed

    private void bMenosUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosUnitarioActionPerformed
        if (txtPantalla.getText().length() != 0 ) {
            txtPantalla.setText(String.valueOf(-1*Float.parseFloat(txtPantalla.getText())));
        } 
    }//GEN-LAST:event_bMenosUnitarioActionPerformed

    private void bInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInversaActionPerformed
        if (txtPantalla.getText().length() != 0 ) {
            txtPantalla.setText(String.valueOf(1/Float.parseFloat(txtPantalla.getText())));
        } 
    }//GEN-LAST:event_bInversaActionPerformed

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        if (txtPantalla.getText().length() != 0 ) {
            String n2 = txtPantalla.getText();
            switch(signo){
                case "+":
                    txtPantalla.setText(String.valueOf(Float.parseFloat(n1)+Float.parseFloat(n2)));
                    break;
                case "-":
                    txtPantalla.setText(String.valueOf(Float.parseFloat(n1)-Float.parseFloat(n2)));
                    break;
                case "/":
                    txtPantalla.setText(String.valueOf(Float.parseFloat(n1)/Float.parseFloat(n2)));
                    break;
                case "*":
                    txtPantalla.setText(String.valueOf(Float.parseFloat(n1)*Float.parseFloat(n2)));
                    break;
                    
            }
        }
    }//GEN-LAST:event_bIgualActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        if (txtPantalla.getText().length() != 0 ) {
            txtPantalla.setText(txtPantalla.getText().substring(0, txtPantalla.getText().length() - 1));
        } 
    }//GEN-LAST:event_bCActionPerformed

    private void bCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCEActionPerformed
        txtPantalla.setText("");
    }//GEN-LAST:event_bCEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bC;
    private javax.swing.JButton bCE;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bInversa;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton bMenosUnitario;
    private javax.swing.JButton bMult;
    private javax.swing.JButton bPunto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
