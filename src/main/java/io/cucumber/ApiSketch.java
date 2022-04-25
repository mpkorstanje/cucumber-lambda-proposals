package io.cucumber;

import io.cucumber.lambda.Glue;
import io.cucumber.lambda.StepDefinitions;
import io.cucumber.lambda.context.GherkinPatch;
import io.cucumber.lambda.context.World;
import io.cucumber.lambda.context.ZukiniPatch;

import static io.cucumber.lambda.StepDefinitions.using;
import static io.cucumber.lambda.StepDefinitions.with;

@SuppressWarnings("unused")
public class ApiSketch {

    /**
     * Advantages:
     * 1. Clear visual separation between context and step definition.
     * 2. Lambdas provide natural formatting breaks
     * 3. Allows method extraction.
     * 4. Kotlin equivalent can use "Function literals with receiver"
     * Disadvantages:
     * 1. Visually a bit verbose
     */
    @Glue
    public static StepDefinitions doubleLambda = using(World.class)
            .step("{int} gherkin(s) and {int} zukini(s)", (World world) -> (Integer gherkins, Integer zukinis) -> {
                world.setGherkins(gherkins);
                world.setZukinis(zukinis);
            });

    @Glue
    public static StepDefinitions doubleLambdaWithMethodReference = using(World.class)
            .step("{int} gherkin(s) and {int} zukini(s)", (World world) -> world::setGherkinsAndZukinis);

    /**
     * Advantages:
     * 1. Delays the need for dependency injection
     * 2. Would be different from Kotlin equivalent
     * Disadvantages:
     * 1. Visually a very verbose
     */
    @Glue
    public static StepDefinitions doubleLambdaWithMultiContexts = using(GherkinPatch.class, ZukiniPatch.class)
            .step("{int} gherkin(s) and {int} zukini(s)",
                    (GherkinPatch gherkinPatch, ZukiniPatch zukiniPatch) -> (Integer gherkins, Integer zukinis) -> {
                        gherkinPatch.setGherkins(gherkins);
                        zukiniPatch.setZukinis(zukinis);
                    });

    /**
     * Advantages:
     * 1. Visually short
     * Disadvantages:
     * 1. No separation between context and step definition function
     * 2. No method extraction
     */
    @Glue
    public static StepDefinitions singleLambda = with(World.class)
            .step("{int} gherkin(s) and {int} zukini(s)", (World world, Integer gherkins, Integer zukinis) -> {
                world.setGherkins(gherkins);
                world.setZukinis(zukinis);
            });

    @Glue
    public static StepDefinitions singleLambdaWithMultipleContext = with(GherkinPatch.class, ZukiniPatch.class)
            .step("{int} gherkin(s) and {int} zukini(s)",
                    (GherkinPatch gherkinPatch, ZukiniPatch zukiniPatch, Integer gherkins, Integer zukinis) -> {
                        gherkinPatch.setGherkins(gherkins);
                        zukiniPatch.setZukinis(zukinis);
                    });

}
