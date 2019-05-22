package Test;

import java.util.ArrayList;

public class ListObj {
    private ArrayList<Obj> list= new ArrayList<Obj>();
    private Obj obj0 ;
    public ListObj() {
        ArrayList<Obj> list1 = new ArrayList<Obj>();
        list1.add( new Obj(11,null));
        list1.add(  new Obj(12,null));
        list1.add(  new Obj(13,null));
        list1.add(  new Obj(14,null));
        list1.add(  new Obj(15,null));

        ArrayList<Obj> list2 = new ArrayList<Obj>();
        list2.add( new Obj(21,null));
        list2.add(  new Obj(22,null));
        list2.add(  new Obj(23,null));
        list2.add(  new Obj(24,null));
        list2.add(  new Obj(25,null));

        ArrayList<Obj> list3 = new ArrayList<Obj>();
        list3.add( new Obj(31,null));
        list3.add(  new Obj(32,null));
        list3.add(  new Obj(33,null));
        list3.add(  new Obj(34,null));
        list3.add(  new Obj(35,null));

        ArrayList<Obj> list4 = new ArrayList<Obj>();
        list4.add( new Obj(41,null));
        list4.add(  new Obj(42,null));
        list4.add(  new Obj(43,null));
        list4.add(  new Obj(44,null));
        list4.add(  new Obj(45,null));



        ArrayList<Obj> list5 = new ArrayList<Obj>();
        list5.add(  new Obj(51,null));
        list5.add(  new Obj(52,null));
        list5.add(  new Obj(53,null));
        list5.add(  new Obj(54,null));
        list5.add(  new Obj(55,null));

        ArrayList<Obj> list0 = new ArrayList<Obj>();
        list0.add(  new Obj(1, list1));
        list0.add(  new Obj(2, list2));
        list0.add(  new Obj(3, list3));
        list0.add(  new Obj(4, list4));
        list0.add(  new Obj(5, list5));


        obj0 =  new Obj(0, list0);
    }

    public Obj getObj() {
        return obj0;
    }
}
