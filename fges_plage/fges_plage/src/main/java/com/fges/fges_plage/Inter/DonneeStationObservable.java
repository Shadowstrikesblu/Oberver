package com.fges.fges_plage.Inter;

import com.fges.fges_plage.DonneeStation;

public interface DonneeStationObservable {
    public void enregistrerObservateur(DonneeStationObserver observateur);
    public void supprimerObservateur(DonneeStationObserver observateur);
    public void notifierObservateurs(DonneeStation donnee);
}
