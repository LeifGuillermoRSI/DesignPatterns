package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.concretefactories;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.factoryinterface.IArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.ironvariant.IronCuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.ironvariant.IronGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.ironvariant.IronGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.ironvariant.IronHelmet;
import org.springframework.stereotype.Component;

@Component
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
