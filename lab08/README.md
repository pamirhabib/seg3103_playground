# Lab 08 - Mutation Testing

Starting the PIT Test Plugin:

HTML Report:

Explanation of Mutations:

- PrimitiveReturnsMutator (This mutator changes return values of methods to different primitive values):
  - Generated 4 mutations, all of which were killed by the test cases.
- MathMutator(This mutator modifies mathematical operations, such as changing addition to subtraction):
  - Generated 4 mutations, all of which were killed by the test cases.

The report confirms 100% mutation coverage and test strength, meaning that all applied mutations were detected by the test suite.

Killed Mutants:
A mutant is considered killed if the tests fail when the mutated code is executed. This means that the test cases are effective in detecting changes in the code.

