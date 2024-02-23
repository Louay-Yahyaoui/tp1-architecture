package com.directi.training.ocp.exercise_refactored;

public class Time extends Ressource
{
    @Override
    public void markBusy(){
        //MarkSpace Ressource Busy
    };
    
    @Override
    public void markFree()
    {   int ressourceId=findFreeSlot();
        //MarkSpace Ressource Free
    };

    private int findFreeSlot()
    {
        return 0;
    }
}
