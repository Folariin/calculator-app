import java.awt.*;

class CalculatorUI extends javax.swing.JFrame {
    private javax.swing.JButton bu0;
    private javax.swing.JButton bu1;
    private javax.swing.JButton bu2;
    private javax.swing.JButton bu3;
    private javax.swing.JButton bu4;
    private javax.swing.JButton bu5;
    private javax.swing.JButton bu6;
    private javax.swing.JButton bu7;
    private javax.swing.JButton bu8;
    private javax.swing.JButton bu9;
    private javax.swing.JButton buadd;
    private javax.swing.JButton buans;
    private javax.swing.JButton buc;
    private javax.swing.JButton budel;
    private javax.swing.JButton budivision;
    private javax.swing.JButton budot;
    private javax.swing.JButton bumultiply;
    private javax.swing.JButton busub;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel label;
    private javax.swing.JTextField tf;
    private String operator = null;
    private double number1 = 0, number2 = 0;

    public CalculatorUI() {
        initComponents();
        buans.setBackground(Color.yellow);
        bu1.setBackground(Color.black);
        bu1.setForeground(Color.white);
        bu2.setBackground(Color.black);
        bu2.setForeground(Color.white);
        bu3.setBackground(Color.black);
        bu3.setForeground(Color.white);
        bu4.setBackground(Color.black);
        bu4.setForeground(Color.white);
        bu5.setBackground(Color.black);
        bu5.setForeground(Color.white);
        bu6.setBackground(Color.black);
        bu6.setForeground(Color.white);
        bu7.setBackground(Color.black);
        bu7.setForeground(Color.white);
        bu8.setBackground(Color.black);
        bu8.setForeground(Color.white);
        bu9.setBackground(Color.black);
        bu9.setForeground(Color.white);
        bu0.setBackground(Color.black);
        bu0.setForeground(Color.white);

        buadd.setBackground(Color.gray);
        buadd.setForeground(Color.white);
        busub.setBackground(Color.gray);
        busub.setForeground(Color.white);
        bumultiply.setBackground(Color.gray);
        bumultiply.setForeground(Color.white);
        budivision.setBackground(Color.gray);
        budivision.setForeground(Color.white);
        label.setForeground(Color.gray);

        budel.setBackground(Color.darkGray);
        budel.setForeground(Color.white);
        buc.setBackground(Color.darkGray);
        buc.setForeground(Color.white);

        budot.setBackground(Color.orange);
        budot.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton14 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        buadd = new javax.swing.JButton();
        buans = new javax.swing.JButton();
        bu9 = new javax.swing.JButton();
        bu8 = new javax.swing.JButton();
        bu7 = new javax.swing.JButton();
        bu4 = new javax.swing.JButton();
        bu5 = new javax.swing.JButton();
        bu6 = new javax.swing.JButton();
        bu3 = new javax.swing.JButton();
        bu1 = new javax.swing.JButton();
        bu2 = new javax.swing.JButton();
        budot = new javax.swing.JButton();
        budel = new javax.swing.JButton();
        buc = new javax.swing.JButton();
        bu0 = new javax.swing.JButton();
        busub = new javax.swing.JButton();
        bumultiply = new javax.swing.JButton();
        budivision = new javax.swing.JButton();

        jButton14.setText("0");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("CALCULATOR");

        tf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        buadd.setText("+");
        buadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buaddActionPerformed(evt);
            }
        });

        buans.setText("ANS");
        buans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buansActionPerformed(evt);
            }
        });

        bu9.setText("9");
        bu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu9ActionPerformed(evt);
            }
        });

        bu8.setText("8");
        bu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu8ActionPerformed(evt);
            }
        });

        bu7.setText("7");
        bu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu7ActionPerformed(evt);
            }
        });

        bu4.setText("4");
        bu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu4ActionPerformed(evt);
            }
        });

        bu5.setText("5");
        bu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu5ActionPerformed(evt);
            }
        });

        bu6.setText("6");
        bu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu6ActionPerformed(evt);
            }
        });

        bu3.setText("3");
        bu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu3ActionPerformed(evt);
            }
        });

        bu1.setText("1");
        bu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu1ActionPerformed(evt);
            }
        });

        bu2.setText("2");
        bu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu2ActionPerformed(evt);
            }
        });

        budot.setText(".");
        budot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budotActionPerformed(evt);
            }
        });

        budel.setText("DEL");
        budel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budelActionPerformed(evt);
            }
        });

        buc.setText("C");
        buc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bucActionPerformed(evt);
            }
        });

        bu0.setText("0");
        bu0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu0ActionPerformed(evt);
            }
        });

        busub.setText("-");
        busub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busubActionPerformed(evt);
            }
        });

        bumultiply.setText("*");
        bumultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bumultiplyActionPerformed(evt);
            }
        });

        budivision.setText("/");
        budivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(budel, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buc, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(busub, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bumultiply, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(budivision, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(bu7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bu4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bu1, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(bu8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bu5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bu2, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(bu0, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(bu9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bu6, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buadd, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bu3, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(budot, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buans, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(15, Short.MAX_VALUE))
                        .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(budel, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buc, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16,
                                                        Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(buadd,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                layout.createSequentialGroup()
                                                                                        .addGroup(layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(bu9,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        45,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(bu8,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        45,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(bu7,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        45,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(bu6,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        45,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(bu5,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        45,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(bu4,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        45,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(buans,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                102,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(bu2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(bu1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(bu3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false)
                                                                                        .addComponent(budot,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(bu0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(busub,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 67,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bumultiply,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(budivision,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 71,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(label)
                                .addContainerGap()));

        pack();
    }// </editor-fold>

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void bu1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "1");
    }

    private void bu9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "9");
    }

    private void bu2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "2");
    }

    private void bu3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "3");
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void bu4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "4");
    }

    private void bu6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "6");
    }

    private void bucActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String s = tf.getText();
        tf.setText(s.substring(0, s.length() - 1));
    }

    private void bu5ActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText(tf.getText() + "5"); // TODO add your handling code here:
    }

    private void bu0ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "0");
    }

    private void bu7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "7");
    }

    private void bu8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + "8");
    }

    private void budotActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText(tf.getText() + ".");
    }

    private void buansActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            CalculatorLogic model = new CalculatorLogic();
            model.setNumber1(number1); // Assuming number1 is set elsewhere
            number2 = Double.parseDouble(tf.getText());
            model.setNumber2(number2);
            model.setOperator(operator);
    
            double result = model.calculate();
            tf.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            tf.setText("Invalid input");
        } catch (ArithmeticException e) {
            tf.setText(e.getMessage());
        } finally {
            operator = null;
        }
    }

    private void buaddActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        number1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator = "+";

    }

    private void busubActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        number1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator = "-";
    }

    private void bumultiplyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        number1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator = "*";
    }

    private void budivisionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        number1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator = "/";
    }

    private void budelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        tf.setText("");
    }
}