package io.cucumber.lambda;

import io.cucumber.lambda.StepDefinitionFunctionSupplier.C1A1;
import io.cucumber.lambda.StepDefinitionFunctionSupplier.C1A2;
import io.cucumber.lambda.StepDefinitionFunctionSupplier.StepDefinitionBody.A2;
import net.jodah.typetools.TypeResolver;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class DoubleLambdaStepDefinitions1<Context> implements StepDefinitions {

    private final Class<Context> context;

    public DoubleLambdaStepDefinitions1(Class<Context> context) {
        this.context = context;
    }

    public <P1> DoubleLambdaStepDefinitions1<Context> step(String expression, C1A1<Context, P1> body) {
        return this;
    }

    public <P1, P2> DoubleLambdaStepDefinitions1<Context> step(String expression, C1A2<Context, P1, P2> body) {
        return this;
    }

}
