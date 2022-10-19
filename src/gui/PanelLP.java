/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author chuy
 */
public class PanelLP extends javax.swing.JPanel {

    ArrayList<Integer> lista = new ArrayList();
    
    public PanelLP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresarBc = new javax.swing.JPanel();
        ingresarBtn = new javax.swing.JLabel();
        buscarBc = new javax.swing.JPanel();
        buscarBtn = new javax.swing.JLabel();
        posicionBc = new javax.swing.JPanel();
        posicionBtn = new javax.swing.JLabel();
        eliminarBc = new javax.swing.JPanel();
        eliminarBtn = new javax.swing.JLabel();
        verListaBc = new javax.swing.JPanel();
        verListaBtn = new javax.swing.JLabel();
        tamanoBc = new javax.swing.JPanel();
        tamanoBtn = new javax.swing.JLabel();
        limpiarBc = new javax.swing.JPanel();
        limpiarBtn = new javax.swing.JLabel();
        infoBc = new javax.swing.JPanel();
        infoBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ingresarBc.setBackground(new java.awt.Color(51, 51, 255));

        ingresarBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        ingresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        ingresarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresarBtn.setText("Ingresar dato");
        ingresarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ingresarBcLayout = new javax.swing.GroupLayout(ingresarBc);
        ingresarBc.setLayout(ingresarBcLayout);
        ingresarBcLayout.setHorizontalGroup(
            ingresarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        ingresarBcLayout.setVerticalGroup(
            ingresarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        buscarBc.setBackground(new java.awt.Color(51, 51, 255));

        buscarBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarBtn.setText("Obtener posición");
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarBcLayout = new javax.swing.GroupLayout(buscarBc);
        buscarBc.setLayout(buscarBcLayout);
        buscarBcLayout.setHorizontalGroup(
            buscarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarBcLayout.createSequentialGroup()
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        buscarBcLayout.setVerticalGroup(
            buscarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        posicionBc.setBackground(new java.awt.Color(51, 51, 255));

        posicionBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        posicionBtn.setForeground(new java.awt.Color(255, 255, 255));
        posicionBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posicionBtn.setText("Obtener elemento");
        posicionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        posicionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posicionBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                posicionBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                posicionBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout posicionBcLayout = new javax.swing.GroupLayout(posicionBc);
        posicionBc.setLayout(posicionBcLayout);
        posicionBcLayout.setHorizontalGroup(
            posicionBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(posicionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        posicionBcLayout.setVerticalGroup(
            posicionBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(posicionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        eliminarBc.setBackground(new java.awt.Color(51, 51, 255));

        eliminarBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        eliminarBtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarBtn.setText("Eliminar dato");
        eliminarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout eliminarBcLayout = new javax.swing.GroupLayout(eliminarBc);
        eliminarBc.setLayout(eliminarBcLayout);
        eliminarBcLayout.setHorizontalGroup(
            eliminarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        eliminarBcLayout.setVerticalGroup(
            eliminarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        verListaBc.setBackground(new java.awt.Color(51, 51, 255));

        verListaBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        verListaBtn.setForeground(new java.awt.Color(255, 255, 255));
        verListaBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verListaBtn.setText("Ver lista");
        verListaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verListaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verListaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verListaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verListaBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout verListaBcLayout = new javax.swing.GroupLayout(verListaBc);
        verListaBc.setLayout(verListaBcLayout);
        verListaBcLayout.setHorizontalGroup(
            verListaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verListaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        verListaBcLayout.setVerticalGroup(
            verListaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verListaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        tamanoBc.setBackground(new java.awt.Color(51, 51, 255));

        tamanoBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        tamanoBtn.setForeground(new java.awt.Color(255, 255, 255));
        tamanoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tamanoBtn.setText("Tamaño de la lista");
        tamanoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tamanoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tamanoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tamanoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tamanoBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout tamanoBcLayout = new javax.swing.GroupLayout(tamanoBc);
        tamanoBc.setLayout(tamanoBcLayout);
        tamanoBcLayout.setHorizontalGroup(
            tamanoBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tamanoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        tamanoBcLayout.setVerticalGroup(
            tamanoBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tamanoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        limpiarBc.setBackground(new java.awt.Color(51, 51, 255));

        limpiarBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limpiarBtn.setText("Limpiar Lista");
        limpiarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limpiarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limpiarBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout limpiarBcLayout = new javax.swing.GroupLayout(limpiarBc);
        limpiarBc.setLayout(limpiarBcLayout);
        limpiarBcLayout.setHorizontalGroup(
            limpiarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpiarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        limpiarBcLayout.setVerticalGroup(
            limpiarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        infoBc.setBackground(new java.awt.Color(51, 51, 255));

        infoBtn.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        infoBtn.setForeground(new java.awt.Color(255, 255, 255));
        infoBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoBtn.setText("?");
        infoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout infoBcLayout = new javax.swing.GroupLayout(infoBc);
        infoBc.setLayout(infoBcLayout);
        infoBcLayout.setHorizontalGroup(
            infoBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );
        infoBcLayout.setVerticalGroup(
            infoBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(limpiarBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verListaBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(posicionBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingresarBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamanoBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingresarBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(infoBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posicionBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verListaBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanoBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(limpiarBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBtnMouseEntered
        ingresarBc.setBackground(new Color(102,102,255));
        ingresarBtn.setForeground(Color.black);
    }//GEN-LAST:event_ingresarBtnMouseEntered

    private void ingresarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBtnMouseExited
        ingresarBc.setBackground(new Color(51,51,255));
        ingresarBtn.setForeground(Color.white);
    }//GEN-LAST:event_ingresarBtnMouseExited

    private void buscarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseEntered
        buscarBc.setBackground(new Color(102,102,255));
        buscarBtn.setForeground(Color.black);
    }//GEN-LAST:event_buscarBtnMouseEntered

    private void buscarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseExited
        buscarBc.setBackground(new Color(51,51,255));
        buscarBtn.setForeground(Color.white);
    }//GEN-LAST:event_buscarBtnMouseExited

    private void posicionBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicionBtnMouseEntered
        posicionBc.setBackground(new Color(102,102,255));
        posicionBtn.setForeground(Color.black);
    }//GEN-LAST:event_posicionBtnMouseEntered

    private void posicionBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicionBtnMouseExited
        posicionBc.setBackground(new Color(51,51,255));
        posicionBtn.setForeground(Color.white);
    }//GEN-LAST:event_posicionBtnMouseExited

    private void eliminarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMouseEntered
        eliminarBc.setBackground(new Color(102,102,255));
        eliminarBtn.setForeground(Color.black);
    }//GEN-LAST:event_eliminarBtnMouseEntered

    private void eliminarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMouseExited
        eliminarBc.setBackground(new Color(51,51,255));
        eliminarBtn.setForeground(Color.white);
    }//GEN-LAST:event_eliminarBtnMouseExited

    private void verListaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verListaBtnMouseEntered
        verListaBc.setBackground(new Color(102,102,255));
        verListaBtn.setForeground(Color.black);
    }//GEN-LAST:event_verListaBtnMouseEntered

    private void verListaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verListaBtnMouseExited
        verListaBc.setBackground(new Color(51,51,255));
        verListaBtn.setForeground(Color.white);
    }//GEN-LAST:event_verListaBtnMouseExited

    private void tamanoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamanoBtnMouseEntered
        tamanoBc.setBackground(new Color(102,102,255));
        tamanoBtn.setForeground(Color.black);
    }//GEN-LAST:event_tamanoBtnMouseEntered

    private void tamanoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamanoBtnMouseExited
        tamanoBc.setBackground(new Color(51,51,255));
        tamanoBtn.setForeground(Color.white);
    }//GEN-LAST:event_tamanoBtnMouseExited

    private void ingresarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBtnMouseClicked
        try {
            lista.add(Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el dato")));
            JOptionPane.showMessageDialog(this,"Se ingreso el dato con exito");
        }catch(NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_ingresarBtnMouseClicked

    private void buscarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseClicked
        if(lista.isEmpty()) {
            JOptionPane.showMessageDialog(this,"La lista esta vacia");
            
            return;
        }
        try {
            int b = Integer.parseInt(JOptionPane.showInputDialog(this,"Obtenga la posición por elemento"));
            int a = lista.indexOf(b);
            if(a == -1) {
                JOptionPane.showMessageDialog(this,"No existe tal elemento en la lista");
                
                return;
            }               
            JOptionPane.showMessageDialog(this,"La posición del elemento " + b + " es " + a);
        }catch(NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_buscarBtnMouseClicked

    private void posicionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicionBtnMouseClicked
        if(lista.isEmpty()) {
            JOptionPane.showMessageDialog(this,"La lista esta vacia");
            
            return;
        }
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog(this,"Obtenga el elemento por posición"));
            int b = lista.get(a);
            JOptionPane.showMessageDialog(this,"El elemento de la posición " + a + " es " + b);
        }catch(NumberFormatException e) {
            return;
        }catch(IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this,"No existe esa posición");
            return;
        }
    }//GEN-LAST:event_posicionBtnMouseClicked

    private void eliminarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMouseClicked
        if(lista.isEmpty()) {
            JOptionPane.showMessageDialog(this,"La lista esta vacia");
            
            return;
        }
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese la posición del elemento a eliminar"));
            int b = lista.get(a);
            lista.remove(a);           
            JOptionPane.showMessageDialog(this,"El elemento " + b + " en la posición " + a + " ha sido eliminado");
        }catch(NumberFormatException e) {
            return;
        }catch(IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this,"No existe esa posición");
            return;
        }
    }//GEN-LAST:event_eliminarBtnMouseClicked

    private void verListaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verListaBtnMouseClicked
        if(lista.isEmpty()) {
            JOptionPane.showMessageDialog(this,"La lista esta vacia");
            return;
        }
        String lista = "";
        int i = 0;
        
        for(int datos : this.lista) {
            lista += " " + i + " - " + datos + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null,"Lista\n" + lista);       
    }//GEN-LAST:event_verListaBtnMouseClicked

    private void tamanoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamanoBtnMouseClicked
        if(!lista.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Tamaño de la lista " + lista.size());
            return;
        }
        JOptionPane.showMessageDialog(this,"La lista esta vacia");
    }//GEN-LAST:event_tamanoBtnMouseClicked

    private void limpiarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBtnMouseEntered
        limpiarBc.setBackground(new Color(102,102,255));
        limpiarBtn.setForeground(Color.black);
    }//GEN-LAST:event_limpiarBtnMouseEntered

    private void limpiarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBtnMouseExited
        limpiarBc.setBackground(new Color(51,51,255));
        limpiarBtn.setForeground(Color.white);
    }//GEN-LAST:event_limpiarBtnMouseExited

    private void limpiarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBtnMouseClicked
        lista.clear();
        JOptionPane.showMessageDialog(this,"Se ha limpiado la lista");
    }//GEN-LAST:event_limpiarBtnMouseClicked

    private void infoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseClicked
        JOptionPane.showMessageDialog(this,"ARRAYLIST\n"
            + "   Métodos\n"
            + "       Ingresar dato -> Ingresa un dato al ArrayList\n"
            + "       Obtener posición -> Muestra la posición de un elemento\n"
            + "       Obtener elemento -> Muestra el elemento de una posición\n"
            + "       Eliminar dato -> Elimina un elemento de una posición\n"
            + "       Ver lista -> Muestra el ArrayList\n"
            + "       Tamaño de la pila -> Muestra el tamaño del ArrayList (números de elementos)\n"
            + "       Limpiar lista -> Limpia el ArrayList\n"
            + " **Este ArrayList es de tipo Integer por lo que solo admite números enteros,\n cualquier otro tipo de dato no será tomado en cuenta**\n");
    }//GEN-LAST:event_infoBtnMouseClicked
    
    private void infoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseEntered
        infoBc.setBackground(new Color(102,102,255));
        infoBtn.setForeground(Color.black);
    }//GEN-LAST:event_infoBtnMouseEntered

    private void infoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseExited
        infoBc.setBackground(new Color(51,51,255));
        infoBtn.setForeground(Color.white);
    }//GEN-LAST:event_infoBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscarBc;
    private javax.swing.JLabel buscarBtn;
    private javax.swing.JPanel eliminarBc;
    private javax.swing.JLabel eliminarBtn;
    private javax.swing.JPanel infoBc;
    private javax.swing.JLabel infoBtn;
    private javax.swing.JPanel ingresarBc;
    private javax.swing.JLabel ingresarBtn;
    private javax.swing.JPanel limpiarBc;
    private javax.swing.JLabel limpiarBtn;
    private javax.swing.JPanel posicionBc;
    private javax.swing.JLabel posicionBtn;
    private javax.swing.JPanel tamanoBc;
    private javax.swing.JLabel tamanoBtn;
    private javax.swing.JPanel verListaBc;
    private javax.swing.JLabel verListaBtn;
    // End of variables declaration//GEN-END:variables
}
