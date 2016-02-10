/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.konnekting.suite.uicomponents.groupmonitor;

import de.root1.slicknx.GroupAddressEvent;
import de.root1.slicknx.GroupAddressListener;
import de.root1.slicknx.Knx;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author achristian
 */
public class GroupMonitorFrame extends javax.swing.JFrame {
    private Knx knx;
    
    public AtomicInteger count = new AtomicInteger(0);
    
    private final GroupAddressListener gal = new GroupAddressListener() {
        

        @Override
        public void readRequest(GroupAddressEvent event) {
            process(event);
        }

        @Override
        public void readResponse(GroupAddressEvent event) {
            process(event);
        }

        @Override
        public void write(GroupAddressEvent event) {
            process(event);
        }
        
        private void process(GroupAddressEvent gae){
            groupMonitorTableModel1.addEvent(new GroupAddressEventContainer(count.getAndIncrement(), new Date(), gae));
        }
    };

    /**
     * Creates new form GroupMonitorFrame
     */
    public GroupMonitorFrame() {
        initComponents();
    }
    
    public void setKnx(Knx knx) {
        this.knx = knx;
        count.set(0);
        knx.addGroupAddressListener("*", gal);
    }

    @Override
    public void dispose() {
        knx.removeGroupAddressListener("*", gal);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMonitorTableModel1 = new de.konnekting.suite.uicomponents.groupmonitor.GroupMonitorTableModel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(groupMonitorTableModel1);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.konnekting.suite.uicomponents.groupmonitor.GroupMonitorTableModel groupMonitorTableModel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
