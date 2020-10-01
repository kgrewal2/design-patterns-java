package Prototype;

import javax.swing.plaf.IconUIResource;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
            System.out.println("Cloning Shape");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }

    public void setId(String id) {
        this.id = id;
    }
}
