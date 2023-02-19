public enum WeaponType {
    FIREARMS(""), COLD_WEAPON(""), MISSILE_WEAPONS("");

   String weapon;
    WeaponType(String weapon) {
        this.weapon = weapon;
    }
    public String getV() {
        return weapon;
    }
}