public class Animal
{
    private String name;
    private String species;
    private String sound;
    private String limbs;
    private String habitat;


    Animal()
    {

    }

    Animal(String name, String species)
    {
        this.name = name;
        this.species = species;

    }

    Animal(String name, String species,String sound)
    {
        this.name = name;
        this.species = species;
        this.sound =sound;

    }

    Animal(String name, String species,String sound,String limbs)
    {
        this.name = name;
        this.species = species;
        this.sound =sound;
        this.limbs = limbs;

    }

    Animal(String name, String species,String sound,String limbs, String habitat)
    {
        this.name = name;
        this.species = species;
        this.sound =sound;
        this.limbs = limbs;
        this.habitat = habitat;

    }

    void makeSound()
    {
        this.sound = sound;
        System.out.println("\nAnimals species sound is - " + getSound());

    }


    void display()
    {

        System.out.println("Animal name: " + getName() + "\nAnimal species: " + getSpecies() + "\nAnimal sound: "
                + getSound() + "\nAnimal Limbs: " + getLimbs() + "\nAnimal habitat: " + getHabitat() + "\n");


    }

    @Override
    public String toString() {
        return "Animal name: " + getName() + "\nAnimal species: " + getSpecies() + "\n";
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpecies(String species)
    {
        this.species = species;
    }

    public void setLimbs(String limbs)
    {
        this.limbs = limbs;
    }

    public String getLimbs()
    {
        return limbs;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public String getSound()
    {
        return sound;
    }

    public String getName()
    {
        return name;
    }

    public String getSpecies()
    {
        return species;
    }

    public void setSound(String sound)
{
    this.sound = sound;
}
}