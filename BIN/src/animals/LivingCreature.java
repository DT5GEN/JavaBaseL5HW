package animals;

public class LivingCreature {

    protected String animalSpecies;
    protected int endurance;
    protected int jumpHeight;

    public LivingCreature () {};

    public LivingCreature(String animalSpecies, int endurance, int jumpHeight) {
        this.animalSpecies = animalSpecies;
        this.endurance = endurance;
        this.jumpHeight = jumpHeight;
    }

    public void race (int x) {
        if (endurance >= x )
        System.out.println(animalSpecies + " смогла пробежать " + x + " метра." );
        else System.out.println(animalSpecies + " не добежала до финиша.  (-_- ) ");

    }





    public void highJump (int y) {
        if (jumpHeight >= y)
        System.out.println(animalSpecies + " смогла прыгнуть на " + y + " метра." );
        else System.out.println(animalSpecies + " убилась не взяв высоту  в  " + y + " метра (-_- )");

    }
}
