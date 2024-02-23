package com.directi.training.ocp.exercise_refactored;

public class Time extends Ressource
{
    @Override
    public void markBusy(){
        int ressourceId=findFreeSlot();
        //MarkTime Ressource Busy
    };

    @Override
    public void markFree()
    {
        //MarkTime Ressource Free
    };
    
}
