package com.Annotations;


// Program to explain Custom Annotations in Java with built-in meta-annotations

import java.lang.annotation.*;
import java.lang.reflect.Method;
// Defining a custom annotation with meta-annotations
@Documented // Ensures this annotation is included in the JavaDocs
@Target(ElementType.METHOD) // Specifies that this annotation can only be applied to methods
@Retention(RetentionPolicy.RUNTIME) // Specifies that this annotation is retained at runtime
@Inherited // Allows subclasses to inherit this annotation from the parent class
@interface CustomAnnotation {
    String value() default "Default Value"; // Default attribute for the annotation
    int priority() default 1; // Additional attribute to specify priority
}

// Superclass using the custom annotation
class ParentClass {
    @CustomAnnotation(value = "Parent Method", priority = 5)
    public void parentMethod() {
        System.out.println("ParentClass method with CustomAnnotation.");
    }
}

// Subclass inheriting the annotation
class ChildClass extends ParentClass {
    @Override
    public void parentMethod() {
        System.out.println("ChildClass overriding parentMethod.");
    }

    @CustomAnnotation(value = "Child Method", priority = 3)
    public void childMethod() {
        System.out.println("ChildClass method with CustomAnnotation.");
    }
}

// Main class to demonstrate custom annotation usage
public class CustomAnnotations {

    public static void main(String[] args) {
        // Instantiate ChildClass
        ChildClass child = new ChildClass();

        // Call methods to show behavior
        child.parentMethod();
        child.childMethod();

        // Use reflection to retrieve annotation details
        System.out.println("\nUsing reflection to access annotation details:");

        // Access all methods in ChildClass
for (Method method : ChildClass.class.getDeclaredMethods()) {         
            // Check if the method has the CustomAnnotation
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                // Retrieve the annotation
                CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Value: " + annotation.value());
                System.out.println("Priority: " + annotation.priority());
            }
        }
    }
}
