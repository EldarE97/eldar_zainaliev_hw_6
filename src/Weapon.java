public class Weapon {

    private WeaponType fireArms;
    private String rpk; // рпк
    private String sword; // меч
    private String missile; // ракета

    public WeaponType getFire() {
        return fireArms;
    }

    public void setFire(WeaponType fire) {
        this.fireArms = fire;
    }

    public String getRpk() {
        return rpk;
    }

    public void setRpk(String rpk) {
        this.rpk = rpk;
    }
}