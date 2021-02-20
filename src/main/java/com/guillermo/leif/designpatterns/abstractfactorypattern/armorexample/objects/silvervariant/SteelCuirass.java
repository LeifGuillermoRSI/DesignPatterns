package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.silvervariant;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.AArmorProperties;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.variants.ISteel;

public class SteelCuirass extends AArmorProperties implements ICuirass, ISteel{
    public SteelCuirass() {
        this.armorType = Type.CUIRASS;
        this.armorMaterial = Material.STEEL;
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
    public void shine() {

    }
}
