You have been tasked with creating a simple fantasy battle simulation game in Java to demonstrate the concept of inheritance.

## The game should contain:

## A base class Creature with attributes:

name (String)

health (int)

attackPower (int)
And methods:

attack(Creature target) — reduces the target’s health

takeDamage(int amount) — reduces health and displays a message if defeated

displayInfo() — prints creature details

## A subclass Dragon that inherits from Creature and has:

An extra attribute firePower (int)

An overridden attack() method that adds fire damage

A roar() method unique to Dragon

## A subclass Phoenix that inherits from Creature and:

Can revive once after being defeated (override takeDamage() to handle this)

A MainGame class that:

Creates a Dragon and a Phoenix

Displays their details

Simulates a small battle using the above methods

## Requirements:

- Use method overriding where appropriate.

- Use the super keyword to call parent constructors and methods where necessary.

- All classes must be in the same package.

- Output should show the battle sequence and final stats of each creature.
