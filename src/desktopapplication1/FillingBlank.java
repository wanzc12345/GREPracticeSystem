// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:05
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   FillingBlank.java

package desktopapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class FillingBlank
    implements Serializable
{

    public FillingBlank()
    {
        changeSupport = new PropertyChangeSupport(this);
    }

    public FillingBlank(Integer id)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
    }

    public FillingBlank(Integer id, String question, String options, String answer, String yearMonth)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
        this.yearMonth = yearMonth;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        String oldQuestion = this.question;
        this.question = question;
        changeSupport.firePropertyChange("question", oldQuestion, question);
    }

    public String getOptions()
    {
        return options;
    }

    public void setOptions(String options)
    {
        String oldOptions = this.options;
        this.options = options;
        changeSupport.firePropertyChange("options", oldOptions, options);
    }

    public String getAnswer()
    {
        return answer;
    }

    public void setAnswer(String answer)
    {
        String oldAnswer = this.answer;
        this.answer = answer;
        changeSupport.firePropertyChange("answer", oldAnswer, answer);
    }

    public String getYearMonth()
    {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth)
    {
        String oldYearMonth = this.yearMonth;
        this.yearMonth = yearMonth;
        changeSupport.firePropertyChange("yearMonth", oldYearMonth, yearMonth);
    }

    public int hashCode()
    {
        int hash = 0;
        hash += id == null ? 0 : id.hashCode();
        return hash;
    }

    public boolean equals(Object object)
    {
        if(!(object instanceof FillingBlank))
            return false;
        FillingBlank other = (FillingBlank)object;
        return (id != null || other.id == null) && (id == null || id.equals(other.id));
    }

    public String toString()
    {
        return (new StringBuilder()).append("desktopapplication1.FillingBlank[ id=").append(id).append(" ]").toString();
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
    private Integer id;
    private String question;
    private String options;
    private String answer;
    private String yearMonth;
}