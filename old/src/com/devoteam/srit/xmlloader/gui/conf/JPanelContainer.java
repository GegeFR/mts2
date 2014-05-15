/*
* Copyright 2012 Devoteam http://www.devoteam.com
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
*
* This file is part of Multi-Protocol Test Suite (MTS).
*
* Multi-Protocol Test Suite (MTS) is free software: you can redistribute
* it and/or modify it under the terms of the GNU General Public License 
* as published by the Free Software Foundation, either version 3 of the 
* License.
* 
* Multi-Protocol Test Suite (MTS) is distributed in the hope that it will
* be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
* of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with Multi-Protocol Test Suite (MTS).  
* If not, see <http://www.gnu.org/licenses/>. 
*
*//*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPanelContainer.java
 *
 * Created on 30 juin 2010, 16:26:49
 */

package com.devoteam.srit.xmlloader.gui.conf;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.util.Vector;
import javax.swing.JPanel;

/**
 *
 * @author jbor
 */
public class JPanelContainer extends javax.swing.JPanel {


    private Vector<JPanelGeneric> listOfPanelGeneric;

    /** Creates new form JPanelContainer */
    public JPanelContainer() {
        initComponents();
        this.listOfPanelGeneric = new Vector<JPanelGeneric>();
        this.clean();
        addJPanelGeneric(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setAlignmentY(0.0F);
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(600, 32767));
        setLayout(new java.awt.GridBagLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void clean(){
        this.removeAll();
        GridBagConstraints gridBagConstraintsTest = new GridBagConstraints();
        gridBagConstraintsTest.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraintsTest.gridx = 0;
        gridBagConstraintsTest.gridwidth = 1;
        gridBagConstraintsTest.weightx = 1;

        this.add(new JPanelColumn(), gridBagConstraintsTest);
    }

    public void addJPanelGeneric (JPanelGeneric jPanelGeneric){
        if(null != jPanelGeneric){
           
            GridBagConstraints gridBagConstraintsTest = new GridBagConstraints();
            gridBagConstraintsTest.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraintsTest.gridx = 0;
            gridBagConstraintsTest.gridwidth = 1;
            gridBagConstraintsTest.weightx = 1;

            this.listOfPanelGeneric.add(jPanelGeneric);
            this.add(jPanelGeneric, gridBagConstraintsTest);
            this.validate();
            jPanelGeneric.init();
        }
        else{
            GridBagConstraints gridBagConstraintsPadding = new GridBagConstraints();
            gridBagConstraintsPadding.fill = GridBagConstraints.VERTICAL;
            gridBagConstraintsPadding.gridx = 0;
            gridBagConstraintsPadding.gridwidth = 1;
            gridBagConstraintsPadding.weighty = 1;

            JPanel jPanel = new JPanel();
            jPanel.setMinimumSize(new Dimension(0, 0));
            jPanel.setPreferredSize(new Dimension(0, 0));

            this.add(jPanel, gridBagConstraintsPadding);
            this.validate();
        }
    }
    
    public Vector<JPanelGeneric> getListOfGeneric(){
        return this.listOfPanelGeneric;
    }

    public boolean isModified(){
        for(JPanelGeneric panel:listOfPanelGeneric){
            if(panel.isModified()) return true;
        }
        return false;
    }

    public boolean restartNeeded(){
        for(JPanelGeneric panel:listOfPanelGeneric){
            if(panel.isModified() && panel.getRestart()) return true;
        }
        return false;
    }

    public void resetListOfPanelGeneric(){
        this.listOfPanelGeneric.removeAllElements();
    }
    
    public JPanelGeneric getJPanelGeneric(String nameOfParameter){
        JPanelGeneric panel = null;
        for (int j = 0; j < this.listOfPanelGeneric.size(); j++){
            if (this.listOfPanelGeneric.get(j).getName().equals(nameOfParameter)){
                panel = this.listOfPanelGeneric.get(j);
                break;
            }
        }
        return panel;
    }
}