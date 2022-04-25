package io.cucumber.lambda;

public interface StepDefinitions {
    static <T> DoubleLambdaStepDefinitions1<T> using(Class<T> context) {
        return new DoubleLambdaStepDefinitions1<>(context);
    }

    static <T1, T2> DoubleLambdaStepDefinitions2<T1, T2> using(Class<T1> context1, Class<T2> context2) {
        return new DoubleLambdaStepDefinitions2<>(context1, context2);
    }

    static <T> SingleLambdaStepDefinitions1<T> with(Class<T> context) {
        return new SingleLambdaStepDefinitions1<>(context);
    }
    static <T1, T2> SingleLambdaStepDefinitions2<T1, T2> with(Class<T1> context1, Class<T2> context2 ) {
        return new SingleLambdaStepDefinitions2<>(context1, context2);
    }

}
