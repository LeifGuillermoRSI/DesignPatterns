package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.ironvariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.IIron;

public class IronGauntlets extends AArmorProperties implements IGauntlets, IIron {
    public IronGauntlets() {
        this.armorType = Type.GAUNTLETS;
        this.armorMaterial = Material.IRON;
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
    public void rust() {

    }
}
