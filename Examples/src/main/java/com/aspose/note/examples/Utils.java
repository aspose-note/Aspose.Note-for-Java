package com.aspose.note.examples;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;

public class Utils {

    private static final Logger LOGGER = Logger.getLogger(Utils.class.getName());

    /**
     * Get <code>Path</code> to <code>filename</code> located in data directory of @link{example} class.
     *
     * @param example  The example class
     * @param filename Desired file name
     */
    public static Path getPath(Class example, String filename)
            throws IOException {

        Path p = FileSystems.getDefault().getPath(System.getProperty("user.dir"), "src", "main", "resources");
        p = FileSystems.getDefault().getPath(p.toString(), example.getName().split("\\."));

        if (Files.notExists(p)) {
            Files.createDirectories(p);
        }

        if (filename != null) {
            p = FileSystems.getDefault().getPath(p.toString(), filename);
            LOGGER.info(String.format("Using file %s", p));
        } else {
            LOGGER.info(String.format("Using directory %s", p));
        }

        return p;
    }
    
    public static String getSharedDataDir(Class c) {
		File dir = new File(System.getProperty("user.dir"));
		dir = new File(dir, "src");
		dir = new File(dir, "main");
		dir = new File(dir, "resources");

		return dir.toString() + File.separator;
	}

}

