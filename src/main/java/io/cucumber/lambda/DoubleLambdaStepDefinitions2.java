package io.cucumber.lambda;

import io.cucumber.lambda.StepDefinitionFunctionSupplier.C2A2;
import io.cucumber.lambda.StepDefinitionFunctionSupplier.StepDefinitionBody.A2;
import net.jodah.typetools.TypeResolver;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class DoubleLambdaStepDefinitions2<C1, C2> implements StepDefinitions {

    private final Class<C1> context1;
    private final Class<C2> context2;

    DoubleLambdaStepDefinitions2(Class<C1> context1, Class<C2> context2) {
        this.context1 = context1;
        this.context2 = context2;
    }

    public <P1, P2> DoubleLambdaStepDefinitions2<C1, C2> step(String expression, C2A2<C1, C2, P1, P2> body) {
        try {
            C1 instance1 = context1.getConstructor().newInstance();
            C2 instance2 = context2.getConstructor().newInstance();
            A2<P1, P2> stepDefinitionBody = body.accept(instance1, instance2);
            Class<?>[] rawArguments = TypeResolver.resolveRawArguments(A2.class, stepDefinitionBody.getClass());
            System.out.printf("%s %s%n", expression, Arrays.toString(rawArguments));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

}
