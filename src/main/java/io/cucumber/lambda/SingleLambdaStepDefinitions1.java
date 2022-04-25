package io.cucumber.lambda;

import io.cucumber.lambda.StepDefinitionFunctionSupplier.C1A2;
import io.cucumber.lambda.StepDefinitionFunctionSupplier.StepDefinitionBody.A2;
import io.cucumber.lambda.StepDefinitionFunctionSupplier.StepDefinitionBody.A3;
import net.jodah.typetools.TypeResolver;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class SingleLambdaStepDefinitions1<Context> implements StepDefinitions {


    public SingleLambdaStepDefinitions1(Class<Context> context) {
    }

    public <P1, P2> SingleLambdaStepDefinitions1<Context> step(String expression, A3<Context, P1, P2> body) {
        return this;
    }



}
