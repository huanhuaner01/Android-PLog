package org.mym.plog.logger;

/**
 * An interface to customize logger.
 *
 * @author Muyangmin
 * @since 1.5.0
 */
public interface Logger {
    void v(String tag, String msg);
    void d(String tag, String msg);
    void i(String tag, String msg);
    void w(String tag, String msg);
    void e(String tag, String msg);
}
