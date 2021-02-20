package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.concretefactories;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.factoryinterface.IArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.silvervariant.SteelCuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.silvervariant.SteelGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.silvervariant.SteelGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.silvervariant.SteelHelmet;
import org.springframework.stereotype.Component;

@Component
public class ISteelArmorFactory implements IArmorFactory {
    @Override
    public IHelmet createHelmet() {
        return new SteelHelmet();
    }

    @Override
    public IGauntlets createGauntlets() {
        return new SteelGauntlets();
    }

    @Override
    public IGrieves createGrieves() {
        return new SteelGrieves();
    }

    @Override
    public ICuirass createCuirass() {
        return new SteelCuirass();
    }
}
