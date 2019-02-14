
package OVERRIDING;


class Worker{
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

class supervisor extends Worker{
    
}

public class OverridingDelegationModelProgms5 {
    public static void main(String[] args){
        supervisor s = new supervisor();
        s.wash();
        s.sweep();
        s.dust();
    }
}
