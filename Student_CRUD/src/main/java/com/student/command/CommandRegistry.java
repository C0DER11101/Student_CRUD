package com.student.command;

import java.util.HashMap;
import java.util.Map;

public abstract class CommandRegistry {

    public static final Map<String, String> COMMANDS = Map.of("help", "help",
            "add", "add student",
            "findAll", "find all",
            "find", "find",
            "fetch", "fetch field in");
}