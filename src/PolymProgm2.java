

class parent1{  /*POLYMORPHIC VERSION */
    public void cry(){
        
        System.out.println("Parent Does not cry");
    }
}

class child11 extends parent1{
    
    @Override
    public void cry(){
        System.out.println("Child1 cries with low voice");
    }
}

class child22 extends parent1{
    
    public void cry(){
        System.out.println("Child2 cries with medium voice");
    }
}

class child33 extends parent1{
    
    public void cry(){
        System.out.println("Child3 cries with High voice");
    }
}
public class PolymProgm2{
    
    public static void main(String[] args){
        parent1 ref;
        
        child11 c1 = new child11();
        child22 c2 = new child22();
        child33 c3 = new child33();
        
        
        ref = c1;
        ref.cry();
        
        
        ref = c2;
        ref.cry();
        
        
        ref = c3;
        ref.cry();
    }
}

