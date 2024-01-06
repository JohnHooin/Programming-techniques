package Dependence_Injection;

import Dependence_Injection.PluggableCable.*;
import Dependence_Injection.UnpluggableCable.*;

public class Main {
    public static void main(String[] args) {

        // Truong hop su dung charger khong the thao roi day 
        UnpluggableCharger unpluggableCharger = new UnpluggableCharger();
        unpluggableCharger.chargePhone();
        CableInerfaces pluginCable = new LiningCable();
        // CableInerfaces pluginCable = new TypeCCable();
        PluggableCharger pluggableCharger = new PluggableCharger(pluginCable);
        pluggableCharger.chargePhone();
    }
}
