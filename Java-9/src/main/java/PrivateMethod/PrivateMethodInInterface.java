package PrivateMethod;

public interface PrivateMethodInInterface {

    private String format(String level, String service, String msg) {
        return "[" + level.toUpperCase() + ": Currently processing in:" + service + ": "+ msg+"]";
    }

    default String info(String service, String msg) {
        return format("info", service, msg);
    }

    default String error(String service, String msg) {
        return format("error", service, msg);
    }

    default String debug(String service, String msg) {
        return format("debug", service, msg);
    }
}
