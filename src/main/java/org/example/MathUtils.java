package org.example;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

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
        //String path = folder + "\\" + fileName;
        Path path = Paths.get(folder, fileName);
        logger.info("Checking path: {}", path);

        return path.toFile().exists();
    }
}

//check lan 2
