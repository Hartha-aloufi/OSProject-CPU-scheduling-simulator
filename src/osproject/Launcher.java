/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author harth
 */
public class Launcher extends javax.swing.JFrame {

    /**
     * Creates new form Launcher
     */
    public Launcher() {
        initComponents();
        waiting.setEnabled(false);
        turnaround.setEnabled(false);
        finsh.setEnabled(false);

        ButtonGroup group = new ButtonGroup();
        group.add(premitive);
        group.add(nonPremitive);

        for (int i = 0; i < SchadualAlgo.proccessT.length; i++) {
            schaedulinTech.addItem(SchadualAlgo.proccessT[i]);

        }

        procces.removeAllItems();
        schaedulinTech.removeAllItems();
        for (int i = 1; i <= 10; i++) {
            procces.addItem("P" + i);
        }

        for (int i = 0; i < SchadualAlgo.proccessT.length; i++) {
            schaedulinTech.addItem(SchadualAlgo.proccessT[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        schaedulinTech = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        procces = new javax.swing.JComboBox();
        sdf = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        arrival = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        burest = new javax.swing.JTextField();
        priority = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        waiting = new javax.swing.JTextField();
        turnaround = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        finsh = new javax.swing.JTextField();
        calc = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        premitive = new javax.swing.JRadioButton();
        nonPremitive = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        contextSwitch = new javax.swing.JTextField();
        quantum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fastInput = new javax.swing.JButton();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Process Setings"));

        schaedulinTech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        schaedulinTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schaedulinTechActionPerformed(evt);
            }
        });

        jLabel1.setText("CPU scheduling technique");

        jLabel2.setText("Proccess #");

        procces.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        procces.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                proccesItemStateChanged(evt);
            }
        });
        procces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proccesActionPerformed(evt);
            }
        });

        sdf.setBorder(javax.swing.BorderFactory.createTitledBorder("INFO\n"));

        jLabel3.setText("Arrival Time");

        arrival.setText("0");
        arrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalActionPerformed(evt);
            }
        });
        arrival.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arrivalKeyReleased(evt);
            }
        });

        jLabel4.setText("Burst Time");

        burest.setText("0");
        burest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burestActionPerformed(evt);
            }
        });
        burest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                burestKeyReleased(evt);
            }
        });

        priority.setText("0");
        priority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityActionPerformed(evt);
            }
        });
        priority.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priorityKeyReleased(evt);
            }
        });

        jLabel5.setText("Priority");

        jLabel6.setText("Waiting Time");

        waiting.setText("0");
        waiting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitingActionPerformed(evt);
            }
        });
        waiting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                waitingKeyReleased(evt);
            }
        });

        turnaround.setText("0");
        turnaround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnaroundActionPerformed(evt);
            }
        });

        jLabel7.setText("Turnaround Time");

        jLabel8.setText("Finsh Time");

        finsh.setText("0");
        finsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sdfLayout = new javax.swing.GroupLayout(sdf);
        sdf.setLayout(sdfLayout);
        sdfLayout.setHorizontalGroup(
            sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sdfLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sdfLayout.createSequentialGroup()
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sdfLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sdfLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(burest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sdfLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finsh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sdfLayout.createSequentialGroup()
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sdfLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(waiting, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sdfLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(turnaround, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34))
        );
        sdfLayout.setVerticalGroup(
            sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sdfLayout.createSequentialGroup()
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(waiting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(turnaround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(finsh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sdfLayout.createSequentialGroup()
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(burest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(sdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        calc.setText("Calc");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });

        rest.setText("Rest");
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        premitive.setSelected(true);
        premitive.setText("Premitive");

        nonPremitive.setText("non-premitive");

        jLabel9.setText("Context switch");

        jLabel10.setText("Quantum");

        contextSwitch.setText("0");

        quantum.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(premitive)
                    .addComponent(nonPremitive))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contextSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premitive)
                    .addComponent(jLabel9)
                    .addComponent(contextSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nonPremitive)
                    .addComponent(jLabel10)
                    .addComponent(quantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jButton1.setText("Show the details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show All Process INFO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fastInput.setText("Fast Input");
        fastInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(schaedulinTech, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(procces, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rest, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fastInput, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {calc, jButton1, jButton2, rest});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schaedulinTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(procces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calc)
                            .addComponent(fastInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(rest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void burestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burestActionPerformed

    private void priorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priorityActionPerformed

    private void arrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalActionPerformed
        // TODO add your handling code here:
        Proccess p = map.get(procces.getSelectedIndex());
        if (p == null) {
            p = new Proccess();
        }

        p.arrival = Integer.parseInt(arrival.getText());
    }//GEN-LAST:event_arrivalActionPerformed

    private void waitingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waitingActionPerformed

    private void turnaroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnaroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnaroundActionPerformed

    private void finshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finshActionPerformed

    private void schaedulinTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schaedulinTechActionPerformed
        // TODO add your handling code here:
        if (schaedulinTech.getSelectedIndex() != 2) {
            priority.setEnabled(false);
        } else {
            priority.setEnabled(true);
        }

    }//GEN-LAST:event_schaedulinTechActionPerformed

    private Proccess p[] ;
    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        // TODO add your handling code here:
        p = new Proccess[10];

        for (Map.Entry<Integer, Proccess> entrySet : map.entrySet()) {
            Integer key = entrySet.getKey();
            Proccess value = entrySet.getValue();

            p[key] = value;
            value.id = key;
        }
        for (int i = 0; i < p.length; i++) {
            if (p[i] == null) {
                p[i] = new Proccess();
                p[i].id = i;
            }
        }

        int algo = schaedulinTech.getSelectedIndex();
        schadualAlgo = new SchadualAlgo(p);
        switch (algo) {
            case 0:
                schadualAlgo.FCFS();
                break;
            case 1:
                if (premitive.isSelected()) {
                    schadualAlgo.SJF(true);
                } else {
                    schadualAlgo.SJF(false);
                }
                break;

            case 2:
                schadualAlgo.priorityScheduling();
                break;
            case 3:
                schadualAlgo.roundRobin();
                break;
        }

        for (int i = 0; i < schadualAlgo.drawingInstructions.count(); i++) {
            System.out.println(schadualAlgo.drawingInstructions.getInstruction(i));
        }
        Drawer localXYTaskDatasetDemo1 = new Drawer("JFreeChart : XYTaskDatasetDemo1.java", schadualAlgo.drawingInstructions, 10);
        panel.add(localXYTaskDatasetDemo1.localJPanel);
        localXYTaskDatasetDemo1.pack();
        RefineryUtilities.centerFrameOnScreen(localXYTaskDatasetDemo1);
        //localXYTaskDatasetDemo1.setVisible(true);

    }//GEN-LAST:event_calcActionPerformed

    private HashMap<Integer, Proccess> map = new HashMap<Integer, Proccess>();
    private void proccesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proccesActionPerformed
        // TODO add your handling code here:
        fillTextFileds(map.get(procces.getSelectedIndex()));

    }//GEN-LAST:event_proccesActionPerformed


    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
        // TODO add your handling code here:
        init();
        map.clear();
    }//GEN-LAST:event_restActionPerformed

    private void init() {
        finsh.setText("0");
        waiting.setText("0");
        burest.setText("0");
        priority.setText("0");
        arrival.setText("0");
        turnaround.setText("0");
        contextSwitch.setText("0");
        quantum.setText("0");
    }


    private void proccesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_proccesItemStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_proccesItemStateChanged

    private void arrivalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arrivalKeyReleased
        // TODO add your handling code here:

        Proccess p = map.get(procces.getSelectedIndex());
        if (p == null) {
            p = new Proccess();
        }

        if (!arrival.getText().isEmpty()) {
            p.arrival = Integer.parseInt(arrival.getText());
        }

        map.put(procces.getSelectedIndex(), p);
    }//GEN-LAST:event_arrivalKeyReleased

    private void burestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_burestKeyReleased
        // TODO add your handling code here:
        Proccess p = map.get(procces.getSelectedIndex());
        if (p == null) {
            p = new Proccess();
        }

        if (!burest.getText().isEmpty()) {
            p.burest = Integer.parseInt(burest.getText());
        }

        map.put(procces.getSelectedIndex(), p);
    }//GEN-LAST:event_burestKeyReleased

    private void priorityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priorityKeyReleased
        // TODO add your handling code here:
        Proccess p = map.get(procces.getSelectedIndex());
        if (p == null) {
            p = new Proccess();
        }

        if (!burest.getText().isEmpty()) {
            p.priority = Integer.parseInt(priority.getText());
        }

        map.put(procces.getSelectedIndex(), p);
    }//GEN-LAST:event_priorityKeyReleased

    private void waitingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_waitingKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_waitingKeyReleased

    private void fastInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastInputActionPerformed
        // TODO add your handling code here:

        JFrame inputFrame = new JFrame("Fast Input");
        JTextArea textArea = new JTextArea();
        JButton done = new JButton("Done");
        inputFrame.add(textArea);
        inputFrame.add(done, BorderLayout.SOUTH);
        textArea.setText("Input Format :\nfor each process enter it's info in a single line as follw:\nid,arrivalTime,burstTime,priority\n");

        Font font = textArea.getFont();
        float size = font.getSize() + 5;
        textArea.setFont(font.deriveFont(size));

        inputFrame.setSize(500, 500);
        inputFrame.setLocationRelativeTo(null);
        inputFrame.setVisible(true);
        done.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String str = textArea.getText();
                StringTokenizer lines = new StringTokenizer(str, "\n");

                lines.nextToken();
                lines.nextToken();
                lines.nextToken();

                while (lines.hasMoreTokens()) {
                    StringTokenizer info = new StringTokenizer(lines.nextToken(), ",");

                    int id = Integer.parseInt(info.nextToken());
                    int arr = Integer.parseInt(info.nextToken());
                    int burs = Integer.parseInt(info.nextToken());

                    map.put(id, new Proccess(id, arr, burs));
                }

                inputFrame.setVisible(false);
            }
        });
    }//GEN-LAST:event_fastInputActionPerformed

    private SchadualAlgo schadualAlgo;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        JFrame inputFrame = new JFrame("Details");
        JTextArea textArea = new JTextArea();
        JButton done = new JButton("Done");
        inputFrame.add(textArea);
        inputFrame.add(done, BorderLayout.SOUTH);

        Font font = textArea.getFont();
        float size = font.getSize() + 5;
        textArea.setFont(font.deriveFont(size));
        textArea.setEditable(false);

        inputFrame.setSize(600, 600);
        inputFrame.setLocationRelativeTo(null);
        inputFrame.setVisible(true);
        StringBuilder details = new StringBuilder();
        
        for (int i = 0; i < schadualAlgo.drawingInstructions.count(); i++) {
            details.append(schadualAlgo.drawingInstructions.getInstruction(i).toString());
        }
        
        textArea.setText(details.toString());
        done.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent ae) {
                inputFrame.setVisible(false);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         JFrame inputFrame = new JFrame("Details");
        JTextArea textArea = new JTextArea();
        JButton done = new JButton("Done");
        inputFrame.add(textArea);
        inputFrame.add(done, BorderLayout.SOUTH);

        Font font = textArea.getFont();
        float size = font.getSize() + 5;
        textArea.setFont(font.deriveFont(size));
        textArea.setEditable(false);

        inputFrame.setSize(600, 600);
        inputFrame.setLocationRelativeTo(null);
        inputFrame.setVisible(true);
        StringBuilder details = new StringBuilder();
        
        for (int i = 0; i < p.length; i++) {
            details.append(p[i].toString());
        }
        
        textArea.setText(details.toString());
        done.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent ae) {
                inputFrame.setVisible(false);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fillTextFileds(Proccess p) {
        if (p == null) {
            finsh.setText("0");
            waiting.setText("0");
            burest.setText("0");
            priority.setText("0");
            arrival.setText("0");
            turnaround.setText("0");
        } else {

            finsh.setText(String.valueOf(p.finsh));
            waiting.setText(String.valueOf(p.waiting));
            burest.setText(String.valueOf(p.burest));
            priority.setText(String.valueOf(p.priority));
            arrival.setText(String.valueOf(p.arrival));
            turnaround.setText(String.valueOf(p.turnaround));
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrival;
    private javax.swing.JTextField burest;
    private javax.swing.JButton calc;
    private javax.swing.JTextField contextSwitch;
    private javax.swing.JButton fastInput;
    private javax.swing.JTextField finsh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton nonPremitive;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton premitive;
    private javax.swing.JTextField priority;
    private javax.swing.JComboBox procces;
    private javax.swing.JTextField quantum;
    private javax.swing.JButton rest;
    private javax.swing.JComboBox schaedulinTech;
    private javax.swing.JPanel sdf;
    private javax.swing.JTextField turnaround;
    private javax.swing.JTextField waiting;
    // End of variables declaration//GEN-END:variables
}
