package quoters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Sergey on 12/23/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedCalss {
    Class newImpl();
}
