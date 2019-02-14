
class Plane{        /*POLYMORPHIC VERSION WITHOUT FLEXIBILTY */
    public void takeoff(){
        System.out.println("PLane is taking Off");
    }
    public void fly(){
        System.out.println("Plane is Flying");
    }
    public void land(){
        System.out.println("Plane is Landing");
    }
}




class PassengerPlane extends Plane{
    
    @Override
    public void takeoff(){
        
            System.out.println("PassengerPlane is taking off from a medium size runway");
    }
    @Override
    public void fly(){
        
        System.out.println("PassengerPalne is flying with Medium speed");
    }
    @Override
    public void land(){
        System.out.println("PassengerPlane is landing with medium size rum runway");
    }
}

class CargoPlane extends Plane{
    
    @Override
    
    public void takeoff(){
        
            System.out.println("CargoPlane is taking off from a long size runway");
    }
    @Override
    public void fly(){
        System.out.println("Cargo plane is flying with Low speed");
    }
    @Override
    public void land(){
        
        System.out.println("Cargo plane is landing on a long size runway");
    }
}

class FighterPlane extends Plane{
    
    @Override
    public void takeoff(){
        
            System.out.println("FightrePlane is taking off from a small size runway");
    }
    
    @Override
    public void fly(){
        System.out.println("FighterPlane is flying with high speed");
    }
    public void land(){
        
        System.out.println("Fighter Plane is landing on small size runway Arms");
    }
}
public class PolymProgm6 {
    
    public static void main(String[] args){
        
        PassengerPlane PP = new PassengerPlane();
        CargoPlane CP = new CargoPlane();
        FighterPlane FP = new FighterPlane();
        
        Plane ref;
        
        ref= PP;
        ref.takeoff();
        ref.fly();
        ref.land();
        System.out.println();       /* to give space */
        
        ref =CP;
        ref.takeoff();
        ref.fly();
        ref.land();
        System.out.println();        /* to give space */
        
        ref = FP;
        ref.takeoff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}

