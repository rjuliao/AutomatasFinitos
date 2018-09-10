/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatasfinitos;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Pedro_Acevedo
 */
public class Inicio extends javax.swing.JFrame {

    public static final ArrayList<String> OP = new ArrayList<>();
    public static ArrayList<String> Alfabeto;
    String[] Abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L","M","Ñ","O","P"};
    public ArrayList<String> Conjuntos;
    JTable table;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        OP.add("?");
        OP.add(")");
        OP.add("(");
        OP.add("*");
        OP.add("|");
        OP.add("+");
        jTableAFD.setEnabled(false);
        jTableSubConjuntos.setEnabled(false);
        jTableThompson.setEnabled(false);
        jTextAlfa.setEnabled(false);
        jTextConjuntos.setEnabled(false);
        jTextMueve.setEnabled(false);
        jTextSignificativos.setEnabled(false);
        jTextField2.setEnabled(false);
        jButton2.setEnabled(false);
        /* ASIGNAR DATOS A UN JTABLE.
        //Array bidimensional de objetos con los datos de la tabla
        Object[][] data ={
        {"A","A","B"},
        {"C", "C", ""}
        };
        //Array de ‘String’ con los titulos de las columnas
        String[] columnNames = {"", "a", "b"};
        //Creacion de la tabla
        table = new JTable(data, columnNames);
        jTableThompson.setModel(table.getModel());*/
        
        setLocationRelativeTo(null);
        this.setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableThompson = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAlfa = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSubConjuntos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextConjuntos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableAFD = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextSignificativos = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelSINO = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextMueve = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automatas Finitos");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AUTOMATAS FINITOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("EXPRESION REGULAR:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("CONSTRUIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableThompson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableThompson.setEditingColumn(0);
        jTableThompson.setEditingRow(0);
        jTableThompson.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTableThompson);

        jTextAlfa.setEditable(false);
        jTextAlfa.setColumns(1);
        jTextAlfa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAlfa.setLineWrap(true);
        jTextAlfa.setRows(1);
        jTextAlfa.setTabSize(1);
        jTextAlfa.setMinimumSize(new java.awt.Dimension(433, 2331));
        jScrollPane2.setViewportView(jTextAlfa);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("AFN Transiciones:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Alfabeto:");

        jTableSubConjuntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableSubConjuntos.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(jTableSubConjuntos);

        jTextConjuntos.setEditable(false);
        jTextConjuntos.setColumns(1);
        jTextConjuntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextConjuntos.setLineWrap(true);
        jTextConjuntos.setRows(1);
        jTextConjuntos.setTabSize(1);
        jTextConjuntos.setMinimumSize(new java.awt.Dimension(433, 2331));
        jScrollPane4.setViewportView(jTextConjuntos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("AFD No Optimo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Conjuntos:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("AFD TransD:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Estados Significativos:");

        jTableAFD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableAFD.setEditingColumn(0);
        jTableAFD.setEditingRow(0);
        jTableAFD.setRowSelectionAllowed(false);
        jScrollPane5.setViewportView(jTableAFD);

        jTextSignificativos.setEditable(false);
        jTextSignificativos.setColumns(1);
        jTextSignificativos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextSignificativos.setLineWrap(true);
        jTextSignificativos.setRows(1);
        jTextSignificativos.setTabSize(1);
        jTextSignificativos.setMinimumSize(new java.awt.Dimension(433, 2331));
        jScrollPane6.setViewportView(jTextSignificativos);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("RECONOCIMIENTO:");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("COMPROBAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelSINO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSINO.setText("SI O NO");

        jTextMueve.setEditable(false);
        jTextMueve.setColumns(1);
        jTextMueve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextMueve.setLineWrap(true);
        jTextMueve.setRows(1);
        jTextMueve.setTabSize(1);
        jTextMueve.setMinimumSize(new java.awt.Dimension(433, 2331));
        jScrollPane7.setViewportView(jTextMueve);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField2)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSINO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane7))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6))))
                .addGap(0, 534, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabelSINO))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar()) && !OP.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!jTextField1.getText().equals("")) {
            Alfabeto = new ArrayList<>();
            if (ComprobarEXP()) {
                jTableAFD.setEnabled(true);
                jTableSubConjuntos.setEnabled(true);
                jTableThompson.setEnabled(true);
                jTextAlfa.setEnabled(true);
                jTextConjuntos.setEnabled(true);
                jTextMueve.setEnabled(true);
                jTextSignificativos.setEnabled(true);
                jTextField2.setEnabled(true);
                jButton2.setEnabled(true);
                jTextAlfa.setText(Alfabeto());
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Llene el campo respectivo.", "Automatas finitos", JOptionPane.WARNING_MESSAGE);
    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!jTextField2.getText().equals("")) {
            //SubConjuntos();
        }else{
            JOptionPane.showMessageDialog(null, "Llene el campo respectivo.", "Automatas finitos", JOptionPane.WARNING_MESSAGE);
    
        }
    }//GEN-LAST:event_jButton2ActionPerformed

       
    public boolean ComprobarEXP(){
        boolean sw = true;
        int i = 0;
        String EXP = jTextField1.getText();
        int Parentesis = 0;
        while(i < EXP.length() && sw) {
            if (!OP.contains(EXP.substring(i, i+1))) {
                if (!Alfabeto.contains(EXP.substring(i, i+1))) {
                    Alfabeto.add(EXP.substring(i, i+1));   
                }
            }else{
                boolean error = false;
                if (i<(EXP.length()-1)) {
                    switch(EXP.substring(i, i+1)){
                        case "|":
                            if (OP.contains(EXP.substring(i+1, i+2)) && !EXP.substring(i+1, i+2).equals("(")) {
                                error = true;
                            }
                        break;
                        case "?":
                            if (OP.contains(EXP.substring(i+1, i+2)) && !EXP.substring(i+1, i+2).equals("(") && !EXP.substring(i+1, i+2).equals(")")) {
                                error = true;
                            }
                        break;
                        case "*":
                            if (EXP.substring(i+1, i+2).equals("+") | EXP.substring(i+1, i+2).equals("?") | EXP.substring(i+1, i+2).equals("*")) {
                                error = true;
                            }
                        break;
                        case "(":
                            Parentesis++;
                            if (OP.contains(EXP.substring(i+1, i+2)) && !EXP.substring(i+1, i+2).equals("(")) {
                                error = true;
                            }                        
                        break;
                        case ")":            
                            Parentesis++;           
                        break;
                        case "+":
                            if (EXP.substring(i+1, i+2).equals("+") | EXP.substring(i+1, i+2).equals("*") | EXP.substring(i+1, i+2).equals("?")) {
                                error = true;
                            }                         
                        break;
                    }
                }else{
                    if (EXP.substring(i, i+1).equals(")") | EXP.substring(i, i+1).equals("(")) {
                        Parentesis++;
                    }
                    if (EXP.substring(i, i+1).equals("|") | EXP.substring(i, i+1).equals("(")) {
                        error=true;
                    }
                    if (Parentesis%2 != 0) {
                        error=true;
                    }
                }
                if (error) {
                    JOptionPane.showMessageDialog(null, "La expresion regular tiene errores.", "Automatas finitos", JOptionPane.WARNING_MESSAGE);
                    sw = false;
                }
            }
            i++;
        }
        return sw;
    }
    
    String Alfabeto(){
        String A = "{";
        Collections.sort(Alfabeto);
        A = A + " " + Alfabeto.get(0);
        for (int i = 1; i < Alfabeto.size(); i++) {
            A = A + ", " + Alfabeto.get(i);
        }
        A = A + " }";
        return A;
    }
            
    String TransEpsilon(String[][] T,int Pos,ArrayList<String> C){
        String TE = "" +  T[Pos][0];
        if (!C.contains(T[Pos][0])) {
            C.add(T[Pos][0]);   
        }
        //System.out.println(TE + "Actual");
        //System.out.println(T[Pos][T[0].length-1] + "Trans EP - " + Pos);
        if (!T[Pos][T[0].length-1].equals("-")) {
            String[] E = T[Pos][T[0].length-1].split(",");
            for (int i = 0; i < E.length; i++) {
                if (!C.contains(E[i])){
                     TE = TE + "," + TransEpsilon(T,Integer.parseInt(E[i]),C);    
                }             
            }
        }
        return TE;
    }
    
    String MueveC(String[][] T,String CTE,int Sim,ArrayList<String> C){
        String MC = "";
            String[] CE = CTE.split(",");
            for (int i = 0; i < CE.length; i++){
                String c = T[Integer.parseInt(CE[i])][Sim];
                if (c.length()>1){
                    String[] s = c.split(",");
                    for (int j = 0; j < s.length; j++) {
                        if (!C.contains(s[j])) {
                           C.add(s[j]);
                        }
                   }
                }else{
                    if (!c.equals("-")) {
                        if (!C.contains(c)) {
                           C.add(c);
                        }   
                    }
                }
            }
        if (!C.isEmpty()) {
            ArrayList<String> EP = new ArrayList<>();
           for (String c : C) {
               TransEpsilon(T,Integer.parseInt(c),EP);
           }
           MC = MC + EP.get(0);
           for (int i = 1; i < EP.size(); i++) {
               MC = MC + ","  + EP.get(i);
           }
        }    
        return MC;
    }
    
    public void SubConjuntos(){
        String[][] T = {{"0","-","-","1,7"},{"1","-","-","2,4"},{"2","3","-","-"},{"3","-","-","6"},{"4","-","5","-"},{"5","-","-","6"},{"6","-","-","1,7"},{"7","8","-","-"},{"8","-","9","-"},{"9","-","10","-"},{"10","-","-","-"}};
        Conjuntos = new ArrayList<>();
        Conjuntos.add(TransEpsilon(T,0,new ArrayList<>()));
        ArrayList<String> Trans = new ArrayList<>();
        Trans.add("");
        int a = 0;
        while(a < Conjuntos.size()){
            for (int i = 0; i < Alfabeto.size(); i++) {
                String Ti = MueveC(T,Conjuntos.get(a),(i+1),new ArrayList<>());
                if (!Conjuntos.contains(Ti)) {
                    Conjuntos.add(Ti);
                    Trans.add("");
                    Trans.set(a,Trans.get(a) + (Conjuntos.size()-1) + "-");
                }else{
                    Trans.set(a,Trans.get(a) + (Conjuntos.indexOf(Ti)) + "-");
                }
            }
            a++;
        }
        String[][] Datos = new String[Conjuntos.size()][Alfabeto.size()+1];
        for (int i = 0; i < Conjuntos.size(); i++) {
            Datos[i][0] = Abecedario[i];
        }
        for (int i = 0; i < Trans.size(); i++) {
            String[] c = Trans.get(i).split("-");
            for (int j = 0; j < c.length; j++) {
              Datos[i][(j+1)] = Abecedario[Integer.parseInt(c[j])];
            }
            jTextConjuntos.setText( jTextConjuntos.getText() + Abecedario[i] + " --> {" + Conjuntos.get(i) + "}" + "\n" );   
        }
        DefTable(jTableSubConjuntos,Datos);
    }
    
    public void DefTable(JTable T,String[][] Mat){
        String[] Columnas = new String[Alfabeto.size()+1];
        Columnas[0] = " ";
        for (int i = 0; i < Alfabeto.size(); i++) {
           Columnas[i+1] = Alfabeto.get(i);
        }
        JTable M = new JTable(Mat, Columnas);
        T.setModel(M.getModel());
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSINO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableAFD;
    private javax.swing.JTable jTableSubConjuntos;
    private javax.swing.JTable jTableThompson;
    private javax.swing.JTextArea jTextAlfa;
    private javax.swing.JTextArea jTextConjuntos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea jTextMueve;
    private javax.swing.JTextArea jTextSignificativos;
    // End of variables declaration//GEN-END:variables
}
