// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:40:58
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   AnalyticalWriting.java

package desktopapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class AnalyticalWriting
    implements Serializable
{

    public AnalyticalWriting()
    {
        changeSupport = new PropertyChangeSupport(this);
    }

    public AnalyticalWriting(String id)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
    }

    public AnalyticalWriting(String id, String issues, String arguments, String issuesExample, String argumentsExample)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
        this.issues = issues;
        this.arguments = arguments;
        this.issuesExample = issuesExample;
        this.argumentsExample = argumentsExample;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getIssues()
    {
        return issues;
    }

    public void setIssues(String issues)
    {
        String oldIssues = this.issues;
        this.issues = issues;
        changeSupport.firePropertyChange("issues", oldIssues, issues);
    }

    public String getArguments()
    {
        return arguments;
    }

    public void setArguments(String arguments)
    {
        String oldArguments = this.arguments;
        this.arguments = arguments;
        changeSupport.firePropertyChange("arguments", oldArguments, arguments);
    }

    public String getIssuesExample()
    {
        return issuesExample;
    }

    public void setIssuesExample(String issuesExample)
    {
        String oldIssuesExample = this.issuesExample;
        this.issuesExample = issuesExample;
        changeSupport.firePropertyChange("issuesExample", oldIssuesExample, issuesExample);
    }

    public String getArgumentsExample()
    {
        return argumentsExample;
    }

    public void setArgumentsExample(String argumentsExample)
    {
        String oldArgumentsExample = this.argumentsExample;
        this.argumentsExample = argumentsExample;
        changeSupport.firePropertyChange("argumentsExample", oldArgumentsExample, argumentsExample);
    }

    public int hashCode()
    {
        int hash = 0;
        hash += id == null ? 0 : id.hashCode();
        return hash;
    }

    public boolean equals(Object object)
    {
        if(!(object instanceof AnalyticalWriting))
            return false;
        AnalyticalWriting other = (AnalyticalWriting)object;
        return (id != null || other.id == null) && (id == null || id.equals(other.id));
    }

    public String toString()
    {
        return (new StringBuilder()).append("desktopapplication1.AnalyticalWriting[ id=").append(id).append(" ]").toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.removePropertyChangeListener(listener);
    }

    private PropertyChangeSupport changeSupport;
    private static final long serialVersionUID = 1L;
    private String id;
    private String issues;
    private String arguments;
    private String issuesExample;
    private String argumentsExample;
}