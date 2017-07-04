package DI_Provider;

import static java.lang.annotation.ElementType.CONSTRUCTOR;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/* A custom annotation, which annotates a constructor, to provide dependency injection*/

@Documented
@Retention(RUNTIME)
@Target({ FIELD, METHOD, CONSTRUCTOR })
public @interface DI_Provider {

}
