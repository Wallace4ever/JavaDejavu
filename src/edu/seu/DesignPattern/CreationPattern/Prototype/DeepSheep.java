package edu.seu.DesignPattern.CreationPattern.Prototype;

import java.util.Date;

public class DeepSheep implements Cloneable{
    private String name;
    private Date birthday;

    public DeepSheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();
        DeepSheep s=(DeepSheep)obj;
        s.birthday=(Date)this.birthday.clone();
        return obj;
    }
}
