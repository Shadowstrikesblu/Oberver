package com.fges.fges_plage;

import com.fges.fges_plage.Inter.DonneeStationObservable;
import com.fges.fges_plage.Inter.DonneeStationObserver;

import java.util.LinkedList;
import java.util.List;

public class DonneeStationObservableImpl implements DonneeStationObservable {

    List<DonneeStationObserver> observateurs = new LinkedList<>();

    @Override
    public void enregistrerObservateur(DonneeStationObserver observateur){
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(DonneeStationObserver observateur){
        observateurs.remove(observateur);
    }

    @Override
    public void notifierObservateurs(DonneeStation donnee){
        for(DonneeStationObserver observer : observateurs){
            observer.actualiser(donnee);
        }
    }
}
