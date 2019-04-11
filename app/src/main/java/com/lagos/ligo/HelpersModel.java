package com.lagos.ligo;

import java.util.ArrayList;

public class HelpersModel {
    private String company_name, type_of_help;


    public HelpersModel(String company_name, String type_of_help) {
        this.company_name = company_name;
        this.type_of_help = type_of_help;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getType_of_help() {
        return type_of_help;
    }

    public void setType_of_help(String type_of_help) {
        this.type_of_help = type_of_help;
    }


}
