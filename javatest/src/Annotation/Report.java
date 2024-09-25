package src.Annotation;

public @interface Report {
    int type() default  0;
    String value() default "";
    String level() default "info";
}
