// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:09
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   PassageTable.java

package desktopapplication1;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import org.jdesktop.application.Application;
import org.jdesktop.application.ApplicationContext;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

// Referenced classes of package desktopapplication1:
//            DesktopApplication1, Passage

public class PassageTable extends JPanel
{
    private class FormListener
        implements ActionListener
    {

        public void actionPerformed(ActionEvent evt)
        {
            if(evt.getSource() == saveButton)
                saveButtonActionPerformed(evt);
            else
            if(evt.getSource() == refreshButton)
                refreshButtonActionPerformed(evt);
            else
            if(evt.getSource() == newButton)
                newButtonActionPerformed(evt);
            else
            if(evt.getSource() == deleteButton)
                deleteButtonActionPerformed(evt);
        }

//        final PassageTable this$0;
//
//        FormListener()
//        {
//            this$0 = PassageTable.this;
//            super();
//        }
    }


    public PassageTable()
    {
        initComponents();
        if(!Beans.isDesignTime())
            entityManager.getTransaction().begin();
    }

    private void initComponents()
    {
        bindingGroup = new BindingGroup();
        ResourceMap resourceMap = ((DesktopApplication1)Application.getInstance(desktopapplication1.DesktopApplication1.class)).getContext().getResourceMap(desktopapplication1.PassageTable.class);
        entityManager = Beans.isDesignTime() ? null : Persistence.createEntityManagerFactory(resourceMap.getString("entityManager.persistenceUnit", new Object[0])).createEntityManager();
        query = Beans.isDesignTime() ? null : entityManager.createQuery(resourceMap.getString("query.query", new Object[0]));
        list = ((java.util.List) (Beans.isDesignTime() ? Collections.emptyList() : ((java.util.List) (ObservableCollections.observableList(query.getResultList())))));
        masterScrollPane = new JScrollPane();
        masterTable = new JTable();
        shortPassageLabel = new JLabel();
        longPassageLabel = new JLabel();
        shortAnswerLabel = new JLabel();
        longAnswerLabel = new JLabel();
        yearMonthLabel = new JLabel();
        longQuestionsLabel = new JLabel();
        shortQuestionsLabel = new JLabel();
        longOptionsLabel = new JLabel();
        shortOptionsLabel = new JLabel();
        shortPassageField = new JTextField();
        longPassageField = new JTextField();
        shortAnswerField = new JTextField();
        longAnswerField = new JTextField();
        yearMonthField = new JTextField();
        longQuestionsField = new JTextField();
        shortQuestionsField = new JTextField();
        longOptionsField = new JTextField();
        shortOptionsField = new JTextField();
        saveButton = new JButton();
        refreshButton = new JButton();
        newButton = new JButton();
        deleteButton = new JButton();
        FormListener formListener = new FormListener();
        setName("Form");
        masterScrollPane.setName("masterScrollPane");
        masterTable.setName("masterTable");
        JTableBinding jTableBinding = SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${shortPassage}"));
        columnBinding.setColumnName("Short Passage");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${longPassage}"));
        columnBinding.setColumnName("Long Passage");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${shortAnswer}"));
        columnBinding.setColumnName("Short Answer");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${longAnswer}"));
        columnBinding.setColumnName("Long Answer");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${yearMonth}"));
        columnBinding.setColumnName("Year Month");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${longQuestions}"));
        columnBinding.setColumnName("Long Questions");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${shortQuestions}"));
        columnBinding.setColumnName("Short Questions");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${longOptions}"));
        columnBinding.setColumnName("Long Options");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${shortOptions}"));
        columnBinding.setColumnName("Short Options");
        columnBinding.setColumnClass(java.lang.String.class);
        bindingGroup.addBinding(jTableBinding);
        masterScrollPane.setViewportView(masterTable);
        shortPassageLabel.setText(resourceMap.getString("shortPassageLabel.text", new Object[0]));
        shortPassageLabel.setName("shortPassageLabel");
        longPassageLabel.setText(resourceMap.getString("longPassageLabel.text", new Object[0]));
        longPassageLabel.setName("longPassageLabel");
        shortAnswerLabel.setText(resourceMap.getString("shortAnswerLabel.text", new Object[0]));
        shortAnswerLabel.setName("shortAnswerLabel");
        longAnswerLabel.setText(resourceMap.getString("longAnswerLabel.text", new Object[0]));
        longAnswerLabel.setName("longAnswerLabel");
        yearMonthLabel.setText(resourceMap.getString("yearMonthLabel.text", new Object[0]));
        yearMonthLabel.setName("yearMonthLabel");
        longQuestionsLabel.setText(resourceMap.getString("longQuestionsLabel.text", new Object[0]));
        longQuestionsLabel.setName("longQuestionsLabel");
        shortQuestionsLabel.setText(resourceMap.getString("shortQuestionsLabel.text", new Object[0]));
        shortQuestionsLabel.setName("shortQuestionsLabel");
        longOptionsLabel.setText(resourceMap.getString("longOptionsLabel.text", new Object[0]));
        longOptionsLabel.setName("longOptionsLabel");
        shortOptionsLabel.setText(resourceMap.getString("shortOptionsLabel.text", new Object[0]));
        shortOptionsLabel.setName("shortOptionsLabel");
        shortPassageField.setName("shortPassageField");
        Binding binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.shortPassage}"), shortPassageField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), shortPassageField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        longPassageField.setName("longPassageField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.longPassage}"), longPassageField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), longPassageField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        shortAnswerField.setName("shortAnswerField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.shortAnswer}"), shortAnswerField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), shortAnswerField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        longAnswerField.setName("longAnswerField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.longAnswer}"), longAnswerField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), longAnswerField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        yearMonthField.setName("yearMonthField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.yearMonth}"), yearMonthField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), yearMonthField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        longQuestionsField.setName("longQuestionsField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.longQuestions}"), longQuestionsField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), longQuestionsField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        shortQuestionsField.setName("shortQuestionsField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.shortQuestions}"), shortQuestionsField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), shortQuestionsField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        longOptionsField.setName("longOptionsField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.longOptions}"), longOptionsField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), longOptionsField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        shortOptionsField.setName("shortOptionsField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.shortOptions}"), shortOptionsField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), shortOptionsField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        saveButton.setText(resourceMap.getString("saveButton.text", new Object[0]));
        saveButton.setName("saveButton");
        saveButton.addActionListener(formListener);
        refreshButton.setText(resourceMap.getString("refreshButton.text", new Object[0]));
        refreshButton.setName("refreshButton");
        refreshButton.addActionListener(formListener);
        newButton.setText(resourceMap.getString("newButton.text", new Object[0]));
        newButton.setName("newButton");
        newButton.addActionListener(formListener);
        deleteButton.setText(resourceMap.getString("deleteButton.text", new Object[0]));
        deleteButton.setName("deleteButton");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), deleteButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        deleteButton.addActionListener(formListener);
        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(newButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(deleteButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(refreshButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(saveButton).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(shortPassageLabel).addComponent(longPassageLabel).addComponent(shortAnswerLabel).addComponent(longAnswerLabel).addComponent(yearMonthLabel).addComponent(longQuestionsLabel).addComponent(shortQuestionsLabel).addComponent(longOptionsLabel).addComponent(shortOptionsLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(shortPassageField, -1, 315, 32767).addComponent(longPassageField, -1, 315, 32767).addComponent(shortAnswerField, -1, 315, 32767).addComponent(longAnswerField, -1, 315, 32767).addComponent(yearMonthField, -1, 315, 32767).addComponent(longQuestionsField, -1, 315, 32767).addComponent(shortQuestionsField, -1, 315, 32767).addComponent(longOptionsField, -1, 315, 32767).addComponent(shortOptionsField, -1, 315, 32767)).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 380, 32767).addContainerGap()));
        layout.linkSize(0, new Component[] {
            deleteButton, newButton, refreshButton, saveButton
        });
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 130, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(shortPassageLabel).addComponent(shortPassageField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(longPassageLabel).addComponent(longPassageField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(shortAnswerLabel).addComponent(shortAnswerField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(longAnswerLabel).addComponent(longAnswerField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(yearMonthLabel).addComponent(yearMonthField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(longQuestionsLabel).addComponent(longQuestionsField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(shortQuestionsLabel).addComponent(shortQuestionsField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(longOptionsLabel).addComponent(longOptionsField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(shortOptionsLabel).addComponent(shortOptionsField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(saveButton).addComponent(refreshButton).addComponent(deleteButton).addComponent(newButton)).addContainerGap()));
        bindingGroup.bind();
    }

    private void refreshButtonActionPerformed(ActionEvent evt)
    {
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        Collection data = query.getResultList();
        Object entity;
        for(Iterator i$ = data.iterator(); i$.hasNext(); entityManager.refresh(entity))
            entity = i$.next();

        list.clear();
        list.addAll(data);
    }

    private void deleteButtonActionPerformed(ActionEvent evt)
    {
        int selected[] = masterTable.getSelectedRows();
        java.util.List toRemove = new ArrayList(selected.length);
        for(int idx = 0; idx < selected.length; idx++)
        {
            Passage p = (Passage)list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(p);
            entityManager.remove(p);
        }

        list.removeAll(toRemove);
    }

    private void newButtonActionPerformed(ActionEvent evt)
    {
        Passage p = new Passage();
        entityManager.persist(p);
        list.add(p);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }

    private void saveButtonActionPerformed(ActionEvent evt)
    {
        try
        {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        }
        catch(RollbackException rex)
        {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            java.util.List merged = new ArrayList(list.size());
            Passage p;
            for(Iterator i$ = list.iterator(); i$.hasNext(); merged.add(entityManager.merge(p)))
                p = (Passage)i$.next();

            list.clear();
            list.addAll(merged);
        }
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                JFrame frame = new JFrame();
                frame.setContentPane(new PassageTable());
                frame.setDefaultCloseOperation(3);
                frame.pack();
                frame.setVisible(true);
            }

        }
);
    }

    private JButton deleteButton;
    private EntityManager entityManager;
    private java.util.List list;
    private JTextField longAnswerField;
    private JLabel longAnswerLabel;
    private JTextField longOptionsField;
    private JLabel longOptionsLabel;
    private JTextField longPassageField;
    private JLabel longPassageLabel;
    private JTextField longQuestionsField;
    private JLabel longQuestionsLabel;
    private JScrollPane masterScrollPane;
    private JTable masterTable;
    private JButton newButton;
    private Query query;
    private JButton refreshButton;
    private JButton saveButton;
    private JTextField shortAnswerField;
    private JLabel shortAnswerLabel;
    private JTextField shortOptionsField;
    private JLabel shortOptionsLabel;
    private JTextField shortPassageField;
    private JLabel shortPassageLabel;
    private JTextField shortQuestionsField;
    private JLabel shortQuestionsLabel;
    private JTextField yearMonthField;
    private JLabel yearMonthLabel;
    private BindingGroup bindingGroup;

}