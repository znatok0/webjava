package com.example.webjava;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class iinForm {

    @NotNull
    @Size(min=12, max=12)
    private String iin;

    private String getIIN(){
        return this.iin;
    }
    private void setIIN(String iin){
        this.iin = iin;
    }
    public String toString(){
        return "Your iin is:" + this.iin;
    }
}
