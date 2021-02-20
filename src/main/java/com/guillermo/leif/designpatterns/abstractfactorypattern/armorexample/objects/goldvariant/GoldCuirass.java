package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.goldvariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.IGold;

public class GoldCuirass extends AArmorProperties implements ICuirass, IGold {
    public GoldCuirass() {
        this.armorType = Type.CUIRASS;
        this.armorMaterial = Material.GOLD;
    }

    @Override
    public void don() {

    }

    @Override
    public void doff() {

    }

    @Override
    public void protectChest() {

    }

    @Override
    public void enchantArmor() {

    }
}
