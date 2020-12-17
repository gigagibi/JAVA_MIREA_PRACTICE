package PRAKTIKA27;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface WorkerAnnotation {
    String name();
}
