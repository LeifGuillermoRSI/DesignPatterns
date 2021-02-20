package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility;

import com.google.gson.Gson;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.concretefactories.IGoldArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.concretefactories.IIronArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.factories.concretefactories.ISteelArmorFactory;
import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.objects.interfaces.IArmor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ArmorToJSONConverter implements IArmorSetCreator {
    private static final Gson gson = new Gson();

    private final IGoldArmorFactory goldArmorFactory;
    private final ISteelArmorFactory steelArmorFactory;
    private final IIronArmorFactory ironArmorFactory;

    @Autowired
    public ArmorToJSONConverter(
            IGoldArmorFactory goldArmorFactory,
            ISteelArmorFactory steelArmorFactory,
            IIronArmorFactory ironArmorFactory) {
        this.goldArmorFactory = goldArmorFactory;
        this.steelArmorFactory = steelArmorFactory;
        this.ironArmorFactory = ironArmorFactory;
    }


    public String getGoldArmorSet() {
        List<IArmor> armorList = Arrays.asList(
                goldArmorFactory.createCuirass(),
                goldArmorFactory.createGauntlets(),
                goldArmorFactory.createGrieves(),
                goldArmorFactory.createHelmet()
        );
        return gson.toJson(armorList);
    }

    public String getSteelArmorSet() {
        List<IArmor> armorList = Arrays.asList(
                steelArmorFactory.createCuirass(),
                steelArmorFactory.createGauntlets(),
                steelArmorFactory.createGrieves(),
                steelArmorFactory.createHelmet()
        );
        return gson.toJson(armorList);
    }

    public String getIronArmorSet() {
        List<IArmor> armorList = Arrays.asList(
                ironArmorFactory.createCuirass(),
                ironArmorFactory.createGauntlets(),
                ironArmorFactory.createGrieves(),
                ironArmorFactory.createHelmet()
        );
        return gson.toJson(armorList);
    }
}
