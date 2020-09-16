import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
/**
 * Sets the size of the world and creates the students
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.

        super(10, 6, 130);

        prepare(2);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

    public void prepare(int currentPeriod)
    {
        removeObjects(getObjects(null));
        ToggleBtn button = new ToggleBtn();
        addObject(button, 5, 1);
        
        if(currentPeriod == 2)
        {

            OlegBychenkov olegbychenkov = new OlegBychenkov("Oleg", "Bychenkov", 1, 2);
            addObject(olegbychenkov, 1, 2);
            olegbychenkov.sitDown();

            ShriyaRudrashetty shriyarudrashetty = new ShriyaRudrashetty("Shriya", "Rudrashetty", 1, 3);
            addObject(shriyarudrashetty, 1, 3);
            shriyarudrashetty.sitDown();

            ShaanMathur shaanmathur = new ShaanMathur("Shaan", "Mathur", 2, 1);
            addObject(shaanmathur, 2, 1);
            shaanmathur.sitDown();

            ShreyaChandra shreyachandra = new ShreyaChandra("Shreya", "Chandra", 2, 5);
            addObject(shreyachandra, 2, 5);
            shreyachandra.sitDown();
        }
        if(currentPeriod == 3)
        {
            TameemSaydi tameemsaydi = new TameemSaydi("Tameem", "Saydi", 2, 7);
            addObject(tameemsaydi, 2, 7);
            tameemsaydi.sitDown();

            MarkOwenMacasaet markowenmacasaet = new MarkOwenMacasaet("MarkOwen", "Macasaet", 3, 1);
            addObject(markowenmacasaet, 3, 1);
            markowenmacasaet.sitDown();

            RohanGovindarajan rohangovindarajan = new RohanGovindarajan("rohan", "govindarajan", 3, 2);
            addObject(rohangovindarajan, 3, 2);
            rohangovindarajan.sitDown();
        }

    }
}
