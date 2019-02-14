
package OVERRIDING;




class Worker1{
    public void wash(){
        System.out.println("Washing work is in progress");
        
    }
    
    public void sweep(){
        System.out.println("Sweeping work is in progress");
    }
    
    public void dust(){
        
        System.out.println("Dusting work is in progress");
    }
}

class supervisor1{
    Worker1 w = new Worker1();
    
    public void wash(){
        w.wash();
    }
    public void sweep(){
        w.sweep();
    }
    public void dust(){
        w.dust();
    }
}

public class OverridingDelegationModelOftenlyUsedProgms6 {
    public static void main(String[] args){
        supervisor1 s = new supervisor1();
        s.wash();
        s.sweep();
        s.dust();
    }
}


