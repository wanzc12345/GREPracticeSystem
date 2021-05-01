// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:06
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Grade.java

package desktopapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Grade
    implements Serializable
{

    public Grade()
    {
        changeSupport = new PropertyChangeSupport(this);
    }

    public Grade(String name)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getFillingBlank()
    {
        return fillingBlank;
    }

    public void setFillingBlank(Integer fillingBlank)
    {
        Integer oldFillingBlank = this.fillingBlank;
        this.fillingBlank = fillingBlank;
        changeSupport.firePropertyChange("fillingBlank", oldFillingBlank, fillingBlank);
    }

    public Integer getPassage()
    {
        return passage;
    }

    public void setPassage(Integer passage)
    {
        Integer oldPassage = this.passage;
        this.passage = passage;
        changeSupport.firePropertyChange("passage", oldPassage, passage);
    }

    public Integer getAnalogyAntonymy()
    {
        return analogyAntonymy;
    }

    public void setAnalogyAntonymy(Integer analogyAntonymy)
    {
        Integer oldAnalogyAntonymy = this.analogyAntonymy;
        this.analogyAntonymy = analogyAntonymy;
        changeSupport.firePropertyChange("analogyAntonymy", oldAnalogyAntonymy, analogyAntonymy);
    }

    public Integer getFillingBlankCorrect()
    {
        return fillingBlankCorrect;
    }

    public void setFillingBlankCorrect(Integer fillingBlankCorrect)
    {
        Integer oldFillingBlankCorrect = this.fillingBlankCorrect;
        this.fillingBlankCorrect = fillingBlankCorrect;
        changeSupport.firePropertyChange("fillingBlankCorrect", oldFillingBlankCorrect, fillingBlankCorrect);
    }

    public Integer getPassageCorrect()
    {
        return passageCorrect;
    }

    public void setPassageCorrect(Integer passageCorrect)
    {
        Integer oldPassageCorrect = this.passageCorrect;
        this.passageCorrect = passageCorrect;
        changeSupport.firePropertyChange("passageCorrect", oldPassageCorrect, passageCorrect);
    }

    public Integer getAnalogyAntonymyCorrect()
    {
        return analogyAntonymyCorrect;
    }

    public void setAnalogyAntonymyCorrect(Integer analogyAntonymyCorrect)
    {
        Integer oldAnalogyAntonymyCorrect = this.analogyAntonymyCorrect;
        this.analogyAntonymyCorrect = analogyAntonymyCorrect;
        changeSupport.firePropertyChange("analogyAntonymyCorrect", oldAnalogyAntonymyCorrect, analogyAntonymyCorrect);
    }

    public int hashCode()
    {
        int hash = 0;
        hash += name == null ? 0 : name.hashCode();
        return hash;
    }

    public boolean equals(Object object)
    {
        if(!(object instanceof Grade))
            return false;
        Grade other = (Grade)object;
        return (name != null || other.name == null) && (name == null || name.equals(other.name));
    }

    public String toString()
    {
        return (new StringBuilder()).append("desktopapplication1.Grade[ name=").append(name).append(" ]").toString();
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
    private String name;
    private Integer fillingBlank;
    private Integer passage;
    private Integer analogyAntonymy;
    private Integer fillingBlankCorrect;
    private Integer passageCorrect;
    private Integer analogyAntonymyCorrect;
}