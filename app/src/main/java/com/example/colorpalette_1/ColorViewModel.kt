package com.example.colorpalette_1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.colorpalette_1.modal.Colors

class ColorViewModel: ViewModel() {

    var colors= MutableLiveData<List<Colors>>()


    fun refreshData(){
        val color1=Colors(1,"#08A6FF")
        val color2=Colors(2,"#FFBA08")
        val color3=Colors(2,"#A0D432")
        val color4=Colors(1,"#264653")
        val color5=Colors(2,"#2A9D8F")
        val color6=Colors(2,"#E9C46A")
        val color7=Colors(1,"#E07A5F")
        val color8=Colors(2,"#FFBA08")
        val color9=Colors(2,"#F48C06")
        val color10=Colors(1,"#E85D04")
        val color11=Colors(2,"#52B788")
        val color12=Colors(2,"#40916C")
        val color13=Colors(1,"#03045E")
        val color14=Colors(2,"#023E8A")
        val color15=Colors(2,"#0077B6")
        val color16=Colors(1,"#00B4D8")
        val color17=Colors(2,"#48CAE4")
        val color18=Colors(2,"#90E0EF")
        val color19=Colors(1,"#1B4332")
        val color20=Colors(2,"#2D6A4F")
        val color21=Colors(2,"#40916C")
        val color22=Colors(1,"#52B788")
        val color23=Colors(2,"#74C69D")
        val color24=Colors(2,"#95D5B2")
        var colorList= arrayListOf<Colors>(
            color1,color2,color3,color4,
            color5,color6,color7,color8,
            color9,color10,color11,color12,
            color13,color14,color15,color16
            ,color17,color18,color19,color20,color21
            ,color22,color23,color24)
        colors.value=colorList;
    }
}