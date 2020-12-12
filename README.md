# calculator
This is a project based on JAVA and Antrl4

/*****    requirement   *******/

Hi Sherry, 

Can you do the following small project at home?

First, study Antlr http://www.antlr.org/

and use the following grammer 
https://github.com/antlr/grammars-v4/tree/master/calculator
generate java code and provide a calculator?

When I run your program, it will enter a shell (using jlines https://github.com/jline/jline3)

Calculator>

Then, I can input any any math expression and press enter, it will call the compiler, and generate java code, and then yields the result in the shell.

Please try it and after you finish, please get back to me. 

/*********************************/



Recently I did this small project which is to write a calculator based on Antrl4 calculator.g4. This project is done in almost 2 days including understanding the grammer of Antrl4 and wrote the code. It is so simple and does not meet the requirement of the person who gave me this project. But when I read his email, I did not realize he has other requirements. I think I did it well, but he is not satisfied like what I wrote is all shit. I still can feel the happiness when I finished this thing. 

It is almost all writen without any compiler just use a txt file. It is funny that when I learned how to wrote JAVA code several years ago, I even do not know any compiler like Eclipse because my mentor at that time was writing JAVA code using txt file. And I learned all JAVA things on Windows system using txt file. So I still can feel the happiness when I finished this project which is shit.

This small project has no semantic check. It can just accept valid input of an expression. And it is implemented using Antrl4 Visitor which I realized is not efficient at all. So I did another project using Antrl4 Listener and added some semantic checks.

And also, use maven to build the code and use JLine to show the result. 


Use the following command to run the project

mvn compile

mvn exec:java -Dexec.mainClass="chen.calc.App"
