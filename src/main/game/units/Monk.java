package units;

import java.util.ArrayList;

public class Monk extends Healers{
    public Monk(String name,int x, int y) {
        super(100, name, "Monk", 5, 4, 130, 6,x,y);
    }



    @Override
    public String getInfo() {
        return  name + " " + type +", ♡: " + hp + ", Attack: " + baseAttack + ", Init: " + initiative + ", mp: " + mp +", Spell: Heal " + heal ;
    }
}
