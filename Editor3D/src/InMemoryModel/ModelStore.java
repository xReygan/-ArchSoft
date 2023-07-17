package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<iModelChangedObserver> ChangeObservers;

    /**
     * конструктор
     * 
     * @param texture
     * @throws Exception
    */
    public ModelStore(List<iModelChangedObserver> changedObservers) throws Exception {
        this.ChangeObservers = changedObservers;
        
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    /**
     * Возвращает scene по ID
     * 
     * @param ID
     * @return
    */
    public Scene GetScene(int ID) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).ID == ID) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    /**
     * Регистрация изменений
     * @param sender
    */
    @Override
    public void NotifyChange(IModelChanger sendler) {

    }
}