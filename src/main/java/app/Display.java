package app;

public class Display {
    public static void displayMainMenu() {
        System.out.println("""
                ---------- Selection ----------
                1. films
                2. clients
                """
        );
    }

    public static void displayFilmMenu() {
        System.out.println("""
                ---------- Film Menu ----------
                1. search
                2. list
                3. add
                """
        );
    }
    public static void displayFilmMenu_setting() {
        System.out.println("""
                ---------- List of Films Menu ----------
                1. available
                2. support
                3. all
                """
        );
    }

    public static void displayClientMenu() {
        System.out.println("""
                ---------- Client Menu ----------
                1. search
                2. list
                3. add
                """
        );
    }
}
