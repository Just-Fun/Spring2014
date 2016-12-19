package quoters;

import javax.annotation.PostConstruct;

/**
 * Created by Serzh on 10/29/16.
 */
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    int repeat;
    
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);

    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
        System.out.println("message = " + message);
        }
    }
}
