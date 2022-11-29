public class Aircraft {
    String type;
    int currentAmmo;
    int maxAmmo;
    int baseDamage;

    public Aircraft(String type, int maxAmmo, int baseDamage) {
        this.type = type;
        this.currentAmmo = 0;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public int getDamage() {
        return baseDamage * currentAmmo;
    }

    public int fight() {
        int damageDeal;
        damageDeal = baseDamage * currentAmmo;
        return damageDeal;
    }

    public int refillAmmo(int incomingAmmo) {
        int ammoToFill = maxAmmo - currentAmmo;
        if (incomingAmmo <= ammoToFill) {
            currentAmmo = currentAmmo + incomingAmmo;
        }
        if (ammoToFill > 0) {
            currentAmmo = maxAmmo;
            return incomingAmmo - ammoToFill;
        }
        return incomingAmmo;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + currentAmmo +
                ", Base Damage: " + baseDamage + ", All Damage: " + getDamage();
    }

    public boolean isPriority() {
        return type.equals("F35");
    }
}
