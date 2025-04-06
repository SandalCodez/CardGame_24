# 24 Card Game

A JavaFX implementation of the classic 24 Game where players use basic arithmetic operations to make four card values equal 24.

## Overview

In this game, players are presented with four randomly selected playing cards and must use addition, subtraction, multiplication, and division to create a mathematical expression that equals 24 using each card exactly once. For example, if given cards with values 3, 8, 8, and 3, a valid solution might be: `(8 / (3 - (8 / 3))) = 24`.

![Game Screenshot](screenshots/card24ScreenShot.png)

## Features

- JavaFX-based graphical user interface
- Random card generation with standard playing card images
- Ability to verify user solutions
- Built-in solution finder algorithm
- Hint system that progressively reveals solution pattern
- Optional OpenAI API integration for alternative hint generation

## Dependencies

- Java 11 or higher
- JavaFX
- [exp4j library](https://www.objecthunter.net/exp4j/) for expression evaluation
- [SimpleOpenAI](https://github.com/sashirestela/simple-openai) (optional, for API integration)

## Installation

1. Clone this repository:
   ```
   git clone https://github.com/yourusername/24-card-game.git
   ```

2. Build the project using Maven:
   ```
   mvn clean install
   ```

3. If you want to use the OpenAI API integration:
    - Set the environment variable `OPENAI_API_KEY` with your API key
    - Uncomment the relevant code in `GameController.java`

## How to Play

1. Launch the application
2. Four random cards will be displayed
3. Enter your mathematical expression in the text field using the numbers corresponding to the card values
4. Click "Verify" to check if your solution is correct
5. Use "Hint" for help (after several attempts, the pattern of operators will be revealed)
6. Click "Refresh" to get a new set of cards

## Game Rules

- You must use each card exactly once
- You can use only addition, subtraction, multiplication, and division
- You can use parentheses to change the order of operations
- Each card value must be used as is (e.g., a King is 13, not 10+3)

## Project Structure

- `GameController.java`: Main controller handling UI events and game logic
- `randomCard.java`: Generates random cards from the deck
- `CardValue.java`: Converts card images to numerical values
- `Solution.java`: Algorithm to verify and find 24 Game solutions
- `Api.java`: Optional OpenAI API integration for hint generation

## Future Enhancements

- Score tracking system
- Difficulty levels
- Timed mode
- Multiplayer support

## Acknowledgments

- Inspired by the classic 24 Game