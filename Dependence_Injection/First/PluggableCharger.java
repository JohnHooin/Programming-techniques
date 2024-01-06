package Dependence_Injection.First;

public class PluggableCharger { 
    public PluggableCharger(){
    }

    // Su dung CableInterface lam trung gian de vua co the su 
    // cho dau sac Iphone (Lining) vua dung cho Android 
    // (Type C)

    public void chargePhone(String ableToCharge){
        System.out.println(ableToCharge);
    }
}
