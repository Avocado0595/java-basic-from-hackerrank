package org.example.model.TableModel;


public class ComboCourseModel  {
    private String value;
    private int key;
    public ComboCourseModel(int key, String value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
