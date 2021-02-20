package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.goldvariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.IGold;

public class GoldGrieves extends AArmorProperties implements IGrieves, IGold {
    public GoldGrieves() {
        this.armorType = Type.GRIEVES;
        this.armorMaterial = Material.GOLD;
    }

    @Override
    public void don() {

    }

    @Override
    public void doff() {

    }

    @Override
    public void protectLegs() {

    }

    @Override
    public void enchantArmor() {

    }
}
