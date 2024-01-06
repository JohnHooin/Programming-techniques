package Dependence_Injection.PluggableCable;

// Day ket noi Lining 

public class LiningCable implements CableInerfaces {
    String interfaces;
    public LiningCable(){
        interfaces = "Lining cable for iphone";
    }
    @Override 
    public String AbleToCharge(){
        return "Charging using " + interfaces;
    }
}