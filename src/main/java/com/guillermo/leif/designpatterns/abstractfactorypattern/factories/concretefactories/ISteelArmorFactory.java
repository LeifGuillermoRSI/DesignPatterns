package com.guillermo.leif.designpatterns.abstractfactorypattern.factories.concretefactories;

import com.guillermo.leif.designpatterns.abstractfactorypattern.factories.factoryinterface.IArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.silvervariant.SteelCuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.silvervariant.SteelGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.silvervariant.SteelGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.silvervariant.SteelHelmet;

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
