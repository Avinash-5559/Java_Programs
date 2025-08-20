package AccessModifier.Criminal;

import AccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop thief = new Cop(100);
        //thief.canIShoot();                - This method of file is not present in the same Folder.
    }
}