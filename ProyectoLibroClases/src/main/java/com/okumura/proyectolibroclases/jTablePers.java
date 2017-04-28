/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okumura.proyectolibroclases;

/**
 *
 * @author Okumura
 */
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Okumura
 */
public class jTablePers extends JTable {

    private static final long serialVersionUID = 1L;
    private JTable table;

    /**
     * Personalized jTable
     */
    public jTablePers() {

        Object[] columnNames = null;
        Object[][] data = null;
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model) {

            private static final long serialVersionUID = 1L;

            /*@Override
            public Class getColumnClass(int column) {
            return getValueAt(0, column).getClass();
            }*/
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return Double.class;
                    case 2:
                        return Double.class;
                    case 3:
                        return Double.class;
                    default:
                        return Double.class;
                }
            }
        };
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        //JScrollPane scrollPane = new JScrollPane(table);
        //getContentPane().add(scrollPane);
        
    
    }

}