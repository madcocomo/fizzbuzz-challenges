# A journey to exercise TDD, unit test, and writting testable code

- Implement in Pair Programming
- Switch roles after each TDD cycle
- Create branch with your group name
- Push you code to unlock next challenge

### Scenario: Implement a Fizz Buzz game
#### Challenge 1
Write a short program that prints each number from 1 to 100, with delimiter `, `.

- For each multiple of 3, print "Fizz" instead of the number
- For each multiple of 5, print "Buzz" instead of the number 
- For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number

Sample output:
```
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, ...
```
etc up to 100


#### Challenge 2
Add a line wrap at every 14 characters.
Sample output:
```
1, 2, Fizz, 4,
 Buzz, Fizz, 7
, 8, Fizz, Buz
...
```


#### Challenge 3
Print the first 100 numbers from Fibonacci list with FizzBuzz rule and line breaks.
The Fibonacci list is:
```
    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
```
Sample output:
```
1, 1, 2, Fizz,
 Buzz, 8, 13, 
Fizz, 34, Buzz
...
```


#### Challenge 4
Accept command line argument `--fibonacci` to use Fibonacci list, otherwise use normal numbers.
At the same time support another arguments to indicate number range.
- `<command> 30` means print from 1 to 30
- `<command> 20 25` means print from 20 to 25 (include)
- `<command> --fibonacci 10 15` means print from 10th number in Fibonacci list to 15th (include)
- no argument means print form 1 to 100

