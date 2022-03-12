/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mutablevsimmutable;

/**
 *
 * @author rvc
 */
public class MutableVsImmutable
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //StringBuilder is mutable
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        
        //String is immutable
        String warriorWeapon = "Sword ";
        
        changeWarriorClass(warriorProfession, warriorWeapon);

        //warriorWeapon is not updated from changeWarriorClass because String is immutable
        System.out.println("main: " + "Warrior=" + warriorProfession + " Weapon=" + warriorWeapon);
        
        warriorWeapon = "Axe";
        
        //the assignment above actually creates a new instance of warriorWeapon and assigns Axe to it instead of updating the value it previously held
        System.out.println("main: " + "Warrior=" + warriorProfession + " Weapon=" + warriorWeapon);
    }

    static void changeWarriorClass(StringBuilder warriorProfession, String weapon)
    {
        warriorProfession.append("Knight");
        weapon = "Dragon " + weapon;
        weapon = weapon.concat(" of Truth");
        
        System.out.println("changeWarriorClass: " + "Warrior=" + warriorProfession + " Weapon=" + weapon);
        
        weapon = null;
        warriorProfession = null;
    }

}
