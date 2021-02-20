package com.guillermo.leif.app.mvc.controllers;

import com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility.IArmorSetCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmorSet {
    private final IArmorSetCreator armorSetCreator;

    @Autowired
    public ArmorSet(IArmorSetCreator armorSetCreator) {
        this.armorSetCreator = armorSetCreator;
    }

    @GetMapping(value = "goldArmor", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getGoldArmorSet() {
        return armorSetCreator.getGoldArmorSet();
    }

    @GetMapping(value = "steelArmor", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getSteelArmorSet() {
        return armorSetCreator.getSteelArmorSet();
    }

    @GetMapping(value = "ironArmor", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getIronArmorSet() {
        return armorSetCreator.getIronArmorSet();
    }
}
