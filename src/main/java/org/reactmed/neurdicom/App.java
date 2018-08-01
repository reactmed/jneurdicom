package org.reactmed.neurdicom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("org.reactmed.neurdicom");
        ctx.start();
    }
}
