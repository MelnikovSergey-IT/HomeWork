package ru.test.task1;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class MethodInterception {
    @Test
    public void annotationValue() {
        MainPage mainPage = createPage(MainPage.class);
        assertNotNull(mainPage);
        assertEquals(mainPage.buttonSearch(), ".//*[@test-attr='button_search']");
        assertEquals(mainPage.textInputSearch(), ".//*[@test-attr='input_search']");
    }

    private void assertNotNull(MainPage mainPage) {
    }

    private void assertEquals(String buttonSearch, String s) {
    }

    private MainPage createPage(Class clazz) {
        ClassLoader classLoader = clazz.getClassLoader();
        MainPageInvocationHandler mainPageInvocationHandler = new MainPageInvocationHandler();
        return (MainPage) Proxy.newProxyInstance(classLoader, new Class[] {clazz}, mainPageInvocationHandler);
    }
}
