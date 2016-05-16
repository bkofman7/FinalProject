/*

TypeWarrior Planning notes

Ben Kofman
5-10-16

Window:
textfield on the bottom to enter commands
player health at bottom right corner
monster health at top right corner
monster picture at bottom left corner
dialog box at top left corner

Player class: 
Instance variables:
    -constant max health
    -health
    -mana
    -name
    -boolean isDead
Methods: 
    -constructor that takes a name, initializes health and mana to 500
    -takehit
    -useAbility1, 2, and 3
    -heal
    -getHealth
    -getMana
    -isDead

Player subclass: Warrior, Mage, Archer
instance variables:
    -type
    -

warrior abilities:
smite: deal 100 dmg cooldown 5 sec 50 mana 
heavy strike: deal 50 dmg cooldown 3 seconds 10 mana
light strike: deal 10 dmg no cooldown 

archer abilities: 
flaming arrow: deal 50 dmg cd 3 seconds 50 mana
shot deal 5 dmg no cd no mana cost no mana
super duper epic golden arrow: 200 dmg 20 sec cd 100 mana

mage:
stun: cd 10 seconds 50 mana
agitate: cd 5 seconds 50 mana
fireball: cd 1 second 15 dmg no mana



*/
