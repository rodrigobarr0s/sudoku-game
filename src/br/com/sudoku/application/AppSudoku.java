package br.com.sudoku.application;

import br.com.sudoku.ui.custom.screen.MainScreen;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class AppSudoku {

    public static void main(String[] args) {
        final var gameConfig = Stream.of(args)
                .collect(toMap(k -> k.split(";")[0], v -> v.split(";")[1]));
        var mainsScreen = new MainScreen(gameConfig);
        mainsScreen.buildMainScreen();
    }

}