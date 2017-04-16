/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal_cool_ator;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import static java.lang.Boolean.TRUE;
/**
 *
 * @author Matúš Švancár
 *         Marek Šalgovič
 *         Kuba Šimurda
 */
public class gui extends javax.swing.JFrame {

    double numfirst;
    double numsecond;
    double result;
    String operations;
    boolean zeroflag = true;   
    DecimalFormat f = new DecimalFormat("0.##########");
    
    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
        setIcon();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        root = new javax.swing.JButton();
        power = new javax.swing.JButton();
        add = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        div = new javax.swing.JButton();
        neg = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        point = new javax.swing.JButton();
        eq = new javax.swing.JButton();
        factorial = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0 ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        clear.setText("C");
        clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clear.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        root.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        root.setText("sqrt");
        root.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        root.setMargin(new java.awt.Insets(0, 0, 0, 0));
        root.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        power.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        power.setText("^");
        power.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        power.setMargin(new java.awt.Insets(0, 0, 0, 0));
        power.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        add.setText("+");
        add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add.setMargin(new java.awt.Insets(0, 0, 0, 0));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        seven.setText("7");
        seven.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        seven.setMargin(new java.awt.Insets(0, 0, 0, 0));
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        eight.setText("8");
        eight.setToolTipText("");
        eight.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        eight.setMargin(new java.awt.Insets(0, 0, 0, 0));
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        nine.setText("9");
        nine.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nine.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        sub.setText("-");
        sub.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        four.setText("4");
        four.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        four.setMargin(new java.awt.Insets(0, 0, 0, 0));
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        five.setText("5");
        five.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        five.setMargin(new java.awt.Insets(0, 0, 0, 0));
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        six.setText("6");
        six.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        six.setMargin(new java.awt.Insets(0, 0, 0, 0));
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        mul.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        mul.setText("x");
        mul.setToolTipText("");
        mul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mul.setMargin(new java.awt.Insets(0, 0, 0, 0));
        mul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        one.setText("1");
        one.setToolTipText("");
        one.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        one.setMargin(new java.awt.Insets(0, 0, 0, 0));
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        two.setText("2");
        two.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        two.setMargin(new java.awt.Insets(0, 0, 0, 0));
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        three.setText("3");
        three.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        three.setMargin(new java.awt.Insets(0, 0, 0, 0));
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        div.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        div.setText("÷");
        div.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        div.setMargin(new java.awt.Insets(0, 0, 0, 0));
        div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        neg.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        neg.setText("+/-");
        neg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        neg.setMargin(new java.awt.Insets(0, 0, 0, 0));
        neg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        zero.setText("0");
        zero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        zero.setMargin(new java.awt.Insets(0, 0, 0, 0));
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        point.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        point.setText(".");
        point.setToolTipText("");
        point.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        point.setMargin(new java.awt.Insets(0, 0, 0, 0));
        point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        eq.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        eq.setText("=");
        eq.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        eq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        eq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        eq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqActionPerformed(evt);
            }
        });

        factorial.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        factorial.setText("!");
        factorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        factorial.setMargin(new java.awt.Insets(0, 0, 0, 0));
        factorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                factorialfarba(evt);
            }
        });
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(four, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(one, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(neg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(eq, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(neg, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, 0)
                .addComponent(eq, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         jTextField2.setText("");
    }//GEN-LAST:event_clearActionPerformed
         
    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + seven.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_sevenActionPerformed
    
    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + four.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_fourActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + six.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_sixActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + one.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_oneActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + three.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_threeActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + two.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_twoActionPerformed

    private void negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negActionPerformed
        Double ops = Double.parseDouble(String.valueOf(jTextField2.getText()));
        ops = ops * (-1);
        jTextField2.setText(String.valueOf(ops));
        
    }//GEN-LAST:event_negActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + zero.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_zeroActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("0");
        }
        String Writenum = jTextField2.getText() + point.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_pointActionPerformed

    private void farba(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_farba
      
    }//GEN-LAST:event_farba

    private void factorialfarba(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factorialfarba
        // TODO add your handling code here:
    }//GEN-LAST:event_factorialfarba

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + nine.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_nineActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + eight.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_eightActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
        }
        String Writenum = jTextField2.getText() + five.getText();
        jTextField2.setText(Writenum);
    }//GEN-LAST:event_fiveActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        numfirst = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        operations="+"; 
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        numfirst = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        operations="-"; 
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        numfirst = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        operations="*"; 
    }//GEN-LAST:event_mulActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        numfirst = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        operations="/"; 
    }//GEN-LAST:event_divActionPerformed

    private void eqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqActionPerformed
        String ans;
        numsecond = Double.parseDouble(jTextField2.getText());
        DecimalFormat f = new DecimalFormat("0.#########");
        

        switch(operations){
            case "+":
                result = CalCoolAtor.add(numfirst,numsecond);
                ans = f.format(result);
                jTextField2.setText(ans);
                break;
            case "-":
                result = CalCoolAtor.sub(numfirst, numsecond);
                ans = f.format(result);
                jTextField2.setText(ans);
                break;
            case "*":
                result = CalCoolAtor.multiply(numfirst, numsecond);
                ans = f.format(result);
                jTextField2.setText(ans);
                break;
            case "/":
                result = CalCoolAtor.divide(numfirst, numsecond);
                ans = f.format(result);
                jTextField2.setText(ans);
                break;
            case "^":
                result = CalCoolAtor.power(numfirst, numsecond);
                ans = f.format(result);
                jTextField2.setText(ans);
                break;    

    }//GEN-LAST:event_eqActionPerformed
    }
    
    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        String ans;
        numfirst = Integer.parseInt(jTextField2.getText());
        long resultF = CalCoolAtor.factorial((int) numfirst);
        ans = String.format("%d", resultF);   
        jTextField2.setText(ans);
    }//GEN-LAST:event_factActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
        String ans;
        numfirst = Double.parseDouble(jTextField2.getText());
        result = CalCoolAtor.root(numfirst);
        ans = f.format(result);
        jTextField2.setText(ans);
    }//GEN-LAST:event_rootActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
          char letter = evt.getKeyChar();
          if (jTextField2.getText().equals("0 ")){
            jTextField2.setText("");
          }   
          if (!(Character.isDigit(letter) || letter==KeyEvent.VK_BACK_SPACE || letter==KeyEvent.VK_DELETE)){
              getToolkit().beep();
              evt.consume();
          }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        numfirst = Double.parseDouble(jTextField2.getText());
        jTextField2.setText("");
        operations="^";
    }//GEN-LAST:event_powerActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton div;
    private javax.swing.JButton eight;
    private javax.swing.JButton eq;
    private javax.swing.JButton factorial;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton mul;
    private javax.swing.JButton neg;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton point;
    private javax.swing.JButton power;
    private javax.swing.JButton root;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sub;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
