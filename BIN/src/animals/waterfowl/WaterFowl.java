package animals.waterfowl;

import animals.LivingCreature;

public class WaterFowl extends LivingCreature {

    int swimLength;

    public WaterFowl(String animalSpecies, int endurance, int jumpHeight, int swimLength) {
        super(animalSpecies, endurance, jumpHeight);
        this.swimLength = swimLength;
    }


    public void swim (int z ) {
        if ( swimLength >= z )
        System.out.println(animalSpecies + " смогла проплыть " + z + " метра." );
        else System.out.println(animalSpecies + " не доплыла до финиша. RIP (-_- ) ");

    }

}
