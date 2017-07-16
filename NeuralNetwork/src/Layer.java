import java.util.ArrayList;

public class Layer extends Neuron {
    public static void main(String[] args) {

    }
    private ArrayList<Neuron>listofNeurons;
    private int numberOfNeuronsInLayer;

    public ArrayList<Neuron> getListofNeurons() {
        return listofNeurons;
    }

    public void setListofNeurons(ArrayList<Neuron> listofNeurons) {
        this.listofNeurons = listofNeurons;

    }

    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }

}
