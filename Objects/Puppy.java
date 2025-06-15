public class Puppy{

    int puppyAge;

    public Puppy(String name){
        //This Constructor has one parameter, name
        System.out.println("Passed Name is:" + name);
    }

    public void setAge(){
        puppyAge = 2;
    }

    public int getAge(){
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
        //The following statement would create an object myPuppy
        Puppy myPuppy = new Puppy("tommy");

        // Call class method to set Puppy's age
        myPuppy.setAge();

        //Call another method to get puppy's age
        myPuppy.getAge();

        //Access Instance variable to view
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}