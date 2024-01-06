package Dependence_Injection.First;

// Day ket noi Type C 

public class TypeCCable implements CableInerfaces{
    String interfaces;
    public TypeCCable(){
        interfaces = "Type C cable for Android";
    }
    @Override
    public String AbleToCharge(){
        return "Charging using" + interfaces;
    }
}