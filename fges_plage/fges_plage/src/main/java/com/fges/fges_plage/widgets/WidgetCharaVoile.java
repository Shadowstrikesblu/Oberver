package com.fges.fges_plage.widgets;

import com.fges.fges_plage.DonneeStation;

import java.io.PrintStream;

public class WidgetCharaVoile extends Widget{

    public WidgetCharaVoile(DonneeStation donneeInit) {
        super(donneeInit);
    }

    @Override
    public void afficher(PrintStream stream) {
        stream.println("Char à voile ");
        stream.println("========");
        if (super.derniereDonnee.getVent() >= 3) {
            stream.println("Char à voile autorisé");
        }
        else{
            stream.println("Char à voile interdit");
        }
    }
}
