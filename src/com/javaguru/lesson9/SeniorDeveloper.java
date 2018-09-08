package com.javaguru.lesson9;

class SeniorDeveloper extends MiddleDeveloper {

    public void solveProblem() {
        System.out.println("Solve problem");
    }

    @Override
    public void learn() {
        System.out.println("SUPER FAST LEARNING...");
    }
}
