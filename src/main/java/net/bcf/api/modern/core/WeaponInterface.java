package net.bcf.api.modern.core;

public interface WeaponInterface {
    void shoot();
    void reload();
    AmmoTypes getAmmoType();
    int getAmmoCapacity();
}
