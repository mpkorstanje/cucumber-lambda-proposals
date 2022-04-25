package io.cucumber.lambda;

import io.cucumber.lambda.StepDefinitionFunctionSupplier.C2A2;
import io.cucumber.lambda.StepDefinitionFunctionSupplier.StepDefinitionBody.A2;
import io.cucumber.lambda.StepDefinitionFunctionSupplier.StepDefinitionBody.A4;
import net.jodah.typetools.TypeResolver;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class SingleLambdaStepDefinitions2<C1, C2> implements StepDefinitions {

    SingleLambdaStepDefinitions2(Class<C1> context1, Class<C2> context2) {
    }

    public <P1, P2> SingleLambdaStepDefinitions2<C1, C2> step(String expression, A4<C1, C2, P1, P2> body) {
        return this;
    }

}
