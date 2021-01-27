package model;

import java.util.Objects;

public class GoogleCloud {

    private String numberOfInstances;
    private String series;
    private String machineType;
    private String numberOfGPUs;
    private String GPUType;
    private String localSSD;
    private String datacenterLocation;

    public GoogleCloud(String numberOfInstances, String series, String machineType, String numberOfGPUs, String GPUType, String localSSD, String datacenterLocation){
        this.numberOfInstances = numberOfInstances;
        this.series = series;
        this.machineType = machineType;
        this.numberOfInstances = numberOfInstances;
        this.numberOfGPUs = numberOfGPUs;
        this.GPUType = GPUType;
        this.localSSD = localSSD;
        this.datacenterLocation = datacenterLocation;
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public void setNumberOfInstances(String numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public void setNumberOfGPUs(String numberOfGPUs) {
        this.numberOfGPUs = numberOfGPUs;
    }

    public String getGPUType() {
        return GPUType;
    }

    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public void setDatacenterLocation(String datacenterLocation) {
        this.datacenterLocation = datacenterLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoogleCloud that = (GoogleCloud) o;
        return Objects.equals(numberOfInstances, that.numberOfInstances) &&
                Objects.equals(series, that.series) &&
                Objects.equals(machineType, that.machineType) &&
                Objects.equals(numberOfGPUs, that.numberOfGPUs) &&
                Objects.equals(GPUType, that.GPUType) &&
                Objects.equals(localSSD, that.localSSD) &&
                Objects.equals(datacenterLocation, that.datacenterLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfInstances, series, machineType, numberOfGPUs, GPUType, localSSD, datacenterLocation);
    }

    @Override
    public String toString() {
        return "GoogleCloud{" +
                "numberOfInstances='" + numberOfInstances + '\'' +
                ", series='" + series + '\'' +
                ", machineType='" + machineType + '\'' +
                ", numberOfGPUs='" + numberOfGPUs + '\'' +
                ", GPUType='" + GPUType + '\'' +
                ", localSSD='" + localSSD + '\'' +
                ", datacenterLocation='" + datacenterLocation + '\'' +
                '}';
    }
}
