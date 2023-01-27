package p148g.p189d.p289c.p290x;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g.d.c.x.a */
public @interface C5248a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
