public class Main {

    public static void main(String[] args) {

        Ingredient ingred=new Ingredient();

        System.out.println(ingred.toString());

        System.out.println(ingred.acceptableWith(ingred));


        Ingredient ingred2=new Ingredient("salty");
        System.out.println(ingred2.toString());

        System.out.println(ingred2.acceptableWith(ingred));

        System.out.println(".....................................................(b)\n");

        Ingredient ingred3=new Ingredient("sweet",true,80);

        System.out.println(ingred3.toString());

        System.out.println(ingred3.acceptableWith(ingred));

        System.out.println(".....................................................(c)\n");

        Ingredient ingred4=new Ingredient("sweet",true,80);
      // boolean flag=ingred4.setCookingMinutes(100);
        ingred4.setCookingMinutes(100);
        System.out.println(ingred4.toString());

        System.out.println(ingred4.acceptableWith(ingred));


    }
}
