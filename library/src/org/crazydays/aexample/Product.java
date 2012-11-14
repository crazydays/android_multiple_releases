package org.crazydays.aexample;


public final class Product
{
    private static boolean application;
    private static boolean free;

    public static boolean isApplication()
    {
        if (!isSet()) {
            set();
        }

        return application;
    }

    public static boolean isFree()
    {
        if (!isSet()) {
            set();
        }

        return free;
    }

    private static boolean isSet()
    {
        return application || free;
    }

    private static void set()
    {
        application = load("org.crazydays.aexample.application.R");
        free = load("org.crazydays.aexample.free.R");
    }

    private static boolean load(String clazz)
    {
        try {
            Class.forName(clazz);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
