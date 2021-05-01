// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:17
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Verbal.java

package desktopapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Verbal
    implements Serializable
{

    public Verbal()
    {
        changeSupport = new PropertyChangeSupport(this);
    }

    public Verbal(Integer id)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
    }

    public Verbal(Integer id, String antonymyAnswer, String antonymy, String analogy, String analogyAnswer, String yearMonth)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
        this.antonymyAnswer = antonymyAnswer;
        this.antonymy = antonymy;
        this.analogy = analogy;
        this.analogyAnswer = analogyAnswer;
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

    public String getAntonymyAnswer()
    {
        return antonymyAnswer;
    }

    public void setAntonymyAnswer(String antonymyAnswer)
    {
        String oldAntonymyAnswer = this.antonymyAnswer;
        this.antonymyAnswer = antonymyAnswer;
        changeSupport.firePropertyChange("antonymyAnswer", oldAntonymyAnswer, antonymyAnswer);
    }

    public String getAntonymy()
    {
        return antonymy;
    }

    public void setAntonymy(String antonymy)
    {
        String oldAntonymy = this.antonymy;
        this.antonymy = antonymy;
        changeSupport.firePropertyChange("antonymy", oldAntonymy, antonymy);
    }

    public String getAnalogy()
    {
        return analogy;
    }

    public void setAnalogy(String analogy)
    {
        String oldAnalogy = this.analogy;
        this.analogy = analogy;
        changeSupport.firePropertyChange("analogy", oldAnalogy, analogy);
    }

    public String getAnalogyAnswer()
    {
        return analogyAnswer;
    }

    public void setAnalogyAnswer(String analogyAnswer)
    {
        String oldAnalogyAnswer = this.analogyAnswer;
        this.analogyAnswer = analogyAnswer;
        changeSupport.firePropertyChange("analogyAnswer", oldAnalogyAnswer, analogyAnswer);
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
        if(!(object instanceof Verbal))
            return false;
        Verbal other = (Verbal)object;
        return (id != null || other.id == null) && (id == null || id.equals(other.id));
    }

    public String toString()
    {
        return (new StringBuilder()).append("desktopapplication1.Verbal[ id=").append(id).append(" ]").toString();
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
    private String antonymyAnswer;
    private String antonymy;
    private String analogy;
    private String analogyAnswer;
    private String yearMonth;
}