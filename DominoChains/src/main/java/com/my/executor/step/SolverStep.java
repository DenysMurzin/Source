package com.my.executor.step;

import com.my.context.Context;
import com.my.context.ContextHolder;
import com.my.context.ContextImpl;
import com.my.model.Tile;
import com.my.solver.Solver;
import com.my.solver.SolverFactory;

import java.util.List;

import static com.my.context.ContextStepKey.SELECT_STEP;
import static com.my.context.ContextStepKey.SOLVER_STEP;

/**
 * @author Denys Murzin
 */
public class SolverStep implements Step {
    @Override
    public void perform(ContextHolder holder) {
        Context<List<Tile>> context = holder.get(SELECT_STEP);

        List<Tile> selectedTileSet = context.get();

        Solver solver = SolverFactory.getSolver();

        List<Tile> longestChain = solver.determineLongestChain(selectedTileSet);

        holder.put(SOLVER_STEP, new ContextImpl<>(longestChain));
    }
}
