package Dependence_Injection.PluggableCable;

public class PluggableCharger { 
    private CableInerfaces cableInerfaces;
    // Injected
    public PluggableCharger(CableInerfaces pluginCable){
        this.cableInerfaces = pluginCable;
    }

    // Su dung CableInterface lam trung gian de vua co the su 
    // cho dau sac Iphone (Lining) vua dung cho Android 
    // (Type C)

    public void chargePhone(){
        System.out.println(cableInerfaces.AbleToCharge());
    }
}
