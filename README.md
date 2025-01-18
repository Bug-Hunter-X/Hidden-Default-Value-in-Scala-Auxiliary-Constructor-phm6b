# Hidden Default Value in Scala Auxiliary Constructor

This repository demonstrates a subtle bug that can arise from using auxiliary constructors in Scala.  While seemingly harmless, improper handling of default values can lead to unexpected behavior and hidden errors.

The `bug.scala` file contains the problematic code, showcasing how a default value in an auxiliary constructor can create situations where the class's logic relies on an assumption about the initial value. This can be especially dangerous if the program's correctness depends on the value not being the default. 

The `bugSolution.scala` offers a solution, demonstrating how to handle the situation. Either always provide a value to `x` during the object creation, or ensure the class logic doesn't implicitly rely on any default values for correct functionality.