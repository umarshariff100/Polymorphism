
class plane1{        /*POLYMORPHIC VERSION WITH FLEXIBILTY */
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




class PassengerPlane1 extends plane1{
    
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

class CargoPlane1 extends plane1{
    
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

class FighterPlane1 extends plane1{
    
    @Override
    public void takeoff(){
        
            System.out.println("FightrePlane is taking off from a small size runway");
    }
    
    @Override
    public void fly(){
        System.out.println("FighterPlane is flying with high speed");
    }
    @Override
    public void land(){
        
        System.out.println("Fighter Plane is landing on small size runway Arms");
    }
}

class airport{
    public void permit(plane1 ref){
        ref.takeoff();
        ref.fly();
        ref.land();
    }

    
}
public class PolymProgm7{
    
    public static void main(String[] args){
        
        PassengerPlane1 PP = new PassengerPlane1();
        CargoPlane1 CP = new CargoPlane1();
        FighterPlane1 FP = new FighterPlane1();
        
           airport a = new airport();
           a.permit(PP);
           System.out.println();
           a.permit(CP);
           System.out.println();
           a.permit(FP);
        
        
    }
}

