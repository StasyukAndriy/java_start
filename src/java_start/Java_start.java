
package java_start;

public class Java_start {
    
    public static void main(String[] args) {
        double a = 3.0d;
        double b = 3.89d;
        boolean yep = false;
        System.out.println("Sum is equal "+ (float)(a+b));
        String trial = "Trial";
        System.out.println(trial.length()+ " " + trial.toLowerCase());
        System.out.println(trial.indexOf('T')+ " " + trial.concat("Bimo"));
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);
        if(trial.contains("r")){
            yep = true;
            System.out.println(yep);
        } else{
            System.out.println("Sorry no!");
        }
        int i = 0;
        while(i<3){
            System.out.println(i);
            ++i;
        }
        String[] kakadoos = {"Hello", "my", "dear", "kakadoos"};
        for(String kakadoo: kakadoos){
           System.out.println(kakadoo);
        }
    }
    
}
