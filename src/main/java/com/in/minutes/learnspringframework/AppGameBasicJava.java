package com.in.minutes.learnspringframework;

import org.springframework.boot.SpringApplication;

public class AppGameBasicJava {



        public static void main(String[] args) {

            var marioGame = new MarioGame();
            var gameRunner = new GameRunner(marioGame);
            gameRunner.run();
        }

    }

