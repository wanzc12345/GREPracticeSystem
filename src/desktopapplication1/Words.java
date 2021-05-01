// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:17
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Words.java

package desktopapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Words
    implements Serializable
{

    public Words()
    {
        changeSupport = new PropertyChangeSupport(this);
    }

    public Words(Integer id)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
    }

    public Words(Integer id, String word, String meaning, String antonymy, String analogy)
    {
        changeSupport = new PropertyChangeSupport(this);
        this.id = id;
        this.word = word;
        this.meaning = meaning;
        this.antonymy = antonymy;
        this.analogy = analogy;
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

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        String oldWord = this.word;
        this.word = word;
        changeSupport.firePropertyChange("word", oldWord, word);
    }

    public String getMeaning()
    {
        return meaning;
    }

    public void setMeaning(String meaning)
    {
        String oldMeaning = this.meaning;
        this.meaning = meaning;
        changeSupport.firePropertyChange("meaning", oldMeaning, meaning);
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

    public int hashCode()
    {
        int hash = 0;
        hash += id == null ? 0 : id.hashCode();
        return hash;
    }

    public boolean equals(Object object)
    {
        if(!(object instanceof Words))
            return false;
        Words other = (Words)object;
        return (id != null || other.id == null) && (id == null || id.equals(other.id));
    }

    public String toString()
    {
        return (new StringBuilder()).append("desktopapplication1.Words[ id=").append(id).append(" ]").toString();
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
    private String word;
    private String meaning;
    private String antonymy;
    private String analogy;
}