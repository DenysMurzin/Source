package com.my.solver;
/**
 * @author Denys Murzin
 */
public class SolverFactory {
    public static Solver getSolver(){
        return new BacktrackingSolver();
    }
}
