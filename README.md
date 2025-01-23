# Guess The Number Game

## Description
The **Guess the Number** game is a simple, console-based Java game where the computer generates a random number between 1 and 100. The player has 5 attempts to guess the number. The game provides feedback after each guess such as "You are very close!", "You are close!", or "You are far away!" based on how close the guess is to the correct number.

## Features
- Random number generation between 1 and 100.
- The player has 5 attempts to guess the correct number.
- Feedback on how close the guess is (very close, close, or far away).
- End of the game messages based on guesses (win/lose).

## Game Rules
1. The computer will randomly choose a number between 1 and 100.
2. The player must guess the number within 5 attempts.
3. After each guess, the game provides feedback based on the difference between the guess and the target number:
   - **"You are very close!"** if the guess is within 5 digits.
   - **"You are close!"** if the guess is within 10 digits.
   - **"You are far away!"** if the guess is outside these ranges.
4. The player wins if the guess is correct within the 5 attempts.
5. If the player exhausts all attempts without guessing correctly, the game will reveal the correct number.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
- This game is a simple Java-based console game designed for beginners to practice random number generation, control flow, and user interaction.
