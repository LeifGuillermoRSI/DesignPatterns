package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.ironvariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.IIron;

public class IronGrieves extends AArmorProperties implements IGrieves, IIron {
    public IronGrieves() {
        this.armorType = Type.GRIEVES;
        this.armorMaterial = Material.IRON;
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
    public void rust() {

    }
}
