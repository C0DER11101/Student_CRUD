package com.student.tokenizer;

public interface Tokenizer {
    default void parse(String command) {
    }
}