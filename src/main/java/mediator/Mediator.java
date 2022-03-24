package mediator;

import command.FlipperElement;
import elements.Bumper;
import elements.Ramp;
import elements.SlingShot;
import elements.Target;

import javax.swing.table.TableRowSorter;

public interface Mediator {

    void mediate(FlipperElement flipperElement);


}
