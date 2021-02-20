package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.silvervariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.ISteel;

public class SteelGauntlets extends AArmorProperties implements IGauntlets, ISteel {
    public SteelGauntlets() {
        this.armorType = Type.GAUNTLETS;
        this.armorMaterial = Material.STEEL;
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
    public void shine() {

    }
}
