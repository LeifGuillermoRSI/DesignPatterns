package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.ironvariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.IIron;

public class IronCuirass extends AArmorProperties implements ICuirass, IIron{
    public IronCuirass() {
        this.armorType = Type.CUIRASS;
        this.armorMaterial = Material.IRON;
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
    public void rust() {

    }
}
