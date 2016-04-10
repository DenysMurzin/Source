package com.my.executor;


import com.my.executor.step.GetInputNumberStep;
import com.my.executor.step.GetTileSetStep;
import com.my.executor.step.PrintListStep;
import com.my.executor.step.SelectStep;
import com.my.executor.step.ShuffleStep;
import com.my.executor.step.SolverStep;
import com.my.executor.step.Step;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Denys Murzin
 */
public class StepSetProvider {

    public List<Step> provideExecutorOrder() {
        List<Step> list = new ArrayList<>();
        list.add(new GetInputNumberStep());
        list.add(new GetTileSetStep());
        list.add(new ShuffleStep());
        list.add(new SelectStep());
        list.add(new PrintListStep());
        list.add(new SolverStep());
        list.add(new PrintListStep());
        return list;
    }
}
