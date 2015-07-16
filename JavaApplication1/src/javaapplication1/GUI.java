/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author adrian
 */
public class GUI extends JFrame {
    String url;
    Cronometro cronometro;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        cronometro = new Cronometro();
        setTitle("Lector RSS");
        setLocationRelativeTo(null);
        setVisible(true);
    }
        public void MostrarFeed(){
        Productor parser1=null,parser2=null,parser3=null,parser4=null,parser5=null,parser6=null,parser7=null,parser8=null,parser9=null,parser10=null;
        Consumidor consu1=null,consu2=null,consu3=null,consu4=null,consu5=null,consu6=null,consu7=null,consu8=null,consu9=null,consu10=null;
        ProductorConsumidor pc;
        LinkedList<String> copiaList;
        String link;
        int i = JavaApplication1.ListURL.size();
        System.out.println(i);
        pc = new ProductorConsumidor(JavaApplication1.pilaFeed);
        copiaList = (LinkedList < String >)JavaApplication1.ListURL.clone();
        if (!copiaList.isEmpty()){
            switch (i){
                case 1:
                        link = copiaList.remove();
                        parser1 = new Productor(link,pc);
                        consu1 = new Consumidor(pc);
                        parser1.start();
                        consu1.start();
                        break;  
                case 2:
                        link = copiaList.remove();
                        parser1 = new Productor(link,pc);
                        link = copiaList.remove();
                        parser2 = new Productor(link,pc);
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        parser1.start();
                        parser2.start();
                        consu1.start();
                        consu2.start();
                        
                        break;  
                case 3:
                        parser1 = new Productor(copiaList.remove(),pc);
                        parser2 = new Productor(copiaList.remove(),pc);
                        parser3 = new Productor(copiaList.remove(),pc);
                        parser1.start();
                        parser2.start();
                        parser3.start();
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        consu3= new Consumidor(pc);
                        consu1.start();
                        consu2.start();
                        consu3.start();
                        break;      
                case 4:

                        parser1 = new Productor(copiaList.remove(),pc);
                        parser2 = new Productor(copiaList.remove(),pc);
                        parser3 = new Productor(copiaList.remove(),pc);
                        parser4 = new Productor(copiaList.remove(),pc);
                        parser1.start();
                        parser2.start();
                        parser3.start();
                        parser4.start();
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        consu3= new Consumidor(pc);
                        consu4=new Consumidor(pc);
                        consu1.start();
                        consu2.start();
                        consu3.start();
                        consu4.start();
                        break;  
                case 5:

                        parser1 = new Productor(copiaList.remove(),pc);
                        parser2 = new Productor(copiaList.remove(),pc);
                        parser3 = new Productor(copiaList.remove(),pc);
                        parser4 = new Productor(copiaList.remove(),pc);
                        parser5 = new Productor(copiaList.remove(),pc);
                        parser1.start();
                        parser2.start();
                        parser3.start();
                        parser4.start();
                        parser5.start();
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        consu3= new Consumidor(pc);
                        consu4=new Consumidor(pc);
                        consu5=new Consumidor(pc);
                        consu1.start();
                        consu2.start();
                        consu3.start();
                        consu4.start();
                        consu5.start();
                        
                        break;  
                case 6:
                        parser1 = new Productor(copiaList.remove(),pc);
                        parser2 = new Productor(copiaList.remove(),pc);
                        parser3 = new Productor(copiaList.remove(),pc);
                        parser4 = new Productor(copiaList.remove(),pc);
                        parser5 = new Productor(copiaList.remove(),pc);
                        parser6 = new Productor(copiaList.remove(),pc);
                        parser1.start();
                        parser2.start();
                        parser3.start();
                        parser4.start();
                        parser5.start();
                        parser6.start();
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        consu3= new Consumidor(pc);
                        consu4=new Consumidor(pc);
                        consu5=new Consumidor(pc);
                        consu6=new Consumidor(pc);
                        consu1.start();
                        consu2.start();
                        consu3.start();
                        consu4.start();
                        consu5.start();
                        consu6.start();
                        break;  
                case 7:
                        parser1 = new Productor(copiaList.remove(),pc);
                        parser2 = new Productor(copiaList.remove(),pc);
                        parser3 = new Productor(copiaList.remove(),pc);
                        parser4 = new Productor(copiaList.remove(),pc);
                        parser5 = new Productor(copiaList.remove(),pc);
                        parser6 = new Productor(copiaList.remove(),pc);
                        parser7 = new Productor(copiaList.remove(),pc);
                        parser1.start();
                        parser2.start();
                        parser3.start();
                        parser4.start();
                        parser5.start();
                        parser6.start();
                        parser7.start();
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        consu3= new Consumidor(pc);
                        consu4=new Consumidor(pc);
                        consu5=new Consumidor(pc);
                        consu6=new Consumidor(pc);
                        consu7=new Consumidor(pc);
                        consu1.start();
                        consu2.start();
                        consu3.start();
                        consu4.start();
                        consu5.start();
                        consu6.start();
                        consu7.start();
                        break;  
                case 8:
                        parser1 = new Productor(copiaList.remove(),pc);
                        parser2 = new Productor(copiaList.remove(),pc);
                        parser3 = new Productor(copiaList.remove(),pc);
                        parser4 = new Productor(copiaList.remove(),pc);
                        parser5 = new Productor(copiaList.remove(),pc);
                        parser6 = new Productor(copiaList.remove(),pc);
                        parser7 = new Productor(copiaList.remove(),pc);
                        parser8 = new Productor(copiaList.remove(),pc);
                        parser1.start();
                        parser2.start();
                        parser3.start();
                        parser4.start();
                        parser5.start();
                        parser6.start();
                        parser7.start();
                        parser8.start();
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        consu3= new Consumidor(pc);
                        consu4=new Consumidor(pc);
                        consu5=new Consumidor(pc);
                        consu6=new Consumidor(pc);
                        consu7=new Consumidor(pc);
                        consu8=new Consumidor(pc);
                        consu1.start();
                        consu2.start();
                        consu3.start();
                        consu4.start();
                        consu5.start();
                        consu6.start();
                        consu7.start();
                        consu8.start();
                        break;  
                case 9:
                        parser1 = new Productor(copiaList.remove(),pc);
                        parser2 = new Productor(copiaList.remove(),pc);
                        parser3 = new Productor(copiaList.remove(),pc);
                        parser4 = new Productor(copiaList.remove(),pc);
                        parser5 = new Productor(copiaList.remove(),pc);
                        parser6 = new Productor(copiaList.remove(),pc);
                        parser7 = new Productor(copiaList.remove(),pc);
                        parser8 = new Productor(copiaList.remove(),pc);
                        parser9 = new Productor(copiaList.remove(),pc);
                        parser1.start();
                        parser2.start();
                        parser3.start();
                        parser4.start();
                        parser5.start();
                        parser6.start();
                        parser7.start();
                        parser8.start();
                        parser9.start();
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        consu3= new Consumidor(pc);
                        consu4=new Consumidor(pc);
                        consu5=new Consumidor(pc);
                        consu6=new Consumidor(pc);
                        consu7=new Consumidor(pc);
                        consu8=new Consumidor(pc);
                        consu9=new Consumidor(pc);
                        consu1.start();
                        consu2.start();
                        consu3.start();
                        consu4.start();
                        consu5.start();
                        consu6.start();
                        consu7.start();
                        consu8.start();
                        consu9.start();
                        break;  
                case 10:
                        parser1 = new Productor(copiaList.remove(),pc);
                        parser2 = new Productor(copiaList.remove(),pc);
                        parser3 = new Productor(copiaList.remove(),pc);
                        parser4 = new Productor(copiaList.remove(),pc);
                        parser5 = new Productor(copiaList.remove(),pc);
                        parser6 = new Productor(copiaList.remove(),pc);
                        parser7 = new Productor(copiaList.remove(),pc);
                        parser8 = new Productor(copiaList.remove(),pc);
                        parser9 = new Productor(copiaList.remove(),pc);
                        parser10 = new Productor(copiaList.remove(),pc);
                        consu1=new Consumidor(pc);
                        consu2=new Consumidor(pc);
                        consu3= new Consumidor(pc);
                        consu4=new Consumidor(pc);
                        consu5=new Consumidor(pc);
                        consu6=new Consumidor(pc);
                        consu7=new Consumidor(pc);
                        consu8=new Consumidor(pc);
                        consu9=new Consumidor(pc);
                        consu10=new Consumidor(pc);
                        parser1.start();
                        parser2.start();
                        parser3.start();
                        parser4.start();
                        parser5.start();
                        parser6.start();
                        parser7.start();
                        parser8.start();
                        parser9.start();
                        parser10.start();
                        consu1.start();
                        consu2.start();
                        consu3.start();
                        consu4.start();
                        consu5.start();
                        consu6.start();
                        consu7.start();
                        consu8.start();
                        consu9.start();
                        consu10.start();
                        break; 
                    }
            }

        }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        nombrerss = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        Texturl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tiempo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 204));

        nombrerss.setText("Ingrese RSS:");

        Texto.setEditable(false);
        Texto.setColumns(20);
        Texto.setRows(5);
        Texto.setMaximumSize(new java.awt.Dimension(200, 2147483647));
        scroll.setViewportView(Texto);

        Texturl.setText("http://");
        Texturl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexturlActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Refrescar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tiempo.setText("00:00");

        jLabel1.setText("Actualizar en:");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(nombrerss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texturl)
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButton3)
                                .addGap(235, 235, 235)
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)
                                .addComponent(tiempo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrerss, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texturl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiempo)
                            .addComponent(jLabel1)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setForeground(new java.awt.Color(51, 204, 255));

        jMenu1.setText("Inicio");

        jMenuItem1.setText("Quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem2.setText("Configuración");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Acerca de...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void TexturlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexturlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexturlActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setBackground(Color.yellow);
        url =Texturl.getText();
        Texturl.setText("");
        JavaApplication1.ListURL.add(url);
        MostrarFeed();
        if(JavaApplication1.cronometroActivo)
            cronometro.start();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        ImageIcon img;
        JPanel pa;
        JLabel j;
        JTextArea txt;

        JFrame frame=new JFrame();
        frame.setTitle("Acerca de...");
        frame.setSize(400,360);
        frame.setResizable(false);

        img= new ImageIcon("fiec.jpg");

        pa= new JPanel();

        j=new JLabel(img);

        txt=new JTextArea("\n\nIntegrantes del grupo que realizaron el proyecto:\n\n"
            + "          Cristina Estefania Barreno Pena\n         Jaime Adrian Aguilar Romero \n"
            + "          Marlon Vinicio Loayza Feijoo\n\n\n");
        txt.setEditable(false);
        pa.add(txt);
        pa.add(j);
        pa.setBackground(Color.WHITE);

        frame.add(pa);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        opciones opcion= new opciones();
            if(JavaApplication1.cronometroActivo==true)
                cronometro.start();
            

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        MostrarFeed();
        if(JavaApplication1.cronometroActivo==true){
            //cronometro.destroy();
            //.setText(JavaApplication1.tiempoConexion + "00");
            cronometro.start();
            
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                Texto.setText("hola q hace");
            }
        } );
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel Panel;
    public static javax.swing.JTextArea Texto;
    private static javax.swing.JTextField Texturl;
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JMenu jMenu1;
    private static javax.swing.JMenu jMenu2;
    private static javax.swing.JMenuBar jMenuBar1;
    private static javax.swing.JMenuItem jMenuItem1;
    private static javax.swing.JMenuItem jMenuItem2;
    private static javax.swing.JMenuItem jMenuItem3;
    private static javax.swing.JLabel nombrerss;
    private static javax.swing.JScrollPane scroll;
    public static javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
