package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.goldvariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.IGold;

public class GoldGauntlets extends AArmorProperties implements IGauntlets, IGold {
    public GoldGauntlets() {
        this.armorType = Type.GAUNTLETS;
        this.armorMaterial = Material.GOLD;
    }

    @Override
    public void don() {

    }

    @Override
    public void doff() {

    }

    @Override
    public void protectHands() {

    }

    @Override
    public void enchantArmor() {

    }
}
