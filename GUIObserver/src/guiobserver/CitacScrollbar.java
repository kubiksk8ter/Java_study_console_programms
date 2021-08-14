/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobserver;

import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author kuba
 */
public class CitacScrollbar extends Scrollbar implements Observer {
    CitacScrollbarObserver o;

    public CitacScrollbar(int hodnota, int min, int max) {
        super(Scrollbar.HORIZONTAL, hodnota, 0, min, max);
        o = new CitacScrollbarObserver();
        this.addAdjustmentListener(o);
    }

    @Override
    public void update(Observable o, Object arg) {
        int pozice = ((Integer) arg).intValue();
        this.setValue(pozice);
    }
    
    public class CitacScrollbarObserver extends Observable 
            implements AdjustmentListener {
    
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int pozice = CitacScrollbar.this.getValue();
        setChanged();
        notifyObservers(pozice);
        }    
    }
}
