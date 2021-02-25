package com.alpha.company;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileAndDirectoryInfo1Test {

    @Test
    void ifFileExistMethod() {
        Path path = Paths.get("/home");
        assertTrue(Files.exists(path));
    }

    @Test
    void getFileNameMethod() {
        Path path = Paths.get("/home");
        assertNotNull(path.getFileName());
    }

    @Test
    void FilesIsDirectoryMethod() {
        Path path = Paths.get("/home");
        assertTrue(Files.isDirectory(path));
    }

}