# ExpressionParser
This application was build using TDD. 

TDD not just give us confidence to build an application but also it helps to evolve the design of application

Requirements
Using a programming / scripting language of your choice (example C#, Java, batch / shell / perl scripts), build an expression parser that looks at a piece of code and ensures that the code has balanced parentheses AND balanced square brackets.
 
Some example:

| Expression              | type       |
| ----------------------- | ---------- |
| `a*(([x + 2])[(y)])+2`  | Valid      |
| `b/((][x)`              | Not Valid  |
| `(5 + 2))(`             | Not Valid  |
| `([x +2]))y(z)-5`       | Not Valid  |
| `([x+2)`                | Not Valid  |


Deliverables :
a.     Write the code for this expression parser. This code takes the expression as an input and returns a boolean (true if the expression has balanced parentheses AND balanced square brackets, else false).
