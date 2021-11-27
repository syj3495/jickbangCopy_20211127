package com.neppplus.jickbangcopy_20211127.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy_20211127.datas.RoomData

class RoomAdapter(
    val mcontext : Context,
    val resId : Int,
    val mList: ArrayList<RoomData>
): ArrayAdapter<RoomData>(mcontext, resId, mList) {
}