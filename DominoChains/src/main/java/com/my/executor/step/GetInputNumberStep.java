package com.my.executor.step;

import com.my.context.ContextHolder;
import com.my.context.ContextImpl;

import java.util.Scanner;

import static com.my.context.ContextStepKey.INPUT_NUMBER_STEP;
import static com.my.executor.step.MessageForStepMap.getMessageForStep;

/**
 * @author Denys Murzin
 */
public class GetInputNumberStep implements Step {
    @Override
    public void perform(ContextHolder holder) {
        System.out.println(getMessageForStep(INPUT_NUMBER_STEP));

        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        holder.put(INPUT_NUMBER_STEP, new ContextImpl<>(inputNumber));
    }
}
