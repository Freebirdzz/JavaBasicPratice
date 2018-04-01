package com.shangxuefeng.json;

public class PositionDriver {
    private String companyId;
    private String vehicleNo;
    private String licenseId;
    private String startPlace;
    private String destPlace;

    public PositionDriver(String companyId, String vehicleNo, String licenseId, String startPlace, String destPlace) {
        this.companyId = companyId;
        this.vehicleNo = vehicleNo;
        this.licenseId = licenseId;
        this.startPlace = startPlace;
        this.destPlace = destPlace;
    }


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getDestPlace() {
        return destPlace;
    }

    public void setDestPlace(String destPlace) {
        this.destPlace = destPlace;
    }

    @Override
    public String toString() {
        return "PositionDriver{" +
                "companyId='" + companyId + '\'' +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", licenseId='" + licenseId + '\'' +
                ", startPlace='" + startPlace + '\'' +
                ", destPlace='" + destPlace + '\'' +
                '}';
    }
}
