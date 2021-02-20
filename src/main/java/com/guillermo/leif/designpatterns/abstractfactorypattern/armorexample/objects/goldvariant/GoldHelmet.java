package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.goldvariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.IGold;

public class GoldHelmet extends AArmorProperties implements IHelmet, IGold {
    public GoldHelmet() {
        this.armorType = Type.HELMET;
        this.armorMaterial = Material.GOLD;
    }

    @Override
    public void don() {

    }

    @Override
    public void doff() {

    }

    @Override
    public void protectHead() {

    }

    @Override
    public void enchantArmor() {
        
    }
}
