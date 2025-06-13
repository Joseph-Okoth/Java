/*Her age (Local Variable) is defined inside pupAge() method 
and it scope is only limited to this method*/

public class Test{
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is :" + age);
    }
    public static void main(String args[]){
        Test test = new Test();
        test.pupAge();
    }
}