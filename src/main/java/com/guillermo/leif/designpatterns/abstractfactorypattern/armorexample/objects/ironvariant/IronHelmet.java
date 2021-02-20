package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.ironvariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.IIron;

public class IronHelmet extends AArmorProperties implements IHelmet, IIron {
    public IronHelmet() {
        this.armorType = Type.HELMET;
        this.armorMaterial = Material.IRON;
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
    public void rust() {

    }
}
