# A journey to exercise TDD, unit test, and writting testable code

- Implement in Pair Programming
- Switch roles after each TDD cycle

### Git Cheat Sheet
Please don't commit code to the master branch. The exercise is supposed to be performed by groups in different branches.
- Create branch with your group name
    ```
    git branch <group_name>
    git push --set-upstream origin $(git_current_branch)
    ```
- Once you finished the challenge in README, Push code to unlock the next challenge
    ```
    git push
    ````
- If everything goes well, you well see the README be updated
    ```
    git pull
    ```


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

