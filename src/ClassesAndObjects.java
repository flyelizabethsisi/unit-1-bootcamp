
public class ClassesAndObjects {

    public static void main(String args[]) {

        Cat garfield = new Cat();
        Cat pink_Panther = new Cat();
        Cat catwoman = new Cat();

        garfield.setFavoriteFood("Lasagna");
        pink_Panther.setFavoriteFood("Pizza");
        catwoman.setFavoriteFood("Ramen");
        catwoman.setName("Catwoman");
        garfield.setName("Garfield");
        pink_Panther.setName("Pink Panther");

        garfield.setAge(3);
        pink_Panther.setAge(4);
        catwoman.setAge(5);
        System.out.println(isOlder(catwoman, garfield));
        System.out.println(makeKitten(catwoman, garfield));

        makeBestFriends(catwoman,garfield);

        Person A = new Person();
        Person B = new Person();

        adoption(garfield, A);

        adoption(pink_Panther, B);
        System.out.println(isSibling(garfield,pink_Panther));
        isFree(catwoman);

    }

    public static boolean isOlder(Cat cat1, Cat cat2) {
        return cat1.getAge() > cat2.getAge();

    }

    public static void makeBestFriends(Cat cat1, Cat cat2) {
        cat1.setFavoriteFood(cat2.getFavoriteFood());

    }

    public static Cat makeKitten(Cat cat1, Cat cat2) {
        Cat newKitten = new Cat();
        String newKitty = cat1.getName() + cat2.getName();
        newKitten.setAge(0);
        newKitten.setName(newKitty);

        return newKitten;

    }


    public static void adoption(Cat cat1, Person person1){

        if(cat1.getName().equals("Catwoman")){
            cat1.setOwner(null);
            System.out.println("Catwoman will never be anyone's pet!");

        }else{
            cat1.setOwner(person1);
        }

    }
    public static boolean isFree(Cat cat){
        return cat.getOwner()==null;

    }

    public static boolean isSibling(Cat cat1, Cat cat2){
        return cat1.getOwner() == cat2.getOwner();

    }

}

