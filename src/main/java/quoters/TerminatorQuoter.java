package quoters;

import javax.annotation.PostConstruct;

/**
 * Created by Serzh on 10/29/16.
 */
@Profiling
@DeprecatedCalss(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println("init() repeat = " + repeat);
        System.out.println();
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1, constructor, repeat = " + repeat);
        System.out.println();
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("3 Phase");
        System.out.println();
        for (int i = 0; i < repeat; i++) {
        System.out.println("message = " + message);
        }
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }
}
