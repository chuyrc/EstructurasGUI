/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import estructuras.ListaSimple;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author chuy
 */
public class PanelLS extends javax.swing.JPanel {

    ListaSimple lista = new ListaSimple();
    
    public PanelLS() {
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
        modificarBc = new javax.swing.JPanel();
        modificarBtn = new javax.swing.JLabel();
        eliminarBc = new javax.swing.JPanel();
        eliminarBtn = new javax.swing.JLabel();
        verListaBc = new javax.swing.JPanel();
        verListaBtn = new javax.swing.JLabel();
        listaVaciaBc = new javax.swing.JPanel();
        listaVaciaBtn = new javax.swing.JLabel();
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
        buscarBtn.setText("Buscar dato");
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

        modificarBc.setBackground(new java.awt.Color(51, 51, 255));

        modificarBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        modificarBtn.setForeground(new java.awt.Color(255, 255, 255));
        modificarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarBtn.setText("Modificar dato");
        modificarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modificarBcLayout = new javax.swing.GroupLayout(modificarBc);
        modificarBc.setLayout(modificarBcLayout);
        modificarBcLayout.setHorizontalGroup(
            modificarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        modificarBcLayout.setVerticalGroup(
            modificarBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(verListaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        listaVaciaBc.setBackground(new java.awt.Color(51, 51, 255));

        listaVaciaBtn.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        listaVaciaBtn.setForeground(new java.awt.Color(255, 255, 255));
        listaVaciaBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listaVaciaBtn.setText("Esta vacia");
        listaVaciaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaVaciaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaVaciaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaVaciaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaVaciaBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout listaVaciaBcLayout = new javax.swing.GroupLayout(listaVaciaBc);
        listaVaciaBc.setLayout(listaVaciaBcLayout);
        listaVaciaBcLayout.setHorizontalGroup(
            listaVaciaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listaVaciaBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        listaVaciaBcLayout.setVerticalGroup(
            listaVaciaBcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaVaciaBcLayout.createSequentialGroup()
                .addComponent(listaVaciaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verListaBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingresarBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaVaciaBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(infoBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingresarBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modificarBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verListaBc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaVaciaBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
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

    private void modificarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarBtnMouseEntered
        modificarBc.setBackground(new Color(102,102,255));
        modificarBtn.setForeground(Color.black);
    }//GEN-LAST:event_modificarBtnMouseEntered

    private void modificarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarBtnMouseExited
        modificarBc.setBackground(new Color(51,51,255));
        modificarBtn.setForeground(Color.white);
    }//GEN-LAST:event_modificarBtnMouseExited

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

    private void listaVaciaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaVaciaBtnMouseEntered
        listaVaciaBc.setBackground(new Color(102,102,255));
        listaVaciaBtn.setForeground(Color.black);
    }//GEN-LAST:event_listaVaciaBtnMouseEntered

    private void listaVaciaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaVaciaBtnMouseExited
        listaVaciaBc.setBackground(new Color(51,51,255));
        listaVaciaBtn.setForeground(Color.white);
    }//GEN-LAST:event_listaVaciaBtnMouseExited

    private void ingresarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBtnMouseClicked
        try {
            lista.ingresarNodo();
        }catch(NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_ingresarBtnMouseClicked

    private void buscarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBtnMouseClicked
        try {
            lista.buscar();
        }catch(NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_buscarBtnMouseClicked

    private void modificarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarBtnMouseClicked
        try {
            lista.modificar();
        }catch(NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_modificarBtnMouseClicked

    private void eliminarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMouseClicked
       try {
            lista.eliminar();
        }catch(NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_eliminarBtnMouseClicked

    private void verListaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verListaBtnMouseClicked
        lista.verLista();
    }//GEN-LAST:event_verListaBtnMouseClicked

    private void listaVaciaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaVaciaBtnMouseClicked
        if(lista.listaVacia()) {
            JOptionPane.showMessageDialog(this,"La lista esta vacia");
            return;
        }
        JOptionPane.showMessageDialog(this,"La lista no esta vacia");
    }//GEN-LAST:event_listaVaciaBtnMouseClicked

    private void infoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseEntered
        infoBc.setBackground(new Color(102,102,255));
        infoBtn.setForeground(Color.black);
    }//GEN-LAST:event_infoBtnMouseEntered

    private void infoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseExited
        infoBc.setBackground(new Color(51,51,255));
        infoBtn.setForeground(Color.white);
    }//GEN-LAST:event_infoBtnMouseExited

    private void infoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseClicked
        JOptionPane.showMessageDialog(this,"LISTA ENLAZADA SIMPLE\n"
          + "   Métodos\n"
          + "       Ingresar dato -> Ingresa un dato a la lista\n"
          + "       Buscar dato -> Busca un número dentro de la lista\n"
          + "       Modificar dato -> Modifica un dato de la lista, si esta en ella\n"
          + "       Eliminar dato -> Elimina un dato de la lista, si esta en ella\n"
          + "       Ver lista -> Muestra en pantalla la lista\n"
          + "       Esta vacia -> Muestra en pantalla si la lista esta vacia o no\n"
          + " **Esta lista solo admite números enteros, cualquier otro tipo de dato no será tomado en cuenta**\n");
    }//GEN-LAST:event_infoBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscarBc;
    private javax.swing.JLabel buscarBtn;
    private javax.swing.JPanel eliminarBc;
    private javax.swing.JLabel eliminarBtn;
    private javax.swing.JPanel infoBc;
    private javax.swing.JLabel infoBtn;
    private javax.swing.JPanel ingresarBc;
    private javax.swing.JLabel ingresarBtn;
    private javax.swing.JPanel listaVaciaBc;
    private javax.swing.JLabel listaVaciaBtn;
    private javax.swing.JPanel modificarBc;
    private javax.swing.JLabel modificarBtn;
    private javax.swing.JPanel verListaBc;
    private javax.swing.JLabel verListaBtn;
    // End of variables declaration//GEN-END:variables
}
