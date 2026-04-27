package org.example;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a/b;
    }

    public static boolean checkFileExists(String folder, String fileName) {
        String path = folder + "\\" + fileName;
        logger.info("Checking path: {}", path);

        File file = new File(path);
        return file.exists();
    }
}
