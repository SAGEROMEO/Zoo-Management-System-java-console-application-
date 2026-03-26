import java.util.*;

public class Main
{
    public static void main(String[] args) throws InvalidMenuOptionException
    {
        Scanner scan = new Scanner(System.in);

        Animal animal1 = new Animal("Duke", "Hyena");

        ArrayList<Animal> Animals = new ArrayList<>();
        Animals.add(animal1);

        int size = 1;

        int count = 0;

        System.out.println("\nWelcome to the Zoo Management System.");

        int menuNumber = 0;

        while(menuNumber != 4)              //menu of the system.
        {
            try
            {
                System.out.println("\n1. View Animals.");
                System.out.println("2. Add Animal.");
                System.out.println("3. Search Animal.");
                System.out.println("4. Exit.\n");
                System.out.print("Select an option: ");
                menuNumber = scan.nextInt();

                validateMenuOpt(menuNumber);

            }
            catch (InvalidMenuOptionException imoe)
            {
                System.out.println("Invalid input. Please try again.");
            }


            switch (menuNumber)
            {
                case 1:
                    //viewing animals
                    System.out.println("\nAnimal List");
                    System.out.println("\n-----------\n");

                    for (Animal animal : Animals)
                    {
                        System.out.println(animal);
                        size++; //to count number of animals
                    }

                    break;

                case 2:
                    scan.nextLine(); //clearing anything in input

                    System.out. println("Enter animals name: ");
                    String name = scan.nextLine();

                    System.out.println("Enter animals species: ");
                    String species = scan.nextLine();

                    Animal animal= new Animal(name, species);
                    Animals.add(animal);

                    System.out.println("Animal added successfully!");
                    break;

                case 3:
                    scan.nextLine();
                    System.out.print("\nEnter name to search: ");
                    String searchName = scan.nextLine().trim();
                    boolean found = false;

                    for(Animal ani : Animals)
                    {
                        if (ani.getName().equalsIgnoreCase(searchName)) {
                            //ani.display();
                            found = true;

                            if(ani.getSpecies().equalsIgnoreCase("bird"))
                            {
                                Bird bird = new Bird(ani.getName(), ani.getSpecies());
                                bird.display();
                            }
                            else if(ani.getSpecies().equalsIgnoreCase("fish"))
                            {
                                Fish fish = new Fish(ani.getName(), ani.getSpecies());
                                fish.display();
                            } else if (ani.getSpecies().equalsIgnoreCase("lion"))
                            {
                                Lion lion = new Lion(ani.getName(), ani.getSpecies());
                                lion.display();
                            }
                            else if(ani.getSpecies().equalsIgnoreCase("elephant"))
                            {
                                Elephant elephant = new Elephant(ani.getName(), ani.getSpecies());
                                elephant.display();
                            }
                            else
                            {
                                Hyena hyena = new Hyena(ani.getName(), ani.getSpecies());
                                hyena.display();
                            }
                        }
                    }

                    if(!found)
                    {
                        System.out.println("\nAnimal not found.");
                    }

                    break;

                case 4:
                    System.out.println("\nExiting... ... ...Done!");

                    break;

                default:
                    System.out.println("\nEnter option between 1 - 4");
            }
        }

        scan.close();


    }

    private static void validateMenuOpt(int menuOpt) throws InvalidMenuOptionException
    {
        if(menuOpt < 0 || menuOpt > 4)
        {
            throw new InvalidMenuOptionException("Invalid menu option.");
        }
        else if(Character.isLetter(menuOpt))
        {
            throw new InvalidMenuOptionException("Invalid menu option, enter valid menu number.");
        }
    }
}