package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.concretefactories;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.factoryinterface.IArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IHelmet;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.goldvariant.GoldCuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.goldvariant.GoldGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.goldvariant.GoldGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.goldvariant.GoldHelmet;
import org.springframework.stereotype.Component;

@Component
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
