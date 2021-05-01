// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:06
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   FillingBlankTable.java

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
//            DesktopApplication1, FillingBlank

public class FillingBlankTable extends JPanel
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

//        final FillingBlankTable this$0;
//
//        FormListener()
//        {
//            this$0 = FillingBlankTable.this;
//            super();
//        }
    }


    public FillingBlankTable()
    {
        initComponents();
        if(!Beans.isDesignTime())
            entityManager.getTransaction().begin();
    }

    private void initComponents()
    {
        bindingGroup = new BindingGroup();
        ResourceMap resourceMap = ((DesktopApplication1)Application.getInstance(desktopapplication1.DesktopApplication1.class)).getContext().getResourceMap(desktopapplication1.FillingBlankTable.class);
        entityManager = Beans.isDesignTime() ? null : Persistence.createEntityManagerFactory(resourceMap.getString("entityManager.persistenceUnit", new Object[0])).createEntityManager();
        query = Beans.isDesignTime() ? null : entityManager.createQuery(resourceMap.getString("query.query", new Object[0]));
        list = ((java.util.List) (Beans.isDesignTime() ? Collections.emptyList() : ((java.util.List) (ObservableCollections.observableList(query.getResultList())))));
        masterScrollPane = new JScrollPane();
        masterTable = new JTable();
        idLabel = new JLabel();
        questionLabel = new JLabel();
        optionsLabel = new JLabel();
        answerLabel = new JLabel();
        yearMonthLabel = new JLabel();
        idField = new JTextField();
        questionField = new JTextField();
        optionsField = new JTextField();
        answerField = new JTextField();
        yearMonthField = new JTextField();
        saveButton = new JButton();
        refreshButton = new JButton();
        newButton = new JButton();
        deleteButton = new JButton();
        FormListener formListener = new FormListener();
        setName("Form");
        masterScrollPane.setName("masterScrollPane");
        masterTable.setName("masterTable");
        JTableBinding jTableBinding = SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(java.lang.Integer.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${question}"));
        columnBinding.setColumnName("Question");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${options}"));
        columnBinding.setColumnName("Options");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${answer}"));
        columnBinding.setColumnName("Answer");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${yearMonth}"));
        columnBinding.setColumnName("Year Month");
        columnBinding.setColumnClass(java.lang.String.class);
        bindingGroup.addBinding(jTableBinding);
        masterScrollPane.setViewportView(masterTable);
        idLabel.setText(resourceMap.getString("idLabel.text", new Object[0]));
        idLabel.setName("idLabel");
        questionLabel.setText(resourceMap.getString("questionLabel.text", new Object[0]));
        questionLabel.setName("questionLabel");
        optionsLabel.setText(resourceMap.getString("optionsLabel.text", new Object[0]));
        optionsLabel.setName("optionsLabel");
        answerLabel.setText(resourceMap.getString("answerLabel.text", new Object[0]));
        answerLabel.setName("answerLabel");
        yearMonthLabel.setText(resourceMap.getString("yearMonthLabel.text", new Object[0]));
        yearMonthLabel.setName("yearMonthLabel");
        idField.setName("idField");
        Binding binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.id}"), idField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), idField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        questionField.setName("questionField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.question}"), questionField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), questionField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        optionsField.setName("optionsField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.options}"), optionsField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), optionsField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        answerField.setName("answerField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.answer}"), answerField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), answerField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        yearMonthField.setName("yearMonthField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.yearMonth}"), yearMonthField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), yearMonthField, BeanProperty.create("enabled"));
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
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(newButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(deleteButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(refreshButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(saveButton).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(idLabel).addComponent(questionLabel).addComponent(optionsLabel).addComponent(answerLabel).addComponent(yearMonthLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(idField, -1, 315, 32767).addComponent(questionField, -1, 315, 32767).addComponent(optionsField, -1, 315, 32767).addComponent(answerField, -1, 315, 32767).addComponent(yearMonthField, -1, 315, 32767)).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 380, 32767).addContainerGap()));
        layout.linkSize(0, new Component[] {
            deleteButton, newButton, refreshButton, saveButton
        });
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 130, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(idLabel).addComponent(idField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(questionLabel).addComponent(questionField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(optionsLabel).addComponent(optionsField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(answerLabel).addComponent(answerField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(yearMonthLabel).addComponent(yearMonthField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(saveButton).addComponent(refreshButton).addComponent(deleteButton).addComponent(newButton)).addContainerGap()));
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
            FillingBlank f = (FillingBlank)list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(f);
            entityManager.remove(f);
        }

        list.removeAll(toRemove);
    }

    private void newButtonActionPerformed(ActionEvent evt)
    {
        FillingBlank f = new FillingBlank();
        entityManager.persist(f);
        list.add(f);
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
            FillingBlank f;
            for(Iterator i$ = list.iterator(); i$.hasNext(); merged.add(entityManager.merge(f)))
                f = (FillingBlank)i$.next();

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
                frame.setContentPane(new FillingBlankTable());
                frame.setDefaultCloseOperation(3);
                frame.pack();
                frame.setVisible(true);
            }

        }
);
    }

    private JTextField answerField;
    private JLabel answerLabel;
    private JButton deleteButton;
    private EntityManager entityManager;
    private JTextField idField;
    private JLabel idLabel;
    private java.util.List list;
    private JScrollPane masterScrollPane;
    private JTable masterTable;
    private JButton newButton;
    private JTextField optionsField;
    private JLabel optionsLabel;
    private Query query;
    private JTextField questionField;
    private JLabel questionLabel;
    private JButton refreshButton;
    private JButton saveButton;
    private JTextField yearMonthField;
    private JLabel yearMonthLabel;
    private BindingGroup bindingGroup;

}