Programming Test
=============================
Set Up
---------------------
Clone or download this repository. Create project by importing build.gradle with IntelliJ

Problem 2 - Even Fibonacci numbers
---------------------
##### Sample of the Output
    Fibonacci even number sum: 4613732 
	Execution time in milli-second: 1
##### Why I chose this problem
    There are 2 reasons that I picked this problem to start my testing. 
    1. I had not heard of Project Euler before and wanted to start from 
        the basics and get familiar with the nature of the problem set first.
    2. Problem 25 is another Fibonacci problem: Maybe I can build on Problem 2.
##### Description of Process 
    Before I can find the even number, I need to create a Fibonacci sequence.
    f(n) = f(n-1) + f(n-2)
    First reaction is to use recursive, but it is slow.
    Basically the nth number is the sum of the previous 2 numbers. So, if I can keep track of the
    previous number and current number then sum them up to get the next number, I should be able 
    to use loop instead of recursive.
    
    At first, I chose type int and it is enough for problem 2. But it quickly overflows with Problem 25.
    So I changed to BigInteger.
##### Test Strategy
    If I can confirm my Fibonacci sequence generation is correct, the sum will be correct.
    Fibonacci number sequence are on-line.(https://planetmath.org/listoffibonaccinumbers) 
    It is easy to verify my functions with Assert.assertEquals()
Problem 25 - 1000-digit Fibonacci number
---------------------
##### Sample of the Output
	Fibonacci number: 1070066266382758936764980584457396885083683896632151665013235203375314520604694040621889147582489792657804694888177591957484336466672569959512996030461262748092482186144069433051234774442750273781753087579391666192149259186759553966422837148943113074699503439547001985432609723067290192870526447243726117715821825548491120525013201478612965931381792235559657452039506137551467837543229119602129934048260706175397706847068202895486902666185435124521900369480641357447470911707619766945691070098024393439617474103736912503231365532164773697023167755051595173518460579954919410967778373229665796581646513903488154256310184224190259846088000110186255550245493937113651657039447629584714548523425950428582425306083544435428212611008992863795048006894330309773217834864543113205765659868456288616808718693835297350643986297640660000723562917905207051164077614812491885830945940566688339109350944456576357666151619317753792891661581327159616877487983821820492520348473874384736771934512787029218636250627816
	# of digits: 1000
	Fibonacci index: 4782
	Execution time in milli-second: 277
##### Why I chose this problem
    To build on Problem 2
##### Description of Process 
    I googled on which Java data type can hold a 1000 digit number.
##### Test Strategy
    same as Problem 2
Problem 20 - Factorial digit sums
---------------------
##### Sample of the Output
	100!: 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
	sum of all digits: 648
	Execution time in milli-second: 1
##### Why I chose this problem
    There are 2 factorial problems: I may be able to build on top of this one.
    I found BigInteger when working on previous problem: I can use it for this one too.
##### Description of Process 
    I can use operator /= and % to find each digit, or I can transform each digit into char array then covert the char value to int.
    In this case I find it easier to read by using the existing Java library to transform the number -> String -> char array -> int value
##### Test Strategy
    Similar with Problem 2. If I can confirm my factorial calculation is correct, the sum will be correct.
    Used on-line factorial table to verify my calculation. (http://2000clicks.com/MathHelp/BasicFactorialTable.aspx)
Problem 34 - Digit factorials
---------------------
##### Sample of the Output
	145 = 120 + 24 + 1 + 
	40585 = 120 + 40320 + 120 + 1 + 24 + 
	Result: 40730
	Execution time in milli-second: 679
##### Why I chose this problem
    same as Problem 20
##### Description of Process 
    The problem for me is to find what is the upper bound of "all numbers" for this question.
    Found these 2 sites: 
    https://math.stackexchange.com/questions/620877/project-euler-34-find-a-mathematical-approach-for-upper-bound
    https://www.xarg.org/puzzle/project-euler/problem-34/
    Tried both 1499999 & 2177281 and got the same result
##### Test Strategy
    same as Problem 20    
Problem 19 - Counting Sundays
---------------------
##### Sample of the Output
	Result: 171
	Execution time in milli-second: 114
##### Why I chose this problem
    Try something different other than digits 
##### Description of Process 
    I need a function that can tell me what is the day of week of any given date.
    Find out what are available Java Date functions
##### Test Strategy
    Many on-line tools show the day of week of any given date.
    (https://www.timeanddate.com/date/weekday.html) is one of them. Use this data to verify my own function.
Time Spent on These Problems
---------------------
I lost track of time doing this exercise. It's really fun. I find the factorial number 145 & 40585 are really intriguing!
I spent most time on making this README file readable and going back to my programs to review 
if the code is clean, the flow is logical and self-explanatory, and the variables are descriptive.

