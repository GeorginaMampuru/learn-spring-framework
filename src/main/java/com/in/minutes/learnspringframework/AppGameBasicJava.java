package com.in.minutes.learnspringframework;

//import org.springframework.boot.SpringApplication;

public class AppGameBasicJava {



        public static void main(String[] args) {

            var game = new MarioGame();
//           var game = new SuperContraGame();

            var gameRunner = new GameRunner(game);
            gameRunner.run();
        }

    }

