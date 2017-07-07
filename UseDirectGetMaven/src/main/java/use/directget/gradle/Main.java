package use.directget.gradle;

import directget.get.Get;
import directget.get.Ref;
import directget.get.Run;

public class Main {
    
    public static final Ref<String> greetingMsg = Ref.of(String.class, ()->"Hello World!");
    
    public static void main(String[] args) {
        System.out.println(Get.the(greetingMsg));
        
        Run
        .with(greetingMsg.providedWith("Hey!"))
        .run(()->{
            System.out.println(Get.the(greetingMsg));
        });
    }
    
}
