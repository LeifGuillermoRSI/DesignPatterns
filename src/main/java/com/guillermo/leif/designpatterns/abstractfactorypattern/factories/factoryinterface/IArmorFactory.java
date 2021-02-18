package com.guillermo.leif.designpatterns.abstractfactorypattern.factories.factoryinterface;

import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.ICuirass;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IGauntlets;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IGrieves;
import com.guillermo.leif.designpatterns.abstractfactorypattern.objectinterfaces.IHelmet;

/**
 * The IArmorFactory interface does not specify material. It only specifies products which exist across all materials.
 * i.e. IArmorFactory does not specify if a piece of armor is gold, silver, or iron. It only specifies the piece of
 * armor.
 * <p>
 * The concrete factories determine which materials will be used since these variants only concern the client of the
 * factory pattern.
 * <p>
 * Notice that the concrete factories all still return the respective armor interfaces rather than their concrete
 * implementations so that if the client of the factory pattern wants to use a different variant, they are not
 * restricted to only one variant.
 * <p>
 * To use the factory pattern as a client would, you need to check to see which factory you need, and then
 * continue to use that factory.
 */
public interface IArmorFactory {
    IHelmet createHelmet();

    IGauntlets createGauntlets();

    IGrieves createGrieves();

    ICuirass createCuirass();
}
