package javaGame;

/**
 * Die Klasse Trader mit der Vaterklasse Character.
 *
 * @author Artur Sarkisjan 4571377 Gruppe 10b
 * @author Lukas Schulz 4571351 Gruppe 10b
 *
 * @version 1.0
 */
public class Trader extends Character {

    /**
     * Erstellt einen Haendler
     */
    public Trader() {
        super(100, 1, 1, 10000, 0.8);
        fillInventory();
    }
}
