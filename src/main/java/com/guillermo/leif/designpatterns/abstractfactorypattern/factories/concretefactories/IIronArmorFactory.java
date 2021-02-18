package com.guillermo.leif.designpatterns.abstractfactorypattern.factories.concretefactories;

import com.guillermo.leif.designpatterns.abstractfactorypattern.factories.factoryinterface.IArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.ironvariant.IronCuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.ironvariant.IronGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.ironvariant.IronGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objects.ironvariant.IronHelmet;

public class IIronArmorFactory implements IArmorFactory {
    @Override
    public IHelmet createHelmet() {
        return new IronHelmet();
    }

    @Override
    public IGauntlets createGauntlets() {
        return new IronGauntlets();
    }

    @Override
    public IGrieves createGrieves() {
        return new IronGrieves();
    }

    @Override
    public ICuirass createCuirass() {
        return new IronCuirass();
    }
}
