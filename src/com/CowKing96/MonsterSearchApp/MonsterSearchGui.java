/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CowKing96.MonsterSearchApp;

import com.codename1.ui.events.ActionEvent;

/**
 * GUI builder created Form
 *
 * @author Nate
 */
public class MonsterSearchGui extends com.codename1.ui.Form {

    public MonsterSearchGui() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public MonsterSearchGui(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_MonsterNameLabel = new com.codename1.ui.Label();
    private com.codename1.ui.ComboBox gui_MonsterNameComboBox = new com.codename1.ui.ComboBox();
    private com.codename1.ui.TextField gui_MonsterNameTextField = new com.codename1.ui.TextField();
    private com.codename1.ui.Label gui_MonsterNamePlaceholder = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_MinCrLabel = new com.codename1.ui.Label();
    private com.codename1.ui.ComboBox gui_Combo_Box = new com.codename1.ui.ComboBox();
    private com.codename1.ui.Label gui_MaxCrLabel = new com.codename1.ui.Label();
    private com.codename1.ui.ComboBox gui_Combo_Box_1 = new com.codename1.ui.ComboBox();
    private com.codename1.ui.Label gui_MonsterTypeLabel = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_Table_Layout = new com.codename1.ui.Container(new com.codename1.ui.table.TableLayout(3, 3));
    private com.codename1.ui.CheckBox gui_Check_Box_5 = new com.codename1.ui.CheckBox();
    private com.codename1.ui.CheckBox gui_Check_Box_4 = new com.codename1.ui.CheckBox();
    private com.codename1.ui.CheckBox gui_Check_Box_3 = new com.codename1.ui.CheckBox();
    private com.codename1.ui.CheckBox gui_Check_Box_2 = new com.codename1.ui.CheckBox();
    private com.codename1.ui.CheckBox gui_Check_Box_1 = new com.codename1.ui.CheckBox();
    private com.codename1.ui.CheckBox gui_Check_Box = new com.codename1.ui.CheckBox();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Check_Box_5.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_Check_Box_5) {
                onCheck_Box_5ActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.GridLayout(3, 4));
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(false);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("MonsterSearchGui");
        setName("MonsterSearchGui");
        addComponent(gui_MonsterNameLabel);
        addComponent(gui_MonsterNameComboBox);
        addComponent(gui_MonsterNameTextField);
        addComponent(gui_MonsterNamePlaceholder);
        addComponent(gui_MinCrLabel);
        addComponent(gui_Combo_Box);
        addComponent(gui_MaxCrLabel);
        addComponent(gui_Combo_Box_1);
        addComponent(gui_MonsterTypeLabel);
        addComponent(gui_Table_Layout);
        gui_Table_Layout.setScrollableX(false);
        gui_Table_Layout.setScrollableY(false);
                gui_Table_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Table_Layout.setName("Table_Layout");
((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).setGrowHorizontally(true);
        gui_Table_Layout.addComponent(gui_Check_Box_5);
        gui_Table_Layout.addComponent(gui_Check_Box_4);
        gui_Table_Layout.addComponent(gui_Check_Box_3);
        gui_Table_Layout.addComponent(gui_Check_Box_2);
        gui_Table_Layout.addComponent(gui_Check_Box_1);
        gui_Table_Layout.addComponent(gui_Check_Box);
        gui_Check_Box_5.setText("CheckBox");
                gui_Check_Box_5.setInlineStylesTheme(resourceObjectInstance);
        gui_Check_Box_5.setName("Check_Box_5");
        gui_Check_Box_4.setText("CheckBox");
                gui_Check_Box_4.setInlineStylesTheme(resourceObjectInstance);
        gui_Check_Box_4.setName("Check_Box_4");
        gui_Check_Box_3.setText("CheckBox");
                gui_Check_Box_3.setInlineStylesTheme(resourceObjectInstance);
        gui_Check_Box_3.setName("Check_Box_3");
        gui_Check_Box_2.setText("CheckBox");
                gui_Check_Box_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Check_Box_2.setName("Check_Box_2");
        gui_Check_Box_1.setText("CheckBox");
                gui_Check_Box_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Check_Box_1.setName("Check_Box_1");
        gui_Check_Box.setText("CheckBox");
                gui_Check_Box.setInlineStylesTheme(resourceObjectInstance);
        gui_Check_Box.setName("Check_Box");
        gui_MonsterNameLabel.setText("Monster Name:");
                gui_MonsterNameLabel.setInlineStylesTheme(resourceObjectInstance);
        gui_MonsterNameLabel.setName("MonsterNameLabel");
                gui_MonsterNameComboBox.setInlineStylesTheme(resourceObjectInstance);
        gui_MonsterNameComboBox.setName("MonsterNameComboBox");
        gui_MonsterNameTextField.setText("TextField");
                gui_MonsterNameTextField.setInlineStylesTheme(resourceObjectInstance);
        gui_MonsterNameTextField.setName("MonsterNameTextField");
        gui_MonsterNamePlaceholder.setText("placeholder");
                gui_MonsterNamePlaceholder.setInlineStylesTheme(resourceObjectInstance);
        gui_MonsterNamePlaceholder.setName("MonsterNamePlaceholder");
        gui_MinCrLabel.setText("Minimum Monster CR");
                gui_MinCrLabel.setInlineStylesTheme(resourceObjectInstance);
        gui_MinCrLabel.setName("MinCrLabel");
                gui_Combo_Box.setInlineStylesTheme(resourceObjectInstance);
        gui_Combo_Box.setName("Combo_Box");
        gui_MaxCrLabel.setText("Maximum Monster CR");
                gui_MaxCrLabel.setInlineStylesTheme(resourceObjectInstance);
        gui_MaxCrLabel.setName("MaxCrLabel");
                gui_Combo_Box_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Combo_Box_1.setName("Combo_Box_1");
        gui_MonsterTypeLabel.setText("Monster Type:");
                gui_MonsterTypeLabel.setInlineStylesTheme(resourceObjectInstance);
        gui_MonsterTypeLabel.setName("MonsterTypeLabel");
        gui_Table_Layout.setScrollableX(false);
        gui_Table_Layout.setScrollableY(false);
                gui_Table_Layout.setInlineStylesTheme(resourceObjectInstance);
        gui_Table_Layout.setName("Table_Layout");
((com.codename1.ui.table.TableLayout)gui_Table_Layout.getLayout()).setGrowHorizontally(true);
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!

}
