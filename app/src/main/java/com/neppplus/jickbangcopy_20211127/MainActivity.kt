package com.neppplus.jickbangcopy_20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20211127.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20211127.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomlist = ArrayList<RoomData>()
    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        arrayList의 add기능 활용 + 내부 재료로 Roomdata클래스의 생성자 활용
        mRoomlist.add( RoomData( 8000,"서울시 동대문구",5,"1번째 방입니다."))
        mRoomlist.add( RoomData( 18000,"서울시 서대문구",15,"2번째 방입니다."))
        mRoomlist.add( RoomData( 7000,"서울시 동대문구",4,"3번째 방입니다."))
        mRoomlist.add( RoomData( 9000,"서울시 동대문구",8,"4번째 방입니다."))
        mRoomlist.add( RoomData( 6000,"서울시 서대문구",-2,"5번째 방입니다."))
        mRoomlist.add( RoomData( 10,"서울시 종로구",90,"6번째 방입니다."))
        mRoomlist.add( RoomData( 9800,"서울시 동대문구",1,"7번째 방입니다."))
        mRoomlist.add( RoomData( 8635,"서울시 성동구",0,"8번째 방입니다."))
        mRoomlist.add( RoomData( 9845,"서울시 서대문구",-3,"9번째 방입니다."))
        mRoomlist.add( RoomData( 4583000,"서울시 동대문구",65,"10번째 방입니다."))
        mRoomlist.add( RoomData( 4583000,"서울시 남대문구",25,"11번째 방입니다."))

        mRoomAdapter = RoomAdapter( this, R.layout.room_list_item, mRoomlist)

        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomlist[position]

            val myIntent = Intent( this , ViewRoomDetailActivity::class.java)
            myIntent.putExtra("room",clickedRoom)
            startActivity(myIntent)

        }





    }
}