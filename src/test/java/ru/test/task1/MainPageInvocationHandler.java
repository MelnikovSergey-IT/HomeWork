package ru.test.task1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MainPageInvocationHandler implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Selector annotation = method.getAnnotation(Selector.class);
        String xpath = annotation.xpath();
        return xpath;
    }
}
