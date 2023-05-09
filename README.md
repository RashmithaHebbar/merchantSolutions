# merchantSolutions

I have made some design choices which would make the code look bigger but this would ultimately be helpful while adding more signals.
The design choice was to replace switch statement with polymorphism which makes us create new class for each new signal keeping most of the released code untouched.

Future work would be to change the design pattern of the code to some efficient design pattern like Factory method.

Also for the sake of simp;icity I have added SignalHandler and Algo libraraies to the same workspace. This could be done more nicely by importing custom libarary to springboot application.
