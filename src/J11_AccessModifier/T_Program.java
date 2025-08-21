package J11_AccessModifier;

import J11_AccessModifier.Police.Cop;

public class T_Program {
    public static void main(String[] args) {

        Cop c1 = new Cop(10);
        //c1.canIShoot();               - This method of file is not present in the same Folder.
    }
}