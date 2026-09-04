package com.student.ui;

import com.student.tokenizer.Validator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class UserInterface {

    @Autowired
    Validator validate;

    public void prompt() {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.print("~ ");

            String command = input.nextLine();

        }
    }
}