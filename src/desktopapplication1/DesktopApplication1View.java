// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:03
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DesktopApplication1View.java

package desktopapplication1;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Beans;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ActionMap;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.jdesktop.application.Application;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.TaskMonitor;
import org.jdesktop.beansbinding.AbstractBindingListener;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

// Referenced classes of package desktopapplication1:
//            Words, DesktopApplication1AboutBox, DesktopApplication1

public class DesktopApplication1View extends FrameView
{
//    private class RefreshTask extends Task
//    {
//
//        protected Void doInBackground()
//        {
//            try
//            {
//                setProgress(0, 0, 4);
//                setMessage("Rolling back the current changes...");
//                setProgress(1, 0, 4);
//                entityManager.getTransaction().rollback();
//                Thread.sleep(1000L);
//                setProgress(2, 0, 4);
//                setMessage("Starting a new transaction...");
//                entityManager.getTransaction().begin();
//                Thread.sleep(500L);
//                setProgress(3, 0, 4);
//                setMessage("Fetching new data...");
//                Collection data = query.getResultList();
//                Object entity;
//                for(Iterator i$ = data.iterator(); i$.hasNext(); entityManager.refresh(entity))
//                    entity = i$.next();
//
//                Thread.sleep(1300L);
//                setProgress(4, 0, 4);
//                Thread.sleep(150L);
//                list.clear();
//                list.addAll(data);
//            }
//            catch(InterruptedException ignore) { }
//            return null;
//        }
//
//        protected void finished()
//        {
//            setMessage("Done.");
//            setSaveNeeded(false);
//        }
//
//        protected Object doInBackground()
//            throws Exception
//        {
//            return doInBackground();
//        }
//
////        final DesktopApplication1View this$0;
////
////        RefreshTask(Application app)
////        {
////            this$0 = DesktopApplication1View.this;
////            super(app);
////        }
//    }

//    private class SaveTask extends Task
//    {
//
//        protected Void doInBackground()
//        {
//            try
//            {
//                entityManager.getTransaction().commit();
//                entityManager.getTransaction().begin();
//            }
//            catch(RollbackException rex)
//            {
//                rex.printStackTrace();
//                entityManager.getTransaction().begin();
//                java.util.List merged = new ArrayList(list.size());
//                Words w;
//                for(Iterator i$ = list.iterator(); i$.hasNext(); merged.add(entityManager.merge(w)))
//                    w = (Words)i$.next();
//
//                list.clear();
//                list.addAll(merged);
//            }
//            return null;
//        }
//
//        protected void finished()
//        {
//            setSaveNeeded(false);
//        }
//
//        protected volatile Object doInBackground()
//            throws Exception
//        {
//            return doInBackground();
//        }
//
//        final DesktopApplication1View this$0;
//
//        SaveTask(Application app)
//        {
//            this$0 = DesktopApplication1View.this;
//            super(app);
//        }
//    }


    public DesktopApplication1View(SingleFrameApplication app)
    {
        super(app);
        busyIconIndex = 0;
        initComponents();
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout").intValue();
        messageTimer = new Timer(messageTimeout, new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                statusMessageLabel.setText("");
            }

//            final DesktopApplication1View this$0;
//
//            
//            {
//                this$0 = DesktopApplication1View.this;
//                super();
//            }
        }
        );
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate").intValue();
        for(int i = 0; i < busyIcons.length; i++)
            busyIcons[i] = resourceMap.getIcon((new StringBuilder()).append("StatusBar.busyIcons[").append(i).append("]").toString());

        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }

//            final DesktopApplication1View this$0;
//
//            
//            {
//                this$0 = DesktopApplication1View.this;
//                super();
//            }
        }
);
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);
        progressBar.setVisible(false);
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new PropertyChangeListener() {

            public void propertyChange(PropertyChangeEvent evt)
            {
                String propertyName = evt.getPropertyName();
                if("started".equals(propertyName))
                {
                    if(!busyIconTimer.isRunning())
                    {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else
                if("done".equals(propertyName))
                {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else
                if("message".equals(propertyName))
                {
                    String text = (String)(String)evt.getNewValue();
                    statusMessageLabel.setText(text != null ? text : "");
                    messageTimer.restart();
                } else
                if("progress".equals(propertyName))
                {
                    int value = ((Integer)(Integer)evt.getNewValue()).intValue();
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }

//            final DesktopApplication1View this$0;
//
//            
//            {
//                this$0 = DesktopApplication1View.this;
//                super();
//            }
        }
);
        masterTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e)
            {
                firePropertyChange("recordSelected", Boolean.valueOf(!isRecordSelected()), Boolean.valueOf(isRecordSelected()));
            }

//            final DesktopApplication1View this$0;
//
//            
//            {
//                this$0 = DesktopApplication1View.this;
//                super();
//            }
        }
);
        bindingGroup.addBindingListener(new AbstractBindingListener() {

            public void targetChanged(Binding binding, PropertyStateEvent event)
            {
                setSaveNeeded(true);
            }

//            final DesktopApplication1View this$0;
//
//            
//            {
//                this$0 = DesktopApplication1View.this;
//                super();
//            }
        }
);
        entityManager.getTransaction().begin();
    }

    public boolean isSaveNeeded()
    {
        return saveNeeded;
    }

    private void setSaveNeeded(boolean saveNeeded)
    {
        if(saveNeeded != this.saveNeeded)
        {
            this.saveNeeded = saveNeeded;
            firePropertyChange("saveNeeded", Boolean.valueOf(!saveNeeded), Boolean.valueOf(saveNeeded));
        }
    }

    public boolean isRecordSelected()
    {
        return masterTable.getSelectedRow() != -1;
    }

    public void newRecord()
    {
        Words w = new Words();
        entityManager.persist(w);
        list.add(w);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        setSaveNeeded(true);
    }

    public void deleteRecord()
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
        setSaveNeeded(true);
    }

//    public Task save()
//    {
//        return new SaveTask(getApplication());
//    }
//
//    public Task refresh()
//    {
//        return new RefreshTask(getApplication());
//    }

    public void showAboutBox()
    {
        if(aboutBox == null)
        {
            javax.swing.JFrame mainFrame = DesktopApplication1.getApplication().getMainFrame();
            aboutBox = new DesktopApplication1AboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        DesktopApplication1.getApplication().show(aboutBox);
    }

    private void initComponents()
    {
        bindingGroup = new BindingGroup();
        mainPanel = new JPanel();
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
        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu();
        JMenuItem newRecordMenuItem = new JMenuItem();
        JMenuItem deleteRecordMenuItem = new JMenuItem();
        jSeparator1 = new JSeparator();
        JMenuItem saveMenuItem = new JMenuItem();
        JMenuItem refreshMenuItem = new JMenuItem();
        jSeparator2 = new JSeparator();
        JMenuItem exitMenuItem = new JMenuItem();
        JMenu helpMenu = new JMenu();
        JMenuItem aboutMenuItem = new JMenuItem();
        statusPanel = new JPanel();
        JSeparator statusPanelSeparator = new JSeparator();
        statusMessageLabel = new JLabel();
        statusAnimationLabel = new JLabel();
        progressBar = new JProgressBar();
        ResourceMap resourceMap = ((DesktopApplication1)Application.getInstance(desktopapplication1.DesktopApplication1.class)).getContext().getResourceMap(desktopapplication1.DesktopApplication1View.class);
        entityManager = Beans.isDesignTime() ? null : Persistence.createEntityManagerFactory(resourceMap.getString("entityManager.persistenceUnit", new Object[0])).createEntityManager();
        query = Beans.isDesignTime() ? null : entityManager.createQuery(resourceMap.getString("query.query", new Object[0]));
        list = ((java.util.List) (Beans.isDesignTime() ? Collections.emptyList() : ((java.util.List) (ObservableCollections.observableList(query.getResultList())))));
        mainPanel.setName("mainPanel");
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
        wordLabel.setText(resourceMap.getString("wordLabel.text", new Object[0]));
        wordLabel.setName("wordLabel");
        meaningLabel.setText(resourceMap.getString("meaningLabel.text", new Object[0]));
        meaningLabel.setName("meaningLabel");
        antonymyLabel.setText(resourceMap.getString("antonymyLabel.text", new Object[0]));
        antonymyLabel.setName("antonymyLabel");
        analogyLabel.setText(resourceMap.getString("analogyLabel.text", new Object[0]));
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
        ActionMap actionMap = ((DesktopApplication1)Application.getInstance(desktopapplication1.DesktopApplication1.class)).getContext().getActionMap(desktopapplication1.DesktopApplication1View.class, this);
        saveButton.setAction(actionMap.get("save"));
        saveButton.setName("saveButton");
        refreshButton.setAction(actionMap.get("refresh"));
        refreshButton.setName("refreshButton");
        newButton.setAction(actionMap.get("newRecord"));
        newButton.setName("newButton");
        deleteButton.setAction(actionMap.get("deleteRecord"));
        deleteButton.setName("deleteButton");
        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup().addComponent(newButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(deleteButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(refreshButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(saveButton).addContainerGap()).addGroup(mainPanelLayout.createSequentialGroup().addContainerGap().addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(wordLabel).addComponent(meaningLabel).addComponent(antonymyLabel).addComponent(analogyLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(wordField, -1, 315, 32767).addComponent(meaningField, -1, 315, 32767).addComponent(antonymyField, -1, 315, 32767).addComponent(analogyField, -1, 315, 32767)).addContainerGap()).addGroup(mainPanelLayout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 380, 32767).addContainerGap()));
        mainPanelLayout.linkSize(0, new Component[] {
            deleteButton, newButton, refreshButton, saveButton
        });
        mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(mainPanelLayout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 130, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(wordLabel).addComponent(wordField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(meaningLabel).addComponent(meaningField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(antonymyLabel).addComponent(antonymyField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(analogyLabel).addComponent(analogyField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(saveButton).addComponent(refreshButton).addComponent(deleteButton).addComponent(newButton)).addContainerGap()));
        menuBar.setName("menuBar");
        fileMenu.setText(resourceMap.getString("fileMenu.text", new Object[0]));
        fileMenu.setName("fileMenu");
        newRecordMenuItem.setAction(actionMap.get("newRecord"));
        newRecordMenuItem.setName("newRecordMenuItem");
        fileMenu.add(newRecordMenuItem);
        deleteRecordMenuItem.setAction(actionMap.get("deleteRecord"));
        deleteRecordMenuItem.setName("deleteRecordMenuItem");
        fileMenu.add(deleteRecordMenuItem);
        jSeparator1.setName("jSeparator1");
        fileMenu.add(jSeparator1);
        saveMenuItem.setAction(actionMap.get("save"));
        saveMenuItem.setName("saveMenuItem");
        fileMenu.add(saveMenuItem);
        refreshMenuItem.setAction(actionMap.get("refresh"));
        refreshMenuItem.setName("refreshMenuItem");
        fileMenu.add(refreshMenuItem);
        jSeparator2.setName("jSeparator2");
        fileMenu.add(jSeparator2);
        exitMenuItem.setAction(actionMap.get("quit"));
        exitMenuItem.setName("exitMenuItem");
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        helpMenu.setText(resourceMap.getString("helpMenu.text", new Object[0]));
        helpMenu.setName("helpMenu");
        aboutMenuItem.setAction(actionMap.get("showAboutBox"));
        aboutMenuItem.setName("aboutMenuItem");
        helpMenu.add(aboutMenuItem);
        menuBar.add(helpMenu);
        statusPanel.setName("statusPanel");
        statusPanelSeparator.setName("statusPanelSeparator");
        statusMessageLabel.setName("statusMessageLabel");
        statusAnimationLabel.setHorizontalAlignment(2);
        statusAnimationLabel.setName("statusAnimationLabel");
        progressBar.setName("progressBar");
        GroupLayout statusPanelLayout = new GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(statusPanelSeparator, -1, 400, 32767).addGroup(statusPanelLayout.createSequentialGroup().addContainerGap().addComponent(statusMessageLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, 32767).addComponent(progressBar, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(statusAnimationLabel).addContainerGap()));
        statusPanelLayout.setVerticalGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(statusPanelLayout.createSequentialGroup().addComponent(statusPanelSeparator, -2, 2, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(statusMessageLabel).addComponent(statusAnimationLabel).addComponent(progressBar, -2, -1, -2)).addGap(3, 3, 3)));
        setComponent(mainPanel);
        setMenuBar(menuBar);
        setStatusBar(statusPanel);
        bindingGroup.bind();
    }

    private JTextField analogyField;
    private JLabel analogyLabel;
    private JTextField antonymyField;
    private JLabel antonymyLabel;
    private JButton deleteButton;
    private EntityManager entityManager;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private java.util.List list;
    private JPanel mainPanel;
    private JScrollPane masterScrollPane;
    private JTable masterTable;
    private JTextField meaningField;
    private JLabel meaningLabel;
    private JMenuBar menuBar;
    private JButton newButton;
    private JProgressBar progressBar;
    private Query query;
    private JButton refreshButton;
    private JButton saveButton;
    private JLabel statusAnimationLabel;
    private JLabel statusMessageLabel;
    private JPanel statusPanel;
    private JTextField wordField;
    private JLabel wordLabel;
    private BindingGroup bindingGroup;
    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon busyIcons[] = new Icon[15];
    private int busyIconIndex;
    private JDialog aboutBox;
    private boolean saveNeeded;

}