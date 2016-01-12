package com.guinet.dota.Models;

/**
 * Created by elpesao on 04/01/2016.
 */
public class Skill {


    public int id;
    public String description;
    public String image;
    public String mana;
    public String cooldown;
    public String lengthAbility;
    public String immunitySpell;
    public String damage;
    public String video;

    public String getVideo() {return video;}

    public void setVideo(String video) {this.video = video;}

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
        this.mana = mana;
    }

    public String getLengthAbility() {
        return lengthAbility;
    }

    public void setLengthAbility(String lengthAbility) {
        this.lengthAbility = lengthAbility;
    }

    public String getImmunitySpell() {
        return immunitySpell;
    }

    public void setImmunitySpell(String immunitySpell) {
        this.immunitySpell = immunitySpell;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getCooldown() {
        return cooldown;
    }

    public void setCooldown(String cooldown) {
        this.cooldown = cooldown;
    }
}
