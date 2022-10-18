/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author chuy
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    int xMouse,yMouse;
    PanelLS panelLs;
    PanelPS panelPs;
    PanelCS panelCs;
    PanelLP panelLp;
    
    public Ventana() {
        initComponents();
        initPaneles();
        
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("../imagenes/listaSimple.png"));
        jLabel1.setLocation(550,22);
        jLabel1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelMennu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        listaSimpleBc = new javax.swing.JPanel();
        listaSimpleBtn = new javax.swing.JLabel();
        pilaSimpleBc = new javax.swing.JPanel();
        pilaSimpleBtn = new javax.swing.JLabel();
        colaSimpleBc = new javax.swing.JPanel();
        colaSimpleBtn = new javax.swing.JLabel();
        listaBc = new javax.swing.JPanel();
        listaBtn = new javax.swing.JLabel();
        pilaBc = new javax.swing.JPanel();
        pilaBtn = new javax.swing.JLabel();
        colaBc = new javax.swing.JPanel();
        colaBtn = new javax.swing.JLabel();
        panelTitulo = new javax.swing.JPanel();
        tituloTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        cabecera = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMennu.setBackground(new java.awt.Color(51, 51, 255));
        panelMennu.setForeground(new java.awt.Color(255, 255, 255));
        panelMennu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menú");
        jLabel2.setToolTipText("");
        panelMennu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 51, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelMennu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 100, 204, 10));

        listaSimpleBc.setBackground(new java.awt.Color(153, 153, 255));

        listaSimpleBtn.setBackground(new java.awt.Color(153, 153, 255));
        listaSimpleBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        listaSimpleBtn.setForeground(new java.awt.Color(255, 255, 255));
        listaSimpleBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listaSimpleBtn.setText("Lista simple");
        listaSimpleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaSimpleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSimpleBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaSimpleBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaSimpleBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout listaSimpleBcLayout = new javax.swing.GroupLayout(listaSimpleBc);
        listaSimpleBc.setLayout(listaSimpleBcLayout);
        listaSimpleBcLayout.setHorizontalGroup(
            listaSimpleBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaSimpleBcLayout.createSequentialGroup()
                .addComponent(listaSimpleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        listaSimpleBcLayout.setVerticalGroup(
            listaSimpleBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaSimpleBcLayout.createSequentialGroup()
                .addComponent(listaSimpleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMennu.add(listaSimpleBc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 290, 60));

        pilaSimpleBc.setBackground(new java.awt.Color(153, 153, 255));

        pilaSimpleBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        pilaSimpleBtn.setForeground(new java.awt.Color(255, 255, 255));
        pilaSimpleBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pilaSimpleBtn.setText("Pila simple");
        pilaSimpleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pilaSimpleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilaSimpleBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pilaSimpleBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pilaSimpleBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pilaSimpleBcLayout = new javax.swing.GroupLayout(pilaSimpleBc);
        pilaSimpleBc.setLayout(pilaSimpleBcLayout);
        pilaSimpleBcLayout.setHorizontalGroup(
            pilaSimpleBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pilaSimpleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        pilaSimpleBcLayout.setVerticalGroup(
            pilaSimpleBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pilaSimpleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panelMennu.add(pilaSimpleBc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 290, 60));

        colaSimpleBc.setBackground(new java.awt.Color(153, 153, 255));

        colaSimpleBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        colaSimpleBtn.setForeground(new java.awt.Color(255, 255, 255));
        colaSimpleBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colaSimpleBtn.setText("Cola simple");
        colaSimpleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colaSimpleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colaSimpleBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colaSimpleBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                colaSimpleBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout colaSimpleBcLayout = new javax.swing.GroupLayout(colaSimpleBc);
        colaSimpleBc.setLayout(colaSimpleBcLayout);
        colaSimpleBcLayout.setHorizontalGroup(
            colaSimpleBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colaSimpleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        colaSimpleBcLayout.setVerticalGroup(
            colaSimpleBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colaSimpleBcLayout.createSequentialGroup()
                .addComponent(colaSimpleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelMennu.add(colaSimpleBc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 290, -1));

        listaBc.setBackground(new java.awt.Color(153, 153, 255));

        listaBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        listaBtn.setForeground(new java.awt.Color(255, 255, 255));
        listaBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listaBtn.setText("Lista Predefinida");
        listaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout listaBcLayout = new javax.swing.GroupLayout(listaBc);
        listaBc.setLayout(listaBcLayout);
        listaBcLayout.setHorizontalGroup(
            listaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaBcLayout.createSequentialGroup()
                .addComponent(listaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        listaBcLayout.setVerticalGroup(
            listaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaBcLayout.createSequentialGroup()
                .addComponent(listaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelMennu.add(listaBc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, 60));

        pilaBc.setBackground(new java.awt.Color(153, 153, 255));

        pilaBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        pilaBtn.setForeground(new java.awt.Color(255, 255, 255));
        pilaBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pilaBtn.setText("Pila predefinida");
        pilaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pilaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pilaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pilaBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pilaBcLayout = new javax.swing.GroupLayout(pilaBc);
        pilaBc.setLayout(pilaBcLayout);
        pilaBcLayout.setHorizontalGroup(
            pilaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pilaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        pilaBcLayout.setVerticalGroup(
            pilaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pilaBcLayout.createSequentialGroup()
                .addComponent(pilaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMennu.add(pilaBc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 290, 60));

        colaBc.setBackground(new java.awt.Color(153, 153, 255));

        colaBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        colaBtn.setForeground(new java.awt.Color(255, 255, 255));
        colaBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colaBtn.setText("Cola prodefinida");
        colaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                colaBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout colaBcLayout = new javax.swing.GroupLayout(colaBc);
        colaBc.setLayout(colaBcLayout);
        colaBcLayout.setHorizontalGroup(
            colaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        colaBcLayout.setVerticalGroup(
            colaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colaBcLayout.createSequentialGroup()
                .addComponent(colaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelMennu.add(colaBc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 290, 60));

        panelFondo.add(panelMennu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 630));

        panelTitulo.setBackground(new java.awt.Color(102, 102, 255));
        panelTitulo.setLayout(null);

        tituloTxt.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setText("Lista simple");
        panelTitulo.add(tituloTxt);
        tituloTxt.setBounds(90, 40, 430, 57);
        panelTitulo.add(jLabel1);
        jLabel1.setBounds(540, 20, 180, 90);

        panelFondo.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 810, 130));

        titulo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Estructuras de datos");
        panelFondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 200, 20));

        cabecera.setBackground(new java.awt.Color(255, 255, 255));
        cabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabeceraMouseDragged(evt);
            }
        });
        cabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabeceraMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setBackground(new java.awt.Color(255, 255, 255));
        exitTxt.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(0, 0, 0));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                .addGap(0, 1059, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 40));

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido.setLayout(null);
        panelFondo.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 810, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initPaneles() {
        panelLs = new PanelLS();
        panelPs = new PanelPS();
        panelCs = new PanelCS();
        panelLp = new PanelLP();
    
        panelLs.setSize(810,420);
        panelPs.setSize(810,420);
        panelCs.setSize(810,420);
        panelLp.setSize(810,420);
        
        panelContenido.add(panelLs);
        panelContenido.add(panelPs);
        panelContenido.add(panelCs);
        panelContenido.add(panelLp);
        panelContenido.setVisible(true);
        panelContenido.setLayout(null);
        
        panelLs.setVisible(true);
        panelPs.setVisible(false);
        panelCs.setVisible(false);
        panelLp.setVisible(false);
        
        
    }
    
    private void cabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_cabeceraMousePressed

    private void cabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabeceraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_cabeceraMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void listaSimpleBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSimpleBtnMouseEntered
        listaSimpleBc.setBackground(new Color(204,204,255));
        listaSimpleBtn.setForeground(Color.black);
    }//GEN-LAST:event_listaSimpleBtnMouseEntered

    private void listaSimpleBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSimpleBtnMouseExited
        listaSimpleBc.setBackground(new Color(153,153,255));
        listaSimpleBtn.setForeground(Color.white);
    }//GEN-LAST:event_listaSimpleBtnMouseExited

    private void pilaSimpleBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilaSimpleBtnMouseEntered
        pilaSimpleBc.setBackground(new Color(204,204,255));
        pilaSimpleBtn.setForeground(Color.black);
    }//GEN-LAST:event_pilaSimpleBtnMouseEntered

    private void pilaSimpleBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilaSimpleBtnMouseExited
        pilaSimpleBc.setBackground(new Color(153,153,255));
        pilaSimpleBtn.setForeground(Color.white);
    }//GEN-LAST:event_pilaSimpleBtnMouseExited
/////////////////////////////////////////////////////////////////////////////777
    ///////////////////////////////////////////////////////////////////////7/
    //////////////////////////////////////////////////////////////////////7
    private void listaSimpleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSimpleBtnMouseClicked
        tituloTxt.setText("Lista simple");
        panelLs.setVisible(true);
        panelPs.setVisible(false);
        panelCs.setVisible(false);
        panelLp.setVisible(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("../imagenes/listaSimple.png"));
        jLabel1.setLocation(550,22);
        jLabel1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_listaSimpleBtnMouseClicked

    private void pilaSimpleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilaSimpleBtnMouseClicked
        tituloTxt.setText("Pila simple");
        panelLs.setVisible(false);
        panelPs.setVisible(true);
        panelCs.setVisible(false);
        panelLp.setVisible(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("../imagenes/pila.png"));
        jLabel1.setLocation(550,22);
        jLabel1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));

    }//GEN-LAST:event_pilaSimpleBtnMouseClicked

    private void colaSimpleBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colaSimpleBtnMouseExited
        colaSimpleBc.setBackground(new Color(153,153,255));
        colaSimpleBtn.setForeground(Color.white);
    }//GEN-LAST:event_colaSimpleBtnMouseExited

    private void colaSimpleBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colaSimpleBtnMouseEntered
        colaSimpleBc.setBackground(new Color(204,204,255));
        colaSimpleBtn.setForeground(Color.black);
    }//GEN-LAST:event_colaSimpleBtnMouseEntered

    private void colaSimpleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colaSimpleBtnMouseClicked
        tituloTxt.setText("Cola simple");
        panelLs.setVisible(false);
        panelPs.setVisible(false);
        panelCs.setVisible(true);
        panelLp.setVisible(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("../imagenes/cola.png"));
        jLabel1.setLocation(550,22);
        jLabel1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_colaSimpleBtnMouseClicked

    private void listaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBtnMouseEntered
        listaBc.setBackground(new Color(204,204,255));
        listaBtn.setForeground(Color.black);
    }//GEN-LAST:event_listaBtnMouseEntered

    private void listaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBtnMouseExited
        listaBc.setBackground(new Color(153,153,255));
        listaBtn.setForeground(Color.white);
    }//GEN-LAST:event_listaBtnMouseExited

    private void pilaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilaBtnMouseEntered
        pilaBc.setBackground(new Color(204,204,255));
        pilaBtn.setForeground(Color.black);
    }//GEN-LAST:event_pilaBtnMouseEntered

    private void pilaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilaBtnMouseExited
        pilaBc.setBackground(new Color(153,153,255));
        pilaBtn.setForeground(Color.white);
    }//GEN-LAST:event_pilaBtnMouseExited

    private void colaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colaBtnMouseEntered
        colaBc.setBackground(new Color(204,204,255));
        colaBtn.setForeground(Color.black);
    }//GEN-LAST:event_colaBtnMouseEntered

    private void colaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colaBtnMouseExited
        colaBc.setBackground(new Color(153,153,255));
        colaBtn.setForeground(Color.white);
    }//GEN-LAST:event_colaBtnMouseExited

    private void listaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBtnMouseClicked
        tituloTxt.setText("Lista predefinida");
        panelLs.setVisible(false);
        panelPs.setVisible(false);
        panelCs.setVisible(false);
        panelLp.setVisible(true);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("../imagenes/lista2.png"));
        jLabel1.setLocation(550,22);
        jLabel1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_listaBtnMouseClicked

    private void pilaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pilaBtnMouseClicked
        tituloTxt.setText("Pila predefinida");
        panelLs.setVisible(false);
        panelPs.setVisible(false);
        panelCs.setVisible(false);
        panelLp.setVisible(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("../imagenes/pila2.png"));
        jLabel1.setLocation(550,22);
        jLabel1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_pilaBtnMouseClicked

    private void colaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colaBtnMouseClicked
        tituloTxt.setText("Cola predefinida");
        panelLs.setVisible(false);
        panelPs.setVisible(false);
        panelCs.setVisible(false);
        panelLp.setVisible(false);
        ImageIcon imagen = new ImageIcon(this.getClass().getResource("../imagenes/cola2.png"));
        jLabel1.setLocation(550,22);
        jLabel1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_colaBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cabecera;
    private javax.swing.JPanel colaBc;
    private javax.swing.JLabel colaBtn;
    private javax.swing.JPanel colaSimpleBc;
    private javax.swing.JLabel colaSimpleBtn;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel listaBc;
    private javax.swing.JLabel listaBtn;
    private javax.swing.JPanel listaSimpleBc;
    private javax.swing.JLabel listaSimpleBtn;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMennu;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel pilaBc;
    private javax.swing.JLabel pilaBtn;
    private javax.swing.JPanel pilaSimpleBc;
    private javax.swing.JLabel pilaSimpleBtn;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables
}
