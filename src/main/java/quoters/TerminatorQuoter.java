package quoters;

import javax.annotation.PostConstruct;

/**
 * Created by Serzh on 10/29/16.
 */
@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println("init() repeat = " + repeat);

    }

    public TerminatorQuoter() {
        System.out.println("Phase 1, constructor, repeat = " + repeat);
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
