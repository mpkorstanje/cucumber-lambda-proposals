package io.cucumber.lambda;

public interface StepDefinitionFunctionSupplier {

    @FunctionalInterface
    interface C0A0 extends StepDefinitionFunctionSupplier {
        StepDefinitionBody.A0 accept();

    }

    @FunctionalInterface
    interface C1A0<C1> extends StepDefinitionFunctionSupplier {
        StepDefinitionBody.A0 accept(C1 c1);

    }

    @FunctionalInterface
    interface C1A1<C1, A1> extends StepDefinitionFunctionSupplier {
        StepDefinitionBody.A1<A1> accept(C1 c1);

    }

    @FunctionalInterface
    interface C1A2<C1, A1, A2> extends StepDefinitionFunctionSupplier {
        StepDefinitionBody.A2<A1, A2> accept(C1 c1);

    }
    @FunctionalInterface
    interface C2A0<C1, C2> extends StepDefinitionFunctionSupplier {
        StepDefinitionBody.A0 accept(C1 c1, C2 c2);

    }

    @FunctionalInterface
    interface C2A1<C1, C2, A1> extends StepDefinitionFunctionSupplier {
        StepDefinitionBody.A1<A1> accept(C1 c1, C2 c2);

    }

    @FunctionalInterface
    interface C2A2<C1, C2, A1, A2> extends StepDefinitionFunctionSupplier {
        StepDefinitionBody.A2<A1, A2> accept(C1 c1, C2 c2);

    }

    interface StepDefinitionBody {

        @FunctionalInterface
        interface A0 extends StepDefinitionBody {
            void accept() throws Throwable;

        }

        @FunctionalInterface
        interface A1<T1> extends StepDefinitionBody {
            void accept(T1 p1) throws Throwable;

        }

        @FunctionalInterface
        interface A2<T1, T2> extends StepDefinitionBody {
            void accept(T1 p1, T2 p2) throws Throwable;

        }

        @FunctionalInterface
        interface A3<T1, T2, T3> extends StepDefinitionBody {
            void accept(T1 p1, T2 p2, T3 p3) throws Throwable;

        }

        @FunctionalInterface
        interface A4<T1, T2, T3, T4> extends StepDefinitionBody {
            void accept(T1 p1, T2 p2, T3 p3, T4 p4) throws Throwable;

        }

    }

}
