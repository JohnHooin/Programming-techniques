package Dependence_Injection.Second;

// Doi voi charger khong the doi interface 

public class UnpluggableCharger {
    // Kha nang charge chi co dinh cho iphone 
    String ableToCharge;
    public UnpluggableCharger(){
        this.ableToCharge = "Iphone only";  
    }
    public void chargePhone(){
        System.out.println(ableToCharge);
    }
}

