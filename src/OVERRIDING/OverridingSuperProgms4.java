
package OVERRIDING;


class Demo1111{   /* SUPER CLASS KEYWORD*/
    public int i;
    Demo1111(){
        i =10;
    }
}

class Demo2222 extends Demo1111{
    public int i;
    Demo2222(){
        i = 100000;
    }
    public void disp(){
        System.out.println(i);
        System.out.println(super.i);  /*USING SUPER CLASS KEYWORD*/
    }       /*SUPER KEYWORD WHICH IS USED TO RESOLVE NAME CLASH THAT OCCUR
                BETWEEN THE VARIABLE OF THE PARENT
                CLASS AND THE CHILD CLASS*/
}

public class OverridingSuperProgms4 {
    public static void main(String[] args){
        Demo2222 d2 = new Demo2222();
        d2.disp();
    }
}
