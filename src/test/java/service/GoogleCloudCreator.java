package service;

import model.GoogleCloud;

public class GoogleCloudCreator {
   public static final String NumberOfInstances = "4";
    public static final String Series="N1";
    public static final String MachineType="n1-standard-8";
    public static final String NumberOfGPUs="1";
    public static final String GPUType="NVIDIA Tesla V100";
    public static final String LocalSSD="2x375 GB";
    public static final String DatacenterLocation="Frankfurt";
    /*public static final String NumberOfInstances = "testdata.cloud.NumberOfInstances";
    public static final String Series="testdata.cloud.Series";
    public static final String MachineType="testdata.cloud.MachineType";
    public static final String NumberOfGPUs="testdata.cloud.NumberOfGPUs";
    public static final String GPUType="testdata.cloud.GPUType";
    public static final String LocalSSD="testdata.cloud.LocalSSD";
    public static final String DatacenterLocation="testdata.cloud.DatacenterLocation";*/


    public static GoogleCloud withAllCOrrectDatas(){
        return new GoogleCloud(NumberOfInstances, Series, MachineType, NumberOfGPUs, GPUType, LocalSSD, DatacenterLocation);
    }

    public static GoogleCloud withEmptyMachineType(){
        return new GoogleCloud(NumberOfInstances, Series, "", NumberOfGPUs, GPUType, LocalSSD, DatacenterLocation);
    }
}
