package Layer_java;

import java.util.ArrayList;

public class NeuralNet extends OutputLayer{
    private InputLayer inputLayer;
    private HiddenLayer hiddenLayer;
    private ArrayList<HiddenLayer>listOfHiddenLayer;
    private OutputLayer outputLayer;
    private int numberOfHiddenLayers;
    public void initNet();
    public void printNet();
//    public class NeuralNetTest {
//        public static void main(String[] args) {
//            NeuralNet n = new NeuralNet();
//            n.initNet();
//            n.printNet();
//        }
//        public enum TrainingTypesENUM {
//            PERCEPTRONE,ADALINE;
//        }
//        public enum ActivationFncEnum {
//            STEP, lINEAR, SIGLOG, HIPERTAN;
//
///        }
//        private int epochs;
//        private double error;
//       / private double mse;
//        private double
//        calcNewWeight
//                (TrainingTypesENUM
//                         traintype,
//                 double inputWeightOld,Neuralnet n,
//                 double error, double TrainSample,
//                 double NetValue) {
//            switch (traintype){
//                case PERCEPTRONE:
//                    return inputWeightOld + getLearningRate()
//            }
//        }
//





    }
//}
