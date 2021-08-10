package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {
    @CsvBindByName(column = "SrNo", required = true)
    public int srNo;

    @CsvBindByName(column = "StateName", required = true)
    public String stateName;

    @CsvBindByName(column = "TIN", required = true)
    public int TIN;

    @CsvBindByName(column = "StateCode", required = true)
    public String stateCode;

    @Override
    public String toString() {
        return "IndiaCensusCSV{" +
                "srNo=" + srNo +
                ", stateName='" + stateName + '\'' +
                ", TIN=" + TIN +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}
