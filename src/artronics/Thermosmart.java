package artronics;

/**
 * Created by jalal on 15/07/15.
 */
public class Thermosmart implements Device
{

    @Override
    public String getResourceManifest()
    {
        return null;
    }

    @Override
    public void SetValueApi(Api api)
    {
        Api api = new Api("Thermosmart --set");
    }
}
