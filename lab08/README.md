# Lab 08 - Mutation Testing

Starting the PIT Test Plugin:
<img width="1467" alt="Screenshot 2024-07-18 at 6 32 24 PM" src="https://github.com/user-attachments/assets/c77db410-3ee8-47fb-8acf-0df52211d3ae">

HTML Report:
<img width="811" alt="Screenshot 2024-07-18 at 6 46 53 PM" src="https://github.com/user-attachments/assets/949c465d-918c-4629-aff8-500d8485463f">
<img width="795" alt="Screenshot 2024-07-18 at 6 54 52 PM" src="https://github.com/user-attachments/assets/e3652064-5d17-4067-81e0-b56f8654cece">

Explanation of Mutations:

- PrimitiveReturnsMutator (This mutator changes return values of methods to different primitive values):
  - Generated 4 mutations, all of which were killed by the test cases.
- MathMutator(This mutator modifies mathematical operations, like changing addition to subtraction):
  - Generated 4 mutations, all of which were killed by the test cases.

The report confirms 100% mutation coverage and test strength, meaning that all applied mutations were detected by the test suite.

Killed Mutants:
A mutant is considered killed if the tests fail when the mutated code is executed. This means that the test cases are effective in detecting changes in the code.

