package com.bkb.singleton

class singleTonExample {
    var editValue: String? = null
    companion object {


        private val ourInstance: singleTonExample = singleTonExample()
        fun getInstance(): singleTonExample? {
            return ourInstance
        }
    }

        fun setText(editValue: String?) {
            this.editValue = editValue
        }

        fun getText(): String? {
            return editValue
        }

}