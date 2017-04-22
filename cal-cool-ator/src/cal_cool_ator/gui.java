/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal_cool_ator;

import com.sun.prism.paint.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import static java.lang.Boolean.TRUE;
import java.util.Locale;
/**
 * @author Matúš Švancár
 * @author Marek Šalgovič
 * @author Kuba Šimurda
 * @author Martin Rakovický
 */
public class gui extends javax.swing.JFrame {
    boolean chyba = false;
    double numfirst;
    double numsecond;
    double result = 0;
    long resultF = 0;
    String nega;
    static String s;
    static int index;
    static double dsect;
    String operations= "0";
    boolean zeroflag = true;
    boolean OPflag = false;
    //long podmienka = 99999999999999;
    DecimalFormat fo = new DecimalFormat("0.##########");
    boolean resultFlag = false;
    /**
     * Creates new form gui
     */
    public void cisti(){
        if (jTextField2.getText().equals("0")){
            jTextField2.setText("");}
        if(result!=0){jTextField2.setText("");result=0;}
        if(resultF!=0){jTextField2.setText("");resultF=0;}
        debug();
    }
    
    /**
     * Change operation.
     */
    public void zmenaoperacie(){
        if(OPflag==true){
            jTextField2.setText("");
            OPflag=false;
        } 
    }
    
    /**
     * Sets the dimensions.
     */
    public void rozmery()
    { if(jTextField2.getText().length()>=15) {  
   jTextField2.setText(jTextField2.getText().substring(0, jTextField2.getText().length() - 1));
 }
    }
    
    /**
     * Check errors.
     */
   public void debug()
   {if(chyba==true)
       jTextField2.setText("");
       chyba=false;
   }
   
    /**
     * Reset display and memory.
     */
   public void clear(){
        jTextField2.setText("0");
        jTextField3.setText("");
        numsecond = 0;
        operations = "0";
   }
    
     /**
     * Returns String formatted for 15 character display. 
     * <p>
     * This method formats the input double number, returned String 
     * is max 15 characters long, if number exceeds that length it's
     * rounded to fit the display
     *
     * @param f {double}  floating point number you want to format
     * @return {String}   formatted String
     */
    public static String fmt(double f)
{
    if(f == (long) f)
        return String.format("%d",(long)f);
    else
        
        s = String.format(Locale.US,"%.14f",f);
        dsect = Double.parseDouble(s);
        index = s.indexOf('.');
        
        if(s.startsWith("-")){
            index = 14 - index;
            s = String.format(Locale.US,"%."+index+"f",dsect);}
        else{
            index = 13 - index;
            s = String.format(Locale.US,"%."+index+"f",dsect);}
        s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
        return s;
    
}
    
    /**
     * Initializes gui, loads icon, sets nonresizable and fixed dimensions.
     */
    public gui() {
        initComponents();
        setIcon();
        setResizable(false);
        setSize(606, 970);
        //jTextField2.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
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
        jTextField3 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.setFont(new java.awt.Font("Open Sans", 0, 67)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(30, 30, 30));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0");
        jTextField2.setAlignmentX(0.0F);
        jTextField2.setAlignmentY(0.0F);
        jTextField2.setAutoscrolls(false);
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jTextField2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField2.setPreferredSize(new java.awt.Dimension(550, 89));
        jTextField2.setSelectedTextColor(new java.awt.Color(26, 136, 197));
        jTextField2.setSelectionColor(new java.awt.Color(255, 255, 255));
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

        clear.setBackground(java.awt.Color.white);
        clear.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numc.jpg"))); // NOI18N
        clear.setActionCommand("c");
        clear.setAlignmentY(0.0F);
        clear.setBorder(null);
        clear.setBorderPainted(false);
        clear.setFocusable(false);
        clear.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clear.setPreferredSize(new java.awt.Dimension(29, 59));
        clear.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numc-hover.jpg"))); // NOI18N
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

        root.setBackground(java.awt.Color.white);
        root.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        root.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numsqrt.png"))); // NOI18N
        root.setToolTipText("");
        root.setAlignmentY(0.0F);
        root.setBorder(null);
        root.setBorderPainted(false);
        root.setFocusable(false);
        root.setMargin(new java.awt.Insets(0, 0, 0, 0));
        root.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numsqrt-hover.png"))); // NOI18N
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

        power.setBackground(new java.awt.Color(255, 255, 255));
        power.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numxn.png"))); // NOI18N
        power.setToolTipText("");
        power.setAlignmentY(0.0F);
        power.setBorder(null);
        power.setBorderPainted(false);
        power.setFocusable(false);
        power.setMargin(new java.awt.Insets(0, 0, 0, 0));
        power.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numxn-hover.png"))); // NOI18N
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

        add.setBackground(java.awt.Color.white);
        add.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num+.png"))); // NOI18N
        add.setAlignmentY(0.0F);
        add.setBorder(null);
        add.setBorderPainted(false);
        add.setFocusable(false);
        add.setMargin(new java.awt.Insets(0, 0, 0, 0));
        add.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num+-hover.png"))); // NOI18N
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

        seven.setBackground(java.awt.Color.white);
        seven.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num7.jpg"))); // NOI18N
        seven.setAlignmentY(0.0F);
        seven.setBorder(null);
        seven.setBorderPainted(false);
        seven.setFocusable(false);
        seven.setMargin(new java.awt.Insets(0, 0, 0, 0));
        seven.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num7-hover.jpg"))); // NOI18N
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

        eight.setBackground(java.awt.Color.white);
        eight.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num8.jpg"))); // NOI18N
        eight.setToolTipText("");
        eight.setAlignmentY(0.0F);
        eight.setBorder(null);
        eight.setBorderPainted(false);
        eight.setFocusable(false);
        eight.setMargin(new java.awt.Insets(0, 0, 0, 0));
        eight.setPreferredSize(new java.awt.Dimension(150, 130));
        eight.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num8-hover.jpg"))); // NOI18N
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

        nine.setBackground(java.awt.Color.white);
        nine.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num9.jpg"))); // NOI18N
        nine.setToolTipText("");
        nine.setActionCommand("9");
        nine.setAlignmentY(0.0F);
        nine.setBorder(null);
        nine.setBorderPainted(false);
        nine.setFocusable(false);
        nine.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nine.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num9-hover.jpg"))); // NOI18N
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

        sub.setBackground(java.awt.Color.white);
        sub.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num-.png"))); // NOI18N
        sub.setToolTipText("");
        sub.setAlignmentY(0.0F);
        sub.setBorder(null);
        sub.setBorderPainted(false);
        sub.setFocusable(false);
        sub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sub.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num--hover.png"))); // NOI18N
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

        four.setBackground(java.awt.Color.white);
        four.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num4.jpg"))); // NOI18N
        four.setAlignmentY(0.0F);
        four.setBorder(null);
        four.setBorderPainted(false);
        four.setFocusable(false);
        four.setMargin(new java.awt.Insets(0, 0, 0, 0));
        four.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num4-hover.jpg"))); // NOI18N
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

        five.setBackground(java.awt.Color.white);
        five.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num5.jpg"))); // NOI18N
        five.setAlignmentY(0.0F);
        five.setBorder(null);
        five.setBorderPainted(false);
        five.setFocusable(false);
        five.setMargin(new java.awt.Insets(0, 0, 0, 0));
        five.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num5-hover.jpg"))); // NOI18N
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

        six.setBackground(java.awt.Color.white);
        six.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num6.jpg"))); // NOI18N
        six.setAlignmentY(0.0F);
        six.setBorder(null);
        six.setBorderPainted(false);
        six.setFocusable(false);
        six.setMargin(new java.awt.Insets(0, 0, 0, 0));
        six.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num6-hover.jpg"))); // NOI18N
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

        mul.setBackground(java.awt.Color.white);
        mul.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        mul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numx.png"))); // NOI18N
        mul.setToolTipText("");
        mul.setAlignmentY(0.0F);
        mul.setBorder(null);
        mul.setBorderPainted(false);
        mul.setFocusable(false);
        mul.setMargin(new java.awt.Insets(0, 0, 0, 0));
        mul.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numx-hover.png"))); // NOI18N
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

        one.setBackground(java.awt.Color.white);
        one.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num1.jpg"))); // NOI18N
        one.setToolTipText("");
        one.setAlignmentY(0.0F);
        one.setBorder(null);
        one.setBorderPainted(false);
        one.setFocusable(false);
        one.setMargin(new java.awt.Insets(0, 0, 0, 0));
        one.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num1-hover.jpg"))); // NOI18N
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                farba(evt);
            }
        });
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(java.awt.Color.white);
        two.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num2.jpg"))); // NOI18N
        two.setAlignmentY(0.0F);
        two.setBorder(null);
        two.setBorderPainted(false);
        two.setFocusable(false);
        two.setMargin(new java.awt.Insets(0, 0, 0, 0));
        two.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num2-hover.jpg"))); // NOI18N
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

        three.setBackground(java.awt.Color.white);
        three.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num3.jpg"))); // NOI18N
        three.setAlignmentY(0.0F);
        three.setBorder(null);
        three.setBorderPainted(false);
        three.setFocusable(false);
        three.setMargin(new java.awt.Insets(0, 0, 0, 0));
        three.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num3-hover.jpg"))); // NOI18N
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

        div.setBackground(java.awt.Color.white);
        div.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numdiv.png"))); // NOI18N
        div.setAlignmentY(0.0F);
        div.setBorder(null);
        div.setBorderPainted(false);
        div.setFocusable(false);
        div.setMargin(new java.awt.Insets(0, 0, 0, 0));
        div.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numdiv-hover.png"))); // NOI18N
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

        neg.setBackground(java.awt.Color.white);
        neg.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        neg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num+-.png"))); // NOI18N
        neg.setAlignmentY(0.0F);
        neg.setBorder(null);
        neg.setBorderPainted(false);
        neg.setFocusable(false);
        neg.setMargin(new java.awt.Insets(0, 0, 0, 0));
        neg.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num+--hover.png"))); // NOI18N
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

        zero.setBackground(java.awt.Color.white);
        zero.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num0.jpg"))); // NOI18N
        zero.setAlignmentY(0.0F);
        zero.setBorder(null);
        zero.setBorderPainted(false);
        zero.setFocusable(false);
        zero.setMargin(new java.awt.Insets(0, 0, 0, 0));
        zero.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num0-hover.jpg"))); // NOI18N
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

        point.setBackground(java.awt.Color.white);
        point.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        point.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numpoint.png"))); // NOI18N
        point.setToolTipText("");
        point.setAlignmentY(0.0F);
        point.setBorder(null);
        point.setBorderPainted(false);
        point.setFocusable(false);
        point.setMargin(new java.awt.Insets(0, 0, 0, 0));
        point.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numpoint-hover.png"))); // NOI18N
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

        eq.setBackground(java.awt.Color.white);
        eq.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        eq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num=.png"))); // NOI18N
        eq.setAlignmentY(0.0F);
        eq.setBorder(null);
        eq.setBorderPainted(false);
        eq.setFocusable(false);
        eq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        eq.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/num=-hover.png"))); // NOI18N
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

        factorial.setBackground(java.awt.Color.white);
        factorial.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        factorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numfact.png"))); // NOI18N
        factorial.setAlignmentY(0.0F);
        factorial.setBorder(null);
        factorial.setBorderPainted(false);
        factorial.setFocusable(false);
        factorial.setMargin(new java.awt.Insets(0, 0, 0, 0));
        factorial.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cal_cool_ator/images/numfact-hover.png"))); // NOI18N
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

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(250, 250, 250));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setToolTipText("");
        jTextField3.setAlignmentX(0.0F);
        jTextField3.setAlignmentY(0.0F);
        jTextField3.setAutoscrolls(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jTextField3.setFocusable(false);
        jTextField3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField3.setPreferredSize(new java.awt.Dimension(56, 58));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(eq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, 0)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
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
         clear();
         numfirst=0;
    }//GEN-LAST:event_clearActionPerformed
         
    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "7";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_sevenActionPerformed
    
    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "4";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_fourActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "6";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_sixActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "1";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_oneActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "3";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_threeActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "2";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_twoActionPerformed

    private void negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negActionPerformed
        debug();
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");}
       Double ops = Double.parseDouble(String.valueOf(jTextField2.getText()));
       if(ops!=0){ ops = CalCoolAtor.neg(ops);
       nega = fmt(ops);
       jTextField2.setText(nega);
       }
    }//GEN-LAST:event_negActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        if(result!=0){jTextField2.setText("");}
        if (!jTextField2.getText().equals("0")){
        String Writenum = jTextField2.getText() + "0";
        jTextField2.setText(Writenum);}
        rozmery();
    }//GEN-LAST:event_zeroActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        if(!"√".equals(operations))
            if(!"^".equals(operations))
            {
        debug();
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");
        }
        if(jTextField2.getText().indexOf('.')<0){
        String Writenum = jTextField2.getText() + ".";
        jTextField2.setText(Writenum);}}
    }//GEN-LAST:event_pointActionPerformed

    private void farba(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_farba
     
    }//GEN-LAST:event_farba

    private void factorialfarba(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factorialfarba
        // TODO add your handling code here:
    }//GEN-LAST:event_factorialfarba

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "9";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_nineActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "8";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_eightActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(resultFlag==true){
            clear();
            resultFlag=false;
        }
        zmenaoperacie();
        cisti();
        String Writenum = jTextField2.getText() + "5";
        jTextField2.setText(Writenum);
        rozmery();
    }//GEN-LAST:event_fiveActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        resultFlag=false;
        debug();
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");}
        numfirst = Double.parseDouble(jTextField2.getText());
        operations="+"; 
        jTextField3.setText("+");
        result = 0;
        numsecond = 0;
        OPflag = true;
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        resultFlag=false;
        debug(); 
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");}
        numfirst = Double.parseDouble(jTextField2.getText());
        operations="-"; 
        jTextField3.setText("−");
        result=0;
        numsecond = 0;
        OPflag = true;
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        resultFlag=false;
        debug();
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");}
        numfirst = Double.parseDouble(jTextField2.getText());
        operations="*";
        jTextField3.setText("x");
        result = 0;
        numsecond = 0;
        OPflag = true;
    }//GEN-LAST:event_mulActionPerformed

    
    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        resultFlag=false;
        debug();
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");}
        numfirst = Double.parseDouble(jTextField2.getText());
        operations="/";
        jTextField3.setText("÷");
        result = 0;
        numsecond = 0 ;
        OPflag = true;
    }//GEN-LAST:event_divActionPerformed
    
    private void eqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqActionPerformed
        debug();
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");}
        String ans;
        jTextField3.setText("");
        if(numsecond==0)
                if(!"√".equals(operations)) numsecond = Double.parseDouble(jTextField2.getText());
                else numsecond = Long.parseLong(jTextField2.getText());
        
        //DecimalFormat f = new DecimalFormat("0.#########");
        

        switch(operations){
            case "+":
                result = CalCoolAtor.add(numfirst,numsecond);
                if(result>99999999999999L || result<-99999999999999L)
                {jTextField2.setText("overflow");
                result = 0;
                operations= "0";
                chyba=true;
                break;}
                ans = fmt(result);
                jTextField2.setText(ans);
                numfirst = result;
                resultFlag=true;
                break;
            case "-":
                result = CalCoolAtor.sub(numfirst, numsecond);
                if(result>99999999999999L || result<-99999999999999L)
                {jTextField2.setText("overflow");
                result = 0;
                operations= "0";
                chyba=true;
                break;}
                 ans = fmt(result);
                jTextField2.setText(ans);
                numfirst = result;
                resultFlag=true;
                break;
            case "*":
                result = CalCoolAtor.multiply(numfirst, numsecond);
                if(result>99999999999999L || result<-99999999999999L)
                {jTextField2.setText("overflow");
                result = 0;
                operations= "0";
                chyba=true;
                break;}
                ans = fmt(result);
                jTextField2.setText(ans);
                numfirst = result;
                resultFlag=true;
                break;
            case "/":
                try{
                result = CalCoolAtor.divide(numfirst, numsecond);
                if(result>99999999999999L || result<-99999999999999L)
                {jTextField2.setText("overflow");
                result = 0;
                operations= "0";
                chyba=true;
                break;}
                ans = fmt(result);
                jTextField2.setText(ans);
                }
                catch(IllegalArgumentException e)
                {
                    clear();
                    numfirst=0;
                    jTextField2.setText("Math error");
                }
                numfirst = result;
                resultFlag=true;
                break;
            case "^":
                result = CalCoolAtor.power(numfirst, (long)numsecond);
                if(result>99999999999999L || result<-99999999999999L)
                {jTextField2.setText("overflow");
                result = 0;
                operations= "0";
                chyba=true;
                break;}
                ans = fmt(result);
                jTextField2.setText(ans);
                numfirst = result;
                resultFlag=true;
                break; 
            case "√":
                try
                {
                result = CalCoolAtor.root(numfirst, (long)numsecond);
                if(result>99999999999999L || result<-99999999999999L)
                {jTextField2.setText("overflow");
                result = 0;
                operations= "0";
                chyba=true;
                break;}
                ans = fmt(result);
                jTextField2.setText(ans);
                }
                catch(IllegalArgumentException e){
                    clear();
                    numfirst = 0;
                    chyba=true;
                    jTextField2.setText("Math error");
                }
                numfirst = result;
                resultFlag=true;
                break;
            case "0":
                result = Double.parseDouble(String.valueOf(jTextField2.getText()));
                ans = fmt(result);
                jTextField2.setText(ans);
               
                
                break; 

    }//GEN-LAST:event_eqActionPerformed
    }
    
    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        debug();
        if(jTextField2.getText().equals(""))
            jTextField2.setText("-1");
        operations = "0";
        jTextField3.setText("");
        String ans;
        numfirst = Long.parseLong(jTextField2.getText());
        
        if(numfirst < 17)
        {result = CalCoolAtor.factorial((int) numfirst);
        if (result==0)
        {
            jTextField2.setText("Math error");
            chyba=true;
        }
        else{
        ans = fmt(result);   
        jTextField2.setText(ans);}}
        else {
            jTextField2.setText("overflow");
            chyba=true;
        }
        
        numfirst = result;
        operations= "0";
    }//GEN-LAST:event_factActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
        resultFlag=false;
        debug();
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");}
        numfirst = Double.parseDouble(jTextField2.getText());
        operations="√";
        jTextField3.setText("√");
        result = 0;
        numsecond = 0;
        OPflag = true;
    }//GEN-LAST:event_rootActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        zmenaoperacie();
        cisti();
        char letter = evt.getKeyChar();
          if (jTextField2.getText().equals("0")){
            jTextField2.setText("");
          }   
          if (!(Character.isDigit(letter) || letter==KeyEvent.VK_BACK_SPACE || letter==KeyEvent.VK_DELETE)){
              getToolkit().beep();
              evt.consume();
             
          }
           if(jTextField2.getText().length()>=14) {  
   evt.consume();
 }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        resultFlag=false;
        debug();
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");}
        numfirst = Double.parseDouble(jTextField2.getText());
        operations="^";
        jTextField3.setText("^");
        result = 0;
        numsecond = 0;
        OPflag = true;
    }//GEN-LAST:event_powerActionPerformed

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
          
    }//GEN-LAST:event_oneMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
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
 
    /**
     * Sets the icon.
     */
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
