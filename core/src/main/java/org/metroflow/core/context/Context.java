package org.metroflow.core.context;

/**
 * Created by zoupeng on 16/7/5.
 */
public class Context {
    private static final ThreadLocal<String> EXECUTE_MARK = new ThreadLocal<>();

    public static void setExecuteMark(String executeMark){
        EXECUTE_MARK.set(executeMark);
    }

    public static String getExecuteMark(){
        return EXECUTE_MARK.get();
    }

    public static void removeExecuteMark(){
        EXECUTE_MARK.remove();
    }

}
