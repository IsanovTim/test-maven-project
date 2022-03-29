package com.tim_h;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j

public class Main {
    public static void main(String[] args) {
        PropertyConfigurator.configure("C:\\Users\\tim_h\\IdeaProjects\\test-maven-project\\log4j.properties");
        log.info("hello world!");
    }

}