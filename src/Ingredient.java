/**
 * Created by User on 4/19/2017.
 */
public class Ingredient {


    private boolean salty ,sweet,cookable ;
    private int cookingMinutes;

    public  String acceptableWith( Ingredient ing){


        if (salty){
        if(ing.salty){        return  "unacceptable";}
            else{return "neutral" ;}
        }
        else{
            return "acceptable";
        }
    }

    @Override
    public String toString() {
        String description=" I am an Ingredient  \n " +" salty :"+ this.salty +"\n sweety : " +this.sweet + "\n cooking minutes :"+this.cookingMinutes;


        return description;
    }

    public Ingredient(String taste) {

        tasting(taste);


    }
////////////////////////////////////////////////////
    public void tasting(String taste) {
        if (taste.equals("sweet")) {
            this.sweet = true;
            this.salty = false;
        }
        else if (taste.equals("salty")){
            this.sweet=false;
            this.salty=true;
        }
        else{
            System.out.println(" Error ...");
        }
    }
//////////////////////////////////////////////////////////
    public Ingredient() {    }


    public Ingredient(String taste,boolean cookable, int cookingMinutes) {
        if ((cookable) && ((cookingMinutes>=0) && (cookingMinutes <=120))){
            this.cookable = cookable;
            this.cookingMinutes = cookingMinutes;
        }
        else{
            this.cookable=false;
            this.cookingMinutes=500;
        }
        tasting(taste);

    }


    public void setCookable(boolean cookable) {
        this.cookable = cookable;
        if (cookable==false){
            this.cookingMinutes=-1;
        }
    }

    public boolean  setCookingMinutes(int cookingMinutes) {

        if(this.cookable){
            if((cookingMinutes>=0)&& (cookingMinutes<=120))
                this.cookingMinutes = cookingMinutes;
            return  true;

        }
        return false;


    }
}
