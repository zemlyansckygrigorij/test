package Test;
import java.util.Scanner;



public class App {
    public static int  sum;
    public static void main(String[] args) {
        ListObj listObj = new ListObj();
        Obj obj0 = listObj.getObj();
        sum = 0;
        count(obj0);

        System.out.println(sum);
    }

    public static void count(Obj obj){
        sum = sum +obj.getValue();
        if(obj.getList() ==null) return;
        for(int i = 0 ; i < obj.getList().size(); i++){
            count(obj.getList().get(i));
        }

    }
}
