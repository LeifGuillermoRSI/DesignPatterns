package com.guillermo.leif.designpatterns.abstractfactorypattern.armorexample.mvcutility;

public abstract class AArmorProperties {
    public String armorType;
    public String armorMaterial;

    public static class Type {
        public static final String CUIRASS = "Cuirass";
        public static final String GAUNTLETS = "Gauntlets";
        public static final String GRIEVES = "Grieves";
        public static final String HELMET = "Helmet";
    }

    public static class Material {
        public static final String GOLD = "Gold";
        public static final String STEEL = "Steel";
        public static final String IRON = "Iron";
    }
}
