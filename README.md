# Return Ready Lab 10

* Part A - Foundations 4.1
* Part B - Foundations 4.2
* Part C - Instructor Challenge

## Part A

### Example and Activity 01

#### Step 01

In the package `lab10.part_a.examples` look at the file `Example01_TaxTotal` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab10.part_a.activity` complete the `Activity01_TaxTipTotal` per the following:

    Caculate what eight different people owe for a food bill after tax and tip
    Utilize 5% for tax and 15% for tip
    Below is what each person owes for their individual meal:

        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30

Your program is working correctly, if when run, the following is the output:
Note that the sample below only shows the first 2 people, please solve for all 8.
```
Person 1: 12.0
Person 2: 14.4
```

> Use Example01_Tax for reference.

### Example and Activity 02

#### Step 01

In the package `lab10.part_a.examples` look at the file `Example02_NoArgMethod` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab10.part_a.activity` complete the `Activity01_TipMethod` per the following:

    Create three variables with the public access modifiers: tax, tip, and original price
    Create a method which calculates the total due after tax / tip and then print out this value
    Go into the TipMethodMain class, and inside of the Main method, create a new instance of the class that has the 
    tip calculation method
    Using that new class instance, change the tip amount, and call the method (HINT: dot operator)

Your program is working correctly, if when run, the following is the output (using .10 as the updated tip):
Note that the sample below only shows the first person, please complete all 8.
```
11.5
```

> Use Example02_NoArgMethod for reference.

### Example and Activity 03

#### Step 01

In the package `lab10.part_a.examples` look at the file `Example03_ParameterizedMethod` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab10.part_a.activity` complete the `Activity03_FinalTip` per the following:

    Create a method called findTotal that accepts four parameters: name, tax, tip, original price
    The method should print out the name of the person, "owes $" and the final amount owed (see example below)
    Go into the FinalTipMain class, and inside of the Main method, create a new instance of the class that has the 
    tip calculation method
    Using new class instance, call the method we created and pass in the appropriate values to run it (HINT: dot operator)

Your program is working correctly, if when run, the following is the output:
```
Gio owes $50.4
Kaleb owes $63.0
Tariq owes $94.5
```
> Parameters used: 
> Gio, 6%, 20%, $40 |
> Kaleb, 6%, 20%, $50 |
> Tariq, 6%, 20%, $75
 
Note that the sample above only shows three people, please solve for all 8.

> Use Example03_ParameterizedMethod for reference.

## Part B

### Example and Activity 01

#### Step 01

In the package `lab15.part_b.examples` look at the file `Example01_ExplicitImport` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab15.part_b.activity` complete the `Activity01_ExplicitImport` per the following:

    Create a scanner that asks the user a question and stores it
    Once it runs properly, try deleting the import statement at the top - what happens?

Your program is working correctly, if when run, the following is the output:
```
Hello user, please enter your first name!
Gio
Using the scanner, I was able to store your name. I see your name is Gio
```

> Use Example01_ExplicitImport for reference.


### Example and Activity 02

#### Step 01

In the package `lab15.part_b.examples` look at the file `Example02_NonExplicitImport` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab15.part_b.activity` complete the `Activity02_NonExplicitImport` per the following:

    Utilizing the math random method, create a program that tells the user to throw a dice and informs them of the result
    Notice that there is not an import at the top of the program when invoking this method. Why?
    Keep running the program to ensure you get the number range you expect (HINT: There aren't 0's on dice)

Your program is working correctly, if when run, the following is the output:
```
Let's play some craps! Throw the dice!
You rolled a: 1
```

> Use Example02_ScannerUtility for reference.


## Part C