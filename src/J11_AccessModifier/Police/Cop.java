package J11_AccessModifier.Police;

public class Cop {

    public int gun;
    String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() {
        System.out.println("Yes, you can shoot!");
    }
}