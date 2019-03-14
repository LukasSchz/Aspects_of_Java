package javaGame;

/**
 * Das Interface MazeGenerator.
 *
 * @author Artur Sarkisjan 4571377 Gruppe 10b
 * @author Lukas Schulz 4571351 Gruppe 10b
 *
 * @version 1.0
 */
public interface MazeGenerator {

    /**
     * The WALLCHAR.
     */
    char WALLCHAR = '#';
    /**
     * The FREECHAR.
     */
    char FREECHAR = '.';
    /**
     * The TRDECHAR.
     */
    char TRADECHAR = 'H';
    /**
     * The QUESTCHAR.
     */
    char QUESTCHAR = 'Q';
    /**
     * The STARTCHAR.
     */
    char STARTCHAR = 'S';
    /**
     * The BATTLECHAR.
     */
    char BATTLECHAR = 'B';
    /**
     * The SMITHYCHAR.
     */
    char SMITHYCHAR = 'T';
    /**
     * The WELLCHAR.
     */
    char WELLCHAR = 'O';
    /**
     * The GOALCHAR.
     */
    char GOALCHAR = 'Z';

    /**
     * Generate char [ ] [ ].
     *
     * @param height the height
     * @param width  the width
     *
     * @return the char [ ] [ ]
     */
    char[][] generate(int height, int width);
}
