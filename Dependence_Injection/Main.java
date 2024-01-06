package Dependence_Injection;
import Dependence_Injection.First.CableInerfaces;
import Dependence_Injection.First.LiningCable;
import Dependence_Injection.First.PluggableCharger;
import Dependence_Injection.First.TypeCCable;
import Dependence_Injection.Second.UnpluggableCharger;

public class Main {
    public static void main(String[] args) {

        // Truong hop su dung charger khong the thao roi day 
        UnpluggableCharger unpluggableCharger = new UnpluggableCharger();
        unpluggableCharger.chargePhone();

        // truong hop co the doi day, su dung Interface lam trung gian
        CableInerfaces typeCCable = new TypeCCable(); // TypeC Interface
        CableInerfaces liningCable = new LiningCable(); // Lin Inetface
        PluggableCharger pluggableCharger = new PluggableCharger();

        // Sac cho android dung interface Type C
        pluggableCharger.chargePhone(typeCCable.AbleToCharge());
        // Sac cho iphone dung lining Interface
        pluggableCharger.chargePhone(liningCable.AbleToCharge());
    }
}
