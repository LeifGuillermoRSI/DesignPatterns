package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.silvervariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.ISteel;

public class SteelGrieves extends AArmorProperties implements IGrieves, ISteel {
    public SteelGrieves() {
        this.armorType = Type.GRIEVES;
        this.armorMaterial = Material.STEEL;
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
    public void shine() {

    }
}
