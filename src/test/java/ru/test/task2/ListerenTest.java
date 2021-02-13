package ru.test.task2;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListerenTest implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        TestMethodInfo declaredAnnotation = testMethod.getDeclaredAnnotation(TestMethodInfo.class);
        System.out.println(declaredAnnotation.author());
        System.out.println(declaredAnnotation.priority());
        System.out.println(declaredAnnotation.lastModified());
    }
}
