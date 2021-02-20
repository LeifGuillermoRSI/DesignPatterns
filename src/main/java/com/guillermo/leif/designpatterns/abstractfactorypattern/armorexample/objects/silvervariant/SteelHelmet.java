package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.silvervariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.ISteel;

public class SteelHelmet extends AArmorProperties implements IHelmet, ISteel {
    public SteelHelmet() {
        this.armorType = Type.HELMET;
        this.armorMaterial = Material.STEEL;
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
    public void shine() {

    }
}
