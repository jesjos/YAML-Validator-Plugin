package at.zierler.gradle;

import org.gradle.api.logging.LogLevel;
import org.gradle.api.logging.Logger;

class NullLogger extends org.slf4j.helpers.NOPLogger implements Logger {

    static NullLogger NULL_LOGGER = new NullLogger();

    private NullLogger() {}

    @Override
    public boolean isLifecycleEnabled() {
        return false;
    }

    @Override
    public void lifecycle(String message) {

    }

    @Override
    public void lifecycle(String message, Object... objects) {

    }

    @Override
    public void lifecycle(String message, Throwable throwable) {

    }

    @Override
    public boolean isQuietEnabled() {
        return false;
    }

    @Override
    public void quiet(String message) {

    }

    @Override
    public void quiet(String message, Object... objects) {

    }

    @Override
    public void quiet(String message, Throwable throwable) {

    }

    @Override
    public boolean isEnabled(LogLevel level) {
        return false;
    }

    @Override
    public void log(LogLevel level, String message) {

    }

    @Override
    public void log(LogLevel level, String message, Object... objects) {

    }

    @Override
    public void log(LogLevel level, String message, Throwable throwable) {

    }
}
