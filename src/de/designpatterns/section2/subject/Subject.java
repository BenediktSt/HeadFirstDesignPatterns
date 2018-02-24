package de.designpatterns.section2.subject;

import de.designpatterns.section2.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
