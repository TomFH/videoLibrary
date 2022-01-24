package app;

public class App {
    public static void exe(){

    }

    private static void displayMainMenu() {
        System.out.println("""
                ---------- Selection ----------
                1. films
                2. clients
                """
        );
    }

    private static void displayFilmMenu() {
        System.out.println("""
                ---------- Film Menu ----------
                1. search
                2. list
                3. add
                4. delete
                """
        );
    }
    private static void displayFilmMenu_setting() {
        System.out.println("""
                ---------- List of Films Menu ----------
                1. availability
                2. support
                3. all
                """
        );
    }

    private static void displayClientMenu() {
        System.out.println("""
                ---------- Client Menu ----------
                1. search
                2. list
                3. add
                4. delete
                """
        );
    }
}
