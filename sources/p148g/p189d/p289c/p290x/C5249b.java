package p148g.p189d.p289c.p290x;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g.d.c.x.b */
public @interface C5249b {
    boolean nullSafe() default true;

    Class<?> value();
}
