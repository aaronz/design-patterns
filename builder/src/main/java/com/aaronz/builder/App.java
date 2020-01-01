package com.aaronz.builder;

import com.aaronz.builder.Hero.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        Hero mage = new Hero.Builder(Profession.MAGE, "Leo")
            .withHairColor(HairColor.BLOND)
            .withWeapon(Weapon.AXE)
            .build();
            logger.info(mage.toString());

        Hero warrior = new Hero.Builder(Profession.WARRIOR, "Richard")
            .withHairColor(HairColor.BROWN)
            .withHairType(HairType.CURLY)
            .withArmor(Armor.CHAIN_MAIL)
            .withWeapon(Weapon.SWORD)
            .build();
            logger.info(warrior.toString());
    }
}
