package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Utility class for mathematical operations and file checks.
 */
public final class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    // Private constructor to prevent instantiation of utility class
    private MathUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Returns the maximum of two integers.
     *
     * @param a first integer
     * @param b second integer
     * @return the larger of a and b
     */
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    /**
     * Divides two integers.
     *
     * @param a numerator
     * @param b denominator
     * @return result of division
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }

    /**
     * Checks if a file exists.
     *
     * @param folder the folder path
     * @param fileName the file name
     * @return true if exists
     */
    public static boolean checkFileExists(String folder, String fileName) {
        Path path = Paths.get(folder, fileName);
        logger.info("Checking path: {}", path);
        return path.toFile().exists();
    }
}