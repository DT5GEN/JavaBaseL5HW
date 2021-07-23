import animals.LivingCreature;
import animals.overland.Birds;
import animals.overland.Cats;
import animals.waterfowl.Dogs;
import animals.waterfowl.Horses;
import animals.waterfowl.WaterFowl;

public class Main {

    public static void main(String[] args) {

        Cats cats = new Cats("Кошка", 200, 1);
        Birds birds = new Birds("Птица", 50, 50);
        Dogs dogs = new Dogs("Собака", 400, 2, 100);
        Horses horses = new Horses("Лошадка", 3000, 2, 500);

        LivingCreature [] sportAnimals = {cats, birds, dogs, horses};

        for (int i = 0; i <sportAnimals.length ; i++) {
            sportAnimals[i].race(150);
            sportAnimals[i].highJump(1);
            if (sportAnimals[i] instanceof WaterFowl ) {

                WaterFowl waterFowl1 = (WaterFowl) sportAnimals[i];
                waterFowl1.swim(200);
            }

        }


    }

}
