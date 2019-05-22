package Test;

import java.util.ArrayList;

public class Obj {
    private int value;
    private ArrayList<Obj> list= new ArrayList<Obj>();

    public Obj(int value, ArrayList<Obj> list) {
        this.value = value;
        this.list = list;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Obj> getList() {
        return list;
    }

    public void setList(ArrayList<Obj> list) {
        this.list = list;
    }

}
