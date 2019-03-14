/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Department;
import data.Player;
import data.Unit;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Nicolas Moreno
 */
public class GUI extends javax.swing.JFrame implements UI{
    
    private HashMap<String,Department> departments = new HashMap<>();
    private ArrayList<DepartmentButton> departmentButtons = new ArrayList<>();

    /**
     * Creates new form GUI2
     */
    public GUI() {
        initComponents();
        initDepartments();
    }
    
    private void initDepartments(){
        guania = new DepartmentButton();
        guaviare = new DepartmentButton();
        huila = new DepartmentButton();
        meta = new DepartmentButton();
        narinio = new DepartmentButton();
        norte_santander = new DepartmentButton();
        putumayo = new DepartmentButton();
        quindio = new DepartmentButton();
        atlantico = new DepartmentButton();
        risaralda = new DepartmentButton();
        caqueta = new DepartmentButton();
        arauca = new DepartmentButton();
        sucre = new DepartmentButton();
        bolivar = new DepartmentButton();
        tolima = new DepartmentButton();
        boyaca = new DepartmentButton();
        valle_cauca = new DepartmentButton();
        caldas = new DepartmentButton();
        vaupes = new DepartmentButton();
        casanare = new DepartmentButton();
        vichada = new DepartmentButton();
        cauca = new DepartmentButton();
        santander = new DepartmentButton();
        choco = new DepartmentButton();
        guajira = new DepartmentButton();
        magdalena = new DepartmentButton();
        cesar = new DepartmentButton();
        amazonas = new DepartmentButton();
        antioquia = new DepartmentButton();
        cordoba = new DepartmentButton();
        cundinamarca = new DepartmentButton();
        
        
        setUpButton(guania,"Guania"); 
        setUpButton(guaviare,"Guaviare");
        setUpButton(huila,"Guila");
        setUpButton(meta,"Meta");
        setUpButton(narinio,"Nariño");
        setUpButton(norte_santander,"Norte de Santander");
        setUpButton(putumayo,"Putumayo");
        setUpButton(quindio,"Quindio");
        setUpButton(atlantico,"Atlantico");
        setUpButton(risaralda,"Risaralda");
        setUpButton(caqueta,"Caqueta");
        setUpButton(arauca,"Arauca");
        setUpButton(sucre,"Sucre");
        setUpButton(bolivar,"Bolivar");
        setUpButton(tolima,"Tolima");
        setUpButton(boyaca,"Boyaca");
        setUpButton(valle_cauca,"Valle");
        setUpButton(caldas,"Caldas");
        setUpButton(vaupes,"Vaupes");
        setUpButton(casanare,"Casanare");
        setUpButton(vichada,"Vichada");
        setUpButton(cauca,"Cauca");
        setUpButton(santander,"Santander");
        setUpButton(choco,"Choco");
        setUpButton(guajira,"Guajira");
        setUpButton(magdalena,"Magdalena");
        setUpButton(cesar,"Cesar");
        setUpButton(amazonas,"Amazonas");
        setUpButton(antioquia,"Antioquia");
        setUpButton(cordoba,"Cordoba");
        setUpButton(cundinamarca,"Cundinamarca");
        
        updateDepartmentButtonsAction("default");
        locateDepartments();
    }
    
    private void locateDepartments(){
        scenaryPanel.add(amazonas, new AbsoluteConstraints(273, 513, -1, -1));
        scenaryPanel.add(antioquia, new AbsoluteConstraints(129, 213, -1, -1));
        scenaryPanel.add(arauca, new AbsoluteConstraints(280, 208, -1, -1));
        scenaryPanel.add(atlantico, new AbsoluteConstraints(155, 57, -1, -1));
        scenaryPanel.add(bolivar, new AbsoluteConstraints(180, 144, -1, -1));
        scenaryPanel.add(boyaca, new AbsoluteConstraints(217, 260, -1, -1));
        scenaryPanel.add(caldas, new AbsoluteConstraints(137, 264, -1, -1));
        scenaryPanel.add(caqueta, new AbsoluteConstraints(170, 419, -1, -1));
        scenaryPanel.add(casanare, new AbsoluteConstraints(272, 261, -1, -1));
        scenaryPanel.add(cauca, new AbsoluteConstraints(69, 365, -1, -1));
        scenaryPanel.add(cesar, new AbsoluteConstraints(207, 90, -1, -1));
        scenaryPanel.add(choco, new AbsoluteConstraints(78, 249, -1, -1));
        scenaryPanel.add(cordoba, new AbsoluteConstraints(115, 154, -1, -1));
        scenaryPanel.add(cundinamarca, new AbsoluteConstraints(178, 278, -1, -1));
        scenaryPanel.add(guania, new AbsoluteConstraints(370, 359, -1, -1));
        scenaryPanel.add(guaviare, new AbsoluteConstraints(246, 388, -1, -1));
        scenaryPanel.add(huila, new AbsoluteConstraints(128, 358, -1, -1));
        scenaryPanel.add(guajira, new AbsoluteConstraints(238, 41, -1, -1));
        scenaryPanel.add(magdalena, new AbsoluteConstraints(179, 64, -1, -1));
        scenaryPanel.add(meta, new AbsoluteConstraints(214, 330, -1, -1));
        scenaryPanel.add(narinio, new AbsoluteConstraints(31, 401, -1, -1));
        scenaryPanel.add(norte_santander, new AbsoluteConstraints(226, 147, -1, -1));
        scenaryPanel.add(putumayo, new AbsoluteConstraints(89, 435, -1, -1));
        scenaryPanel.add(quindio, new AbsoluteConstraints(123, 291, -1, -1));
        scenaryPanel.add(risaralda, new AbsoluteConstraints(113, 268, -1, -1));
        scenaryPanel.add(santander, new AbsoluteConstraints(208, 211, -1, -1));
        scenaryPanel.add(sucre, new AbsoluteConstraints(150, 127, -1, -1));
        scenaryPanel.add(tolima, new AbsoluteConstraints(136, 317, -1, -1));
        scenaryPanel.add(valle_cauca, new AbsoluteConstraints(81, 326, -1, -1));
        scenaryPanel.add(vaupes, new AbsoluteConstraints(307, 427, -1, -1));
        scenaryPanel.add(vichada, new AbsoluteConstraints(351, 281, -1, -1));
    }
    
    private void setUpButton(DepartmentButton button, String name){
        button.setIcon(new ImageIcon("src/resources/assets/target.png"));
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(15,15));
        button.setBorderPainted(false);
        button.setDepartmentName(name);
        departmentButtons.add(button);
        
    }
    
    private void updateDepartmentButtonsAction(String mode){
        for(DepartmentButton button : departmentButtons){
            if(button.getActionListeners().length>0){
                button.removeActionListener(button.getActionListeners()[0]);
            }
            
            if("default".equals(mode)){
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        DepartmentButton departmentButton = (DepartmentButton) e.getSource();
                        showDepartmentInfo(departments.get(departmentButton.getDepartmentName()));
                    }
                });
            }
            if("target".equals(mode)){
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        DepartmentButton departmentButton = (DepartmentButton) e.getSource();
                        targetDepartment = departments.get(departmentButton.departmentName);
                        changeActionButtonsStatus(true);
                    }
                });
            }
        }
        
        
    }
    
    private void showDepartmentInfo(Department department){
       dNameLabel.setText(department.getName());
       dOwnerLabel.setText(department.getOwner().getFaction());
       
       int soldierNumber =0;
       int horseNumber = 0;
       int tankNumber = 0;
       
       int totalArmies=0;
       
       for(Unit unit : department.getUnits()){
           switch(unit.getName()){
               case "soldier":
                   soldierNumber ++;
                   break;
               case "tank":
                   tankNumber ++;
                   break;
               case "horse":
                   horseNumber ++;
                   break;   
           }
           totalArmies += unit.getArmies();
       }
       dArmyLabel.setText(String.valueOf(totalArmies));
       SONumberLabel.setText(String.valueOf(soldierNumber));
       CANumberLabel.setText(String.valueOf(horseNumber));
       TANumberLabel.setText(String.valueOf(tankNumber));
       
   }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuPanel = new javax.swing.JPanel();
        scenaryPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dOwnerLabel = new javax.swing.JLabel();
        dArmyLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SONumberLabel = new javax.swing.JLabel();
        CANumberLabel = new javax.swing.JLabel();
        TANumberLabel = new javax.swing.JLabel();
        dNameLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        oTerritoriesLabel = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        putUnitButton = new javax.swing.JButton();
        endTurnButton = new javax.swing.JButton();
        actionPanel = new javax.swing.JPanel();
        factionNameLabel = new javax.swing.JLabel();
        factionLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nAvaliableArmiesLabel = new javax.swing.JLabel();
        unitPanel = new javax.swing.JPanel();
        putSoldierButton = new javax.swing.JButton();
        putHorseButton = new javax.swing.JButton();
        putTankButton = new javax.swing.JButton();

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        scenaryPanel.setSize(new java.awt.Dimension(600, 750));
        scenaryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoPanel.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setText("Departamento");

        jLabel2.setText("Alineacion:");

        jLabel3.setText("Ejercitos:");

        jLabel6.setText("SO");

        jLabel7.setText("CA");

        jLabel8.setText("TA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SONumberLabel)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CANumberLabel)
                            .addComponent(jLabel7))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(TANumberLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dArmyLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(dOwnerLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(dNameLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dNameLabel)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(dOwnerLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dArmyLabel))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SONumberLabel)
                    .addComponent(CANumberLabel)
                    .addComponent(TANumberLabel))
                .addContainerGap())
        );

        jLabel4.setText("Territorios Conquistados");

        oTerritoriesLabel.setColumns(20);
        oTerritoriesLabel.setLineWrap(true);
        oTerritoriesLabel.setRows(5);
        jScrollPane1.setViewportView(oTerritoriesLabel);
        oTerritoriesLabel.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("Acciones");

        attackButton.setText("Atacar");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        putUnitButton.setText("Colocar Tropas");
        putUnitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putUnitButtonActionPerformed(evt);
            }
        });

        endTurnButton.setText("Finalizar Turno");
        endTurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTurnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(endTurnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(putUnitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(attackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(putUnitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endTurnButton)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        actionButtons.add(attackButton);
        actionButtons.add(putUnitButton);
        actionButtons.add(endTurnButton);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        scenaryPanel.add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 180, 630));

        actionPanel.setBackground(new java.awt.Color(204, 102, 255));

        factionNameLabel.setText("Turno de Faccion:");

        factionLabel.setText("jLabel9");

        jLabel9.setText("Ejercitos Disponibles:");

        nAvaliableArmiesLabel.setText("jLabel11");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nAvaliableArmiesLabel)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nAvaliableArmiesLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        putSoldierButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        putSoldierButton.setText("SO");
        putSoldierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putSoldierButtonActionPerformed(evt);
            }
        });

        putHorseButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        putHorseButton.setText("CA");
        putHorseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putHorseButtonActionPerformed(evt);
            }
        });

        putTankButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        putTankButton.setText("TA");
        putTankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putTankButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout unitPanelLayout = new javax.swing.GroupLayout(unitPanel);
        unitPanel.setLayout(unitPanelLayout);
        unitPanelLayout.setHorizontalGroup(
            unitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(putSoldierButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(putTankButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(putHorseButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        unitPanelLayout.setVerticalGroup(
            unitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(unitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putSoldierButton)
                    .addComponent(putHorseButton)
                    .addComponent(putTankButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        unitButtons.add(putSoldierButton);
        unitButtons.add(putHorseButton);
        unitButtons.add(putTankButton);

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(factionNameLabel))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(factionLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(factionNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(factionLabel)
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );

        scenaryPanel.add(actionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 640, 80));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        // TODO add your handling code here:
        action = "attack";
    }//GEN-LAST:event_attackButtonActionPerformed

    private void putUnitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putUnitButtonActionPerformed
        // TODO add your handling code here:
        action = "putUnits";
    }//GEN-LAST:event_putUnitButtonActionPerformed

    private void endTurnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTurnButtonActionPerformed
        // TODO add your handling code here:
        action = "endTurn";
    }//GEN-LAST:event_endTurnButtonActionPerformed

    private void putSoldierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putSoldierButtonActionPerformed
        // TODO add your handling code here:
        selectedUnit = "soldier";
    }//GEN-LAST:event_putSoldierButtonActionPerformed

    private void putTankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putTankButtonActionPerformed
        // TODO add your handling code here:
        selectedUnit = "tank";
    }//GEN-LAST:event_putTankButtonActionPerformed

    private void putHorseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putHorseButtonActionPerformed
        // TODO add your handling code here:
        selectedUnit = "horse";
    }//GEN-LAST:event_putHorseButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CANumberLabel;
    private javax.swing.JLabel SONumberLabel;
    private javax.swing.JLabel TANumberLabel;
    private javax.swing.JPanel actionPanel;
    private javax.swing.JButton attackButton;
    private javax.swing.JLabel dArmyLabel;
    private javax.swing.JLabel dNameLabel;
    private javax.swing.JLabel dOwnerLabel;
    private javax.swing.JButton endTurnButton;
    private javax.swing.JLabel factionLabel;
    private javax.swing.JLabel factionNameLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nAvaliableArmiesLabel;
    private javax.swing.JTextArea oTerritoriesLabel;
    private javax.swing.JButton putHorseButton;
    private javax.swing.JButton putSoldierButton;
    private javax.swing.JButton putTankButton;
    private javax.swing.JButton putUnitButton;
    private javax.swing.JPanel scenaryPanel;
    private javax.swing.JPanel unitPanel;
    // End of variables declaration//GEN-END:variables

    
    //custom Swing elements
    
    private DepartmentButton amazonas;
    private DepartmentButton antioquia;
    private DepartmentButton arauca;
    private DepartmentButton atlantico;
    private DepartmentButton bolivar;
    private DepartmentButton boyaca;
    private DepartmentButton caldas;
    private DepartmentButton caqueta;
    private DepartmentButton casanare;
    private DepartmentButton cauca;
    private DepartmentButton cesar;
    private DepartmentButton choco;
    private DepartmentButton cordoba;
    private DepartmentButton cundinamarca;
    private DepartmentButton guajira;
    private DepartmentButton guania;
    private DepartmentButton guaviare;
    private DepartmentButton huila;
    private DepartmentButton magdalena;
    private DepartmentButton meta;
    private DepartmentButton narinio;
    private DepartmentButton norte_santander;
    private DepartmentButton putumayo;
    private DepartmentButton quindio;
    private DepartmentButton risaralda;
    private DepartmentButton santander;
    private DepartmentButton sucre;
    private DepartmentButton tolima;
    private DepartmentButton valle_cauca;
    private DepartmentButton vaupes;
    private DepartmentButton vichada;
    
    private ArrayList<JButton> actionButtons = new ArrayList<>();
    private ArrayList<JButton> unitButtons = new ArrayList<>();
    
    private String action;
    private String selectedUnit;
    private Department targetDepartment;
    
    
    
    
    @Override
    public String selectUnit() {
         JOptionPane.showMessageDialog(null,
                "Por favor seleccione el tipo de unidad a colocar","Information",
                JOptionPane.INFORMATION_MESSAGE);
         changeUnitButtonsStatus(true);
         while(selectedUnit == null){
             sleep();
         }
        changeUnitButtonsStatus(false);
        String value = String.valueOf(selectedUnit);
        selectedUnit = null;
        return value;
    }

    @Override
    public Department selectDepartment() {
        JOptionPane.showMessageDialog(null,
                "Por favor seleccione el departamento a coloar la unidad","Information",
                JOptionPane.INFORMATION_MESSAGE);
        return targetDepartment();
    }
    
    @Override
    public Department selectAttackerDepartment() {
        JOptionPane.showMessageDialog(null,
                "Por favor seleccione el departamento desde el cual desea atacar","Information",
                JOptionPane.INFORMATION_MESSAGE);
        return targetDepartment();
    }

    @Override
    public Department selectTargetDepartment() {
        JOptionPane.showMessageDialog(null,
                "Por favor seleccione el departamento al que desea atacar","Information",
                JOptionPane.INFORMATION_MESSAGE);
        return targetDepartment();
    }

    @Override
    public void printMap(HashMap<String,Department> departments) {
        this.departments = departments;
        
        this.setSize(650, 750);
        
        MapPanel colombiaMap = new MapPanel();
        scenaryPanel.add(colombiaMap, new AbsoluteConstraints(0, 0, 600, 640));
        scenaryPanel.setSize(this.getSize());
        
        this.add(scenaryPanel);
        scenaryPanel.setVisible(true);
        changeUnitButtonsStatus(false);
        this.setVisible(true);
        
    }
    
                  
    @Override
    public void printPlayerDepartments(ArrayList<Department> departments) {
        StringBuilder info = new StringBuilder();
        for(Department department : departments){
            info.append(department.getName() + "|");
        }
        oTerritoriesLabel.setText(info.toString());
    }

    @Override
    public void printPlayerStatus(Player player) {
        nAvaliableArmiesLabel.setText(String.valueOf(player.getAvaliableArmies()));   
        factionLabel.setText(player.getFaction());
    }

    @Override
    public String askForAction() {
        changeActionButtonsStatus(true);
        while(action==null){
            sleep();
        }
        changeActionButtonsStatus(false);
        String value = String.valueOf(action);
        action = null;
        return value;
    }
    
    private Department targetDepartment(){
        updateDepartmentButtonsAction("target");
        while(targetDepartment == null){
            sleep();
        }
        Department selectedDepartment = targetDepartment;
        targetDepartment = null;
        updateDepartmentButtonsAction("default");
        return selectedDepartment;
    }
    
    private void changeActionButtonsStatus(Boolean status){
        actionButtons.forEach((button)->{
            button.setEnabled(status);
        });
    }
    
    private void changeUnitButtonsStatus(Boolean status){
        unitButtons.forEach((button)->{
            button.setEnabled(status);
        });
    }
    
    private void sleep(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void showUnitError() {
        JOptionPane.showMessageDialog(null,
                "Ejercitos insuficientes","Error",
                JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void showSuccessUnit() {
        JOptionPane.showMessageDialog(null,
                "Unidad creada con exito","Information",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void showUnitDepartmentError() {
        JOptionPane.showMessageDialog(null,
                "El departamento seleccionado no esvalido","Information",
                JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void printError(String errorMessage) {
        JOptionPane.showMessageDialog(null,
                errorMessage,"Error",
                JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void printMessage(String message) {
        JOptionPane.showMessageDialog(null,
                message,"Information",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void printWinner(Player player) {
        JOptionPane.showMessageDialog(null,
                "Felicidades, la faccion: " + player.getFaction()+" ha Ganado!!","Information",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public class DepartmentButton extends JButton{
    
        private String departmentName;

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }
        
        
        
    }
    
    public class MapPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            try {
                Image colombiaMap =  ImageIO.read(new File("src/resources/country/Colombia2.png"));
                g.drawImage(colombiaMap, 0, 0, null);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
