// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:09
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Passage.java

package desktopapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Passage
    implements Serializable
{

    public Passage()
    {
        changeSupport = new PropertyChangeSupport(this);
    }

    public Passage(Integer id)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
    }

    public Passage(Integer id, String shortPassage, String longPassage, String shortAnswer, String longAnswer, String yearMonth, String longQuestions, 
            String shortQuestions, String longOptions, String shortOptions)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
        this.shortPassage = shortPassage;
        this.longPassage = longPassage;
        this.shortAnswer = shortAnswer;
        this.longAnswer = longAnswer;
        this.yearMonth = yearMonth;
        this.longQuestions = longQuestions;
        this.shortQuestions = shortQuestions;
        this.longOptions = longOptions;
        this.shortOptions = shortOptions;
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

    public String getShortPassage()
    {
        return shortPassage;
    }

    public void setShortPassage(String shortPassage)
    {
        String oldShortPassage = this.shortPassage;
        this.shortPassage = shortPassage;
        changeSupport.firePropertyChange("shortPassage", oldShortPassage, shortPassage);
    }

    public String getLongPassage()
    {
        return longPassage;
    }

    public void setLongPassage(String longPassage)
    {
        String oldLongPassage = this.longPassage;
        this.longPassage = longPassage;
        changeSupport.firePropertyChange("longPassage", oldLongPassage, longPassage);
    }

    public String getShortAnswer()
    {
        return shortAnswer;
    }

    public void setShortAnswer(String shortAnswer)
    {
        String oldShortAnswer = this.shortAnswer;
        this.shortAnswer = shortAnswer;
        changeSupport.firePropertyChange("shortAnswer", oldShortAnswer, shortAnswer);
    }

    public String getLongAnswer()
    {
        return longAnswer;
    }

    public void setLongAnswer(String longAnswer)
    {
        String oldLongAnswer = this.longAnswer;
        this.longAnswer = longAnswer;
        changeSupport.firePropertyChange("longAnswer", oldLongAnswer, longAnswer);
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

    public String getLongQuestions()
    {
        return longQuestions;
    }

    public void setLongQuestions(String longQuestions)
    {
        String oldLongQuestions = this.longQuestions;
        this.longQuestions = longQuestions;
        changeSupport.firePropertyChange("longQuestions", oldLongQuestions, longQuestions);
    }

    public String getShortQuestions()
    {
        return shortQuestions;
    }

    public void setShortQuestions(String shortQuestions)
    {
        String oldShortQuestions = this.shortQuestions;
        this.shortQuestions = shortQuestions;
        changeSupport.firePropertyChange("shortQuestions", oldShortQuestions, shortQuestions);
    }

    public String getLongOptions()
    {
        return longOptions;
    }

    public void setLongOptions(String longOptions)
    {
        String oldLongOptions = this.longOptions;
        this.longOptions = longOptions;
        changeSupport.firePropertyChange("longOptions", oldLongOptions, longOptions);
    }

    public String getShortOptions()
    {
        return shortOptions;
    }

    public void setShortOptions(String shortOptions)
    {
        String oldShortOptions = this.shortOptions;
        this.shortOptions = shortOptions;
        changeSupport.firePropertyChange("shortOptions", oldShortOptions, shortOptions);
    }

    public int hashCode()
    {
        int hash = 0;
        hash += id == null ? 0 : id.hashCode();
        return hash;
    }

    public boolean equals(Object object)
    {
        if(!(object instanceof Passage))
            return false;
        Passage other = (Passage)object;
        return (id != null || other.id == null) && (id == null || id.equals(other.id));
    }

    public String toString()
    {
        return (new StringBuilder()).append("desktopapplication1.Passage[ id=").append(id).append(" ]").toString();
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
    private String shortPassage;
    private String longPassage;
    private String shortAnswer;
    private String longAnswer;
    private String yearMonth;
    private String longQuestions;
    private String shortQuestions;
    private String longOptions;
    private String shortOptions;
}