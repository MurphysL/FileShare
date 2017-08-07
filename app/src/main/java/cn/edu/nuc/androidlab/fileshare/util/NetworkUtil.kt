package cn.edu.nuc.androidlab.fileshare.util

/**
 * Created by MurphySL on 2017/8/7.
 */
class NetworkUtil{

    companion object {
        @JvmStatic
        fun pingIpAddress(ipAdress : String) : Boolean{
            val process : Process = Runtime.getRuntime().exec("/system/bin/ping -c 1 -w 100" + ipAdress)
            val status = process.waitFor()

            return status == 0
        }
    }

}