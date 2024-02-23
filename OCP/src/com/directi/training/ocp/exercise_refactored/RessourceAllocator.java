package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Ressource res)
    {
        res.
    }

    public void free(ResourceType resourceType, int resourceId)
    {
        switch (resourceType) {
        case TIME_SLOT:
            markTimeSlotFree(resourceId);
            break;
        case SPACE_SLOT:
            markSpaceSlotFree(resourceId);
            break;
        default:
            System.out.println("ERROR: attempted to free invalid resource");
            break;
        }
    }
}
