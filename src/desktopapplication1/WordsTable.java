// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:18
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   WordsTable.java

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
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

// Referenced classes of package desktopapplication1:
//            Words

public class WordsTable extends JPanel
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

//        final WordsTable this$0;
//
//        FormListener()
//        {
//            this$0 = WordsTable.this;
//            super();
//        }
    }


    public WordsTable()
    {
        initComponents();
        if(!Beans.isDesignTime())
            entityManager.getTransaction().begin();
    }

    private void initComponents()
    {
        bindingGroup = new BindingGroup();
        entityManager = Beans.isDesignTime() ? null : Persistence.createEntityManagerFactory("grePU").createEntityManager();
        query = Beans.isDesignTime() ? null : entityManager.createQuery("SELECT w FROM Words w");
        list = ((java.util.List) (Beans.isDesignTime() ? Collections.emptyList() : ((java.util.List) (ObservableCollections.observableList(query.getResultList())))));
        masterScrollPane = new JScrollPane();
        masterTable = new JTable();
        wordLabel = new JLabel();
        meaningLabel = new JLabel();
        antonymyLabel = new JLabel();
        analogyLabel = new JLabel();
        wordField = new JTextField();
        meaningField = new JTextField();
        antonymyField = new JTextField();
        analogyField = new JTextField();
        saveButton = new JButton();
        refreshButton = new JButton();
        newButton = new JButton();
        deleteButton = new JButton();
        FormListener formListener = new FormListener();
        setName("Form");
        masterScrollPane.setName("masterScrollPane");
        masterTable.setName("masterTable");
        JTableBinding jTableBinding = SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${word}"));
        columnBinding.setColumnName("Word");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${meaning}"));
        columnBinding.setColumnName("Meaning");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${antonymy}"));
        columnBinding.setColumnName("Antonymy");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${analogy}"));
        columnBinding.setColumnName("Analogy");
        columnBinding.setColumnClass(java.lang.String.class);
        bindingGroup.addBinding(jTableBinding);
        masterScrollPane.setViewportView(masterTable);
        wordLabel.setText("Word:");
        wordLabel.setName("wordLabel");
        meaningLabel.setText("Meaning");
        meaningLabel.setName("meaningLabel");
        antonymyLabel.setText("Antonymy");
        antonymyLabel.setName("antonymyLabel");
        analogyLabel.setText("Analogy:");
        analogyLabel.setName("analogyLabel");
        wordField.setName("wordField");
        Binding binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.word}"), wordField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), wordField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        meaningField.setName("meaningField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.meaning}"), meaningField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), meaningField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        antonymyField.setName("antonymyField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.antonymy}"), antonymyField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), antonymyField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        analogyField.setName("analogyField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.analogy}"), analogyField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), analogyField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        saveButton.setText("Save");
        saveButton.setName("saveButton");
        saveButton.addActionListener(formListener);
        refreshButton.setText("Refresh");
        refreshButton.setName("refreshButton");
        refreshButton.addActionListener(formListener);
        newButton.setText("New");
        newButton.setName("newButton");
        newButton.addActionListener(formListener);
        deleteButton.setText("Delete");
        deleteButton.setName("deleteButton");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), deleteButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        deleteButton.addActionListener(formListener);
        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(newButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(deleteButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(refreshButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(saveButton).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(wordLabel).addComponent(meaningLabel).addComponent(antonymyLabel).addComponent(analogyLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(wordField, -1, 315, 32767).addComponent(meaningField, -1, 315, 32767).addComponent(antonymyField, -1, 315, 32767).addComponent(analogyField, -1, 315, 32767)).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 380, 32767).addContainerGap()));
        layout.linkSize(0, new Component[] {
            deleteButton, newButton, refreshButton, saveButton
        });
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 130, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(wordLabel).addComponent(wordField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(meaningLabel).addComponent(meaningField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(antonymyLabel).addComponent(antonymyField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(analogyLabel).addComponent(analogyField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(saveButton).addComponent(refreshButton).addComponent(deleteButton).addComponent(newButton)).addContainerGap()));
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
            Words w = (Words)list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(w);
            entityManager.remove(w);
        }

        list.removeAll(toRemove);
    }

    private void newButtonActionPerformed(ActionEvent evt)
    {
        Words w = new Words();
        entityManager.persist(w);
        list.add(w);
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
            Words w;
            for(Iterator i$ = list.iterator(); i$.hasNext(); merged.add(entityManager.merge(w)))
                w = (Words)i$.next();

            list.clear();
            list.addAll(merged);
        }
    }

    public static void main(java.lang.String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                JFrame frame = new JFrame();
                frame.setContentPane(new WordsTable());
                frame.setDefaultCloseOperation(3);
                frame.pack();
                frame.setVisible(true);
            }

        }
);
    }

    private JTextField analogyField;
    private JLabel analogyLabel;
    private JTextField antonymyField;
    private JLabel antonymyLabel;
    private JButton deleteButton;
    private EntityManager entityManager;
    private java.util.List list;
    private JScrollPane masterScrollPane;
    private JTable masterTable;
    private JTextField meaningField;
    private JLabel meaningLabel;
    private JButton newButton;
    private Query query;
    private JButton refreshButton;
    private JButton saveButton;
    private JTextField wordField;
    private JLabel wordLabel;
    private BindingGroup bindingGroup;

}