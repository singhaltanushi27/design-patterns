package com.example.designpatterns.patterns;

//singleton pattern

//👉 For your Payment Service project, you already used LoggerService as a Singleton. Other practical additions could be:
//A ConfigService singleton for payment gateway keys.
// A ConnectionPoolManager singleton for database access.
public class LoggerService {

    private static LoggerService instance;

    private LoggerService() {
        // private constructor to prevent external instantiation
    }

    public static LoggerService getInstance() {
        if (instance == null) {
            instance = new LoggerService();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
