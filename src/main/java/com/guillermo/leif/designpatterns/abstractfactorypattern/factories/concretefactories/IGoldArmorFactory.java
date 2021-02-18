package com.guillermo.leif.designpatterns.abstractfactorypattern.factories.concretefactories;

import com.guillermo.leif.designpatterns.abstractfactorypattern.factories.factoryinterface.IArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.goldvariant.GoldCuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.goldvariant.GoldGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.goldvariant.GoldGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.goldvariant.GoldHelmet;

public class IGoldArmorFactory implements IArmorFactory {
    @Override
    public IHelmet createHelmet() {
        return new GoldHelmet();
    }

    @Override
    public IGauntlets createGauntlets() {
        return new GoldGauntlets();
    }

    @Override
    public IGrieves createGrieves() {
        return new GoldGrieves();
    }

    @Override
    public ICuirass createCuirass() {
        return new GoldCuirass();
    }
}
