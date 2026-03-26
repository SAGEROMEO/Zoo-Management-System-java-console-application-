public class Fish extends Animal
{
    private String name;

    private String species;

    private String sound = "no sound";

    private String limbs = "fins";

    private String habitat = "body of water";

    Fish(){}

    Fish(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

    Fish(String name, String species,String sound,String limbs, String habitat)
    {
        this.name = name;
        this.species = species;
        this.sound =sound;
        this.limbs = limbs;
        this.habitat = habitat;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSpecies()
    {
        return species;
    }

    public void setSpecies(String species)
    {
        this.species = species;

    }

    public String getSound()
    {
        return sound;
    }

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    public String getLimbs()
    {
        return limbs;
    }

    public void setLimbs(String limbs)
    {
        this.limbs = limbs;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

    public String getHabitat()
    {
        return habitat;
    }

    @Override
    void display()
    {

        System.out.println("Animal name: " + getName() + "\nAnimal species: " + getSpecies() + "\nAnimal sound: "
                + getSound() + "\nAnimal Limbs: " + getLimbs() + "\nAnimal habitat: " + getHabitat() + "\n");


    }
}
