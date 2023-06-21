package com.anushka.circlecalc

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

/**
 * Created by Djole on 14.06.2023..
 */
class MyCalcTest{

    private lateinit var myCalc: MyCalc

    @Before
    fun setUp() {
        myCalc = MyCalc()
    }

    @Test
    fun calculateCircumference_radiusGiven_returnsCorrectResult(){
//        myCalc = MyCalc()
        val result = myCalc.calculateCircumference(2.1)
        assertThat(result).isEqualTo(13.188) //13.188 smo dobili kalkulatorom
    }

    @Test
    fun calculateCircumference_zeroRadius_returnsCorrectResult(){
//        myCalc = MyCalc()
        val result = myCalc.calculateCircumference(0.0)
        assertThat(result).isEqualTo(0)
    }
}